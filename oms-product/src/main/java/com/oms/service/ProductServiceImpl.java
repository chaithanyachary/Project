package com.oms.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oms.entities.Product;
import com.oms.repositories.ProductRepository;
@Service
public class ProductServiceImpl implements ProductService {
	@Autowired
	private ProductRepository productRepository;

	@Override
	public void addProduct(Product product) {
		productRepository.save(product);
	}

	@Override
	public Optional<Product> getProductById(int productId) {
		Optional<Product> product = productRepository.findById(productId);
		return product;
	}

}
