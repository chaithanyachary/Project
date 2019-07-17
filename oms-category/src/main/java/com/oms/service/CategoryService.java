package com.oms.service;

import java.util.Optional;

import com.oms.entities.Category;

public interface CategoryService {
	public void addCategory(Category category);

	public Optional<Category> getCategoriesById(int categoryId);
}
