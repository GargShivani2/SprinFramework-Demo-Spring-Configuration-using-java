package com.pluralsight.service;

import com.pluralsight.model.Customer;
import com.pluralsight.repository.CustomerRepository;

import java.util.List;

public interface CustomerService {
    public List<Customer> findAll();

    void setCustomerRepository(CustomerRepository customerRepository);
}
