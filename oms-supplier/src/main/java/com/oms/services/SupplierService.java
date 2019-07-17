package com.oms.services;

import java.util.Optional;

import com.oms.entities.Supplier;

public interface SupplierService {
	public void addSupplier(Supplier supplier);

	public Optional<Supplier> getBySupplierId(int supplierId);

	public Optional<Supplier> getByCompanyName(String companyName);

	public void updateSupplier(Object object);
}
