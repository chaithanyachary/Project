package com.oms.service;

import java.util.Optional;

import com.oms.entity.Customer;

public interface CustomerService {
public void addCustomer(Customer customer);
public Optional<Customer> getCustomerById(int customerId);
}
