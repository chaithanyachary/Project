package com.oms.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oms.entities.Supplier;
import com.oms.repositories.SupplierRepository;

@Service
public class SupplierServiceImpl implements SupplierService {
	@Autowired
	private SupplierRepository supplierRepository;

	@Override
	public void addSupplier(Supplier supplier) {
		supplierRepository.save(supplier);
	}

	@Override
	public Optional<Supplier> getBySupplierId(int supplierId) {
		Optional<Supplier> supplier = supplierRepository.findById(supplierId);
		return supplier;
	}

	@Override
	public Optional<Supplier> getByCompanyName(String companyName) {
		Optional<Supplier> supplier = supplierRepository.findByCompanyName(companyName);
		return supplier;
	}

	@Override
	public void updateSupplier(Object object) {

	}

}
