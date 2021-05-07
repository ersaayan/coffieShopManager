package com.coffieshopmanager.adapters;

import Mernis.BGCKPSPublicSoap;
import com.coffieshopmanager.abstracts.PersonCheckService;
import com.coffieshopmanager.entities.Customer;

import java.util.Locale;

public class MernisServiceAdapter implements PersonCheckService {
    @Override
    public boolean checkIfRealPerson(Customer customer) throws Exception {
        Mernis.BGCKPSPublicSoap client =new BGCKPSPublicSoap();
        return client.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()),customer.getFirstname().toUpperCase(),customer.getLastname().toUpperCase(),customer.getBirthOfDate());
    }
}
