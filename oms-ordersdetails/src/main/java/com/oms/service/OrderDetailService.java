package com.oms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oms.entity.OrderDetail;
import com.oms.repository.OrderDetailRepository;

@Service
public class OrderDetailService {
	@Autowired
	private OrderDetailRepository orderDetailRepository;
	
	public List<OrderDetail> getallorderdetails(OrderDetail orderDetail)
	{
		List<OrderDetail> list = orderDetailRepository.findAll();
		return list;
	}
}
