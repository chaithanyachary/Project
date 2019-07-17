package com.oms.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.oms.entities.Supplier;
import com.oms.services.SupplierService;

@RestController
@RequestMapping("/supplier")
public class SupplierController {
	@Autowired
	private SupplierService supplierService;

	@PostMapping("/saveSupplier")
	public void addSupplier(@RequestBody Supplier supplier) {
		supplierService.addSupplier(supplier);
	}

	@GetMapping("/getBySupplierId")
	public Optional<Supplier> getBySupplierId(@RequestParam int supplierId) {
		Optional<Supplier> supplier = supplierService.getBySupplierId(supplierId);
		return supplier;
	}

	@GetMapping("/getByCompanyName")
	public Optional<Supplier> getByCompanyName(@RequestParam String companyName) {
		Optional<Supplier> supplier = supplierService.getByCompanyName(companyName);
		return supplier;
	}
}
