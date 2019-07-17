package com.oms.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oms.entities.Category;
import com.oms.repositories.CategoryRepository;

@Service
public class CategoryServiceImpl implements CategoryService {
	@Autowired
	private CategoryRepository categoryRepository;

	@Override
	public void addCategory(Category category) {

		categoryRepository.save(category);
	}

	@Override
	public Optional<Category> getCategoriesById(int categoryId) {
		Optional<Category> category = categoryRepository.findById(categoryId);
		return category;
	}

}
