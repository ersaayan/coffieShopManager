package com.coffieshopmanager.abstracts;

import com.coffieshopmanager.entities.Customer;

public interface CustomerService {
    void save(Customer customer) throws Exception;
}
