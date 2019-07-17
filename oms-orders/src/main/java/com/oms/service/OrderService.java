package com.oms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oms.entity.Order;
import com.oms.repo.OrderRepo;

@Service
public class OrderService {
	@Autowired
	private OrderRepo orderRepo;

	public List<Order> getallorders() {
		List<Order> list = orderRepo.findAll();
		return list;
	}
}
