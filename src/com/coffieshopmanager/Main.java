package com.coffieshopmanager;

import com.coffieshopmanager.abstracts.BaseCustomerManager;
import com.coffieshopmanager.adapters.MernisServiceAdapter;
import com.coffieshopmanager.concrete.NeroCustomerManager;
import com.coffieshopmanager.concrete.StarbucksCustomerManager;
import com.coffieshopmanager.entities.Customer;

import java.util.Calendar;
import java.util.Date;

public class Main {

    public static void main(String[] args) throws Exception {
        BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
        customerManager.save(new Customer(1,
                "Eren Ali",
                "şavk",
                2003,
                "25672257590"));
    }
}
