package com.coffieshopmanager.concrete;

import com.coffieshopmanager.abstracts.PersonCheckService;
import com.coffieshopmanager.entities.Customer;

public class PersonCheckManager implements PersonCheckService {
    @Override
    public boolean checkIfRealPerson(Customer customer) {
        return true;
    }
}
