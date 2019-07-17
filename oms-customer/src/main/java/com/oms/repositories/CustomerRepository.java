package com.oms.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.oms.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer>{

}
