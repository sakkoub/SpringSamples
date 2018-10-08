package com.sampackage.repository;


import com.sampackage.model.Customer;

import java.util.ArrayList;
import java.util.List;

public class HibernateCustomerRepositoryImpl implements CustomerRepository {

    public List<Customer> findAll(){


        List<Customer> customers = new ArrayList<Customer>();
        Customer customer = new Customer();
        customer.setFirstname("Sam");
        customer.setLastname("Akkoub");

        customers.add(customer);
        return customers;

    }

}
