package com.oms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.oms.entity.Order;
import com.oms.service.OrderService;

@RestController
@RequestMapping("/order")
public class OrderController 
{
	
	@Autowired
	private OrderService orderService;
	
	@GetMapping("/getall")
	public List<Order> getallorders() 
	{
	List<Order> orders =	orderService.getallorders();
	return orders;
	}
}