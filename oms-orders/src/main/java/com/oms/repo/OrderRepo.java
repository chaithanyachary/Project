package com.oms.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.oms.entity.Order;

@Repository
public interface OrderRepo extends JpaRepository<Order, Integer> {

}
