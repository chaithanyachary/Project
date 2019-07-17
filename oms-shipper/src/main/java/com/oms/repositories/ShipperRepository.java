package com.oms.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.oms.entities.Shipper;

@Repository
public interface ShipperRepository extends JpaRepository<Shipper, Integer>{

}
