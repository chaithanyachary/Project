package com.oms.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.oms.entities.Payment;
import com.oms.service.PaymentService;

@RestController
@RequestMapping("/payment")
public class PaymentController {
	@Autowired
	private PaymentService paymentService;

	@PostMapping("/savePayment")
	public void addPayment(@RequestBody Payment payment) {
		paymentService.addPayment(payment);
	}

	@GetMapping("/getPaymentById")
	public Optional<Payment> getPaymentById(@RequestParam int paymentId) {
		Optional<Payment> payment = paymentService.getPayementById(paymentId);
		return payment;
	}
}
