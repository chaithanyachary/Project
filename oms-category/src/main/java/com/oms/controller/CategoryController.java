package com.oms.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.oms.entities.Category;
import com.oms.service.CategoryService;

@RestController
@RequestMapping("category")
public class CategoryController {
	@Autowired
	private CategoryService categoryService;

	@PostMapping("/saveCategory")
	public void addCategory(@RequestBody Category category) {
		categoryService.addCategory(category);
	}

	@GetMapping("/getCategoryById")
	public Optional<Category> getCategoryById(@RequestParam int categoryId) {
		Optional<Category> category = categoryService.getCategoriesById(categoryId);
		return category;
	}
}
