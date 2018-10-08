package com.sampackage.repository;

import com.sampackage.model.Customer;

import java.util.List;

public interface CustomerRepository {
    List<Customer> findAll();
}
