package com.oms.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Table(name="category")
@Entity
public class Category {
	@Id
	private int categoryId;
	private String categoryName;
	private String description;
	private String active;

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getActive() {
		return active;
	}

	public void setActive(String active) {
		this.active = active;
	}

	@Override
	public String toString() {
		return "Category [categoryId=" + categoryId + ", categoryName=" + categoryName + ", description=" + description
				+ ", active=" + active + "]";
	}

}
