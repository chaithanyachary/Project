package com.oms.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.oms.entities.Payment;
import com.oms.repositories.PaymentRepository;

@Repository
public class PaymentServiceImpl implements PaymentService {
	@Autowired
	private PaymentRepository paymentRepository;

	@Override
	public void addPayment(Payment payment) {
		paymentRepository.save(payment);
	}

	@Override
	public Optional<Payment> getPayementById(int paymentId) {
		Optional<Payment> payment = paymentRepository.findById(paymentId);
		return payment;
	}

}
