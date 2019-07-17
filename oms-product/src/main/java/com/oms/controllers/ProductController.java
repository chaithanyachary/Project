package com.oms.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.oms.entities.Product;
import com.oms.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {
	@Autowired
	private ProductService productService;

	@PostMapping("/saveProduct")
	public void addProduct(@RequestBody Product product) {
		productService.addProduct(product);
	}

	@GetMapping("/getProductById")
	public Optional<Product> getProductById(@RequestParam int productId) {
		Optional<Product> product = productService.getProductById(productId);
		return product;
	}

}
