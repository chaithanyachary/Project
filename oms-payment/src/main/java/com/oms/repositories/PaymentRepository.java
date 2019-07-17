package com.oms.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.oms.entities.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Integer>{

}
