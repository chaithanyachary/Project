package com.oms.service;

import java.util.Optional;

import com.oms.entities.Payment;

public interface PaymentService {
	public void addPayment(Payment payment);

	public Optional<Payment> getPayementById(int paymentId);
}
