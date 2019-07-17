package com.oms.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.oms.entities.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer>{
	

}
