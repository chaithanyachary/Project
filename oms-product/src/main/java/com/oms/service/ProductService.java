package com.oms.service;

import java.util.Optional;

import com.oms.entities.Product;

public interface ProductService {
public void addProduct(Product product);
public Optional<Product> getProductById(int productId);
}
