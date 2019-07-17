package com.oms.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.oms.entities.Supplier;
@Repository
public interface SupplierRepository  extends JpaRepository<Supplier, Integer>{
public Optional<Supplier> findByCompanyName(String companyName);
}
