package com.sampackage.service;



import com.sampackage.model.Customer;
import com.sampackage.repository.CustomerRepository;
import com.sampackage.repository.HibernateCustomerRepositoryImpl;

import java.util.List;

public class CustomerServiceImpl implements CustomerService {

    private CustomerRepository customerRepository = new HibernateCustomerRepositoryImpl();


    public List<Customer> findAll(){
        return customerRepository.findAll();
    }
}

