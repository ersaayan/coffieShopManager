package com.coffieshopmanager.abstracts;

import com.coffieshopmanager.entities.Customer;

public interface PersonCheckService {
    boolean checkIfRealPerson(Customer customer) throws Exception;
}
