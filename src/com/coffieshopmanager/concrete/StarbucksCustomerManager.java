package com.coffieshopmanager.concrete;

import com.coffieshopmanager.abstracts.BaseCustomerManager;
import com.coffieshopmanager.abstracts.PersonCheckService;
import com.coffieshopmanager.entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager{

    private PersonCheckService _personCheckService;

    public StarbucksCustomerManager(PersonCheckService personCheckService) {
        _personCheckService = personCheckService;
    }
    @Override
    public void save(Customer customer) throws Exception {
        if(_personCheckService.checkIfRealPerson(customer)){
            super.save(customer);
        }else{
            System.out.println("Kişi doğrulaması başarısız. Lütfen bilgilerinizi kontrol ediniz.");
        }
    }



}
