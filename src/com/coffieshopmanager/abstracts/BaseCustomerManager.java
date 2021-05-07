package com.coffieshopmanager.abstracts;

import com.coffieshopmanager.entities.Customer;

public abstract class BaseCustomerManager implements CustomerService{
    @Override
    public  void save(Customer customer) throws Exception {
        System.out.println("Saved to Db: " + customer.getFirstname());
    }
}
