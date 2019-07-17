package com.oms.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "products")
public class Product {
	@Id
	private int productId;
	private String productType;
	private String vendorProductId;
	private String productName;
	private String productDescription;
	private int supplierId;
	private int categoryId;
	private int quantityPerUnit;
	private float unitPrice;
	private int availableSize;
	private String availableColors;
	private int size;
	private String color;
	private float discount;
	private int unitWeight;
	private int unitsInStock;
	private int unitsOnOrder;
	private String reorderLevel;
	private String productAvailable;
	private String discountAvailable;
	private int ranking;

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public String getVendorProductId() {
		return vendorProductId;
	}

	public void setVendorProductId(String vendorProductId) {
		this.vendorProductId = vendorProductId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public int getSupplierId() {
		return supplierId;
	}

	public void setSupplierId(int supplierId) {
		this.supplierId = supplierId;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public int getQuantityPerUnit() {
		return quantityPerUnit;
	}

	public void setQuantityPerUnit(int quantityPerUnit) {
		this.quantityPerUnit = quantityPerUnit;
	}

	public float getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(float unitPrice) {
		this.unitPrice = unitPrice;
	}

	public int getAvailableSize() {
		return availableSize;
	}

	public void setAvailableSize(int availableSize) {
		this.availableSize = availableSize;
	}

	public String getAvailableColors() {
		return availableColors;
	}

	public void setAvailableColors(String availableColors) {
		this.availableColors = availableColors;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public float getDiscount() {
		return discount;
	}

	public void setDiscount(float discount) {
		this.discount = discount;
	}

	public int getUnitWeight() {
		return unitWeight;
	}

	public void setUnitWeight(int unitWeight) {
		this.unitWeight = unitWeight;
	}

	public int getUnitsInStock() {
		return unitsInStock;
	}

	public void setUnitsInStock(int unitsInStock) {
		this.unitsInStock = unitsInStock;
	}

	public int getUnitsOnOrder() {
		return unitsOnOrder;
	}

	public void setUnitsOnOrder(int unitsOnOrder) {
		this.unitsOnOrder = unitsOnOrder;
	}

	public String getReorderLevel() {
		return reorderLevel;
	}

	public void setReorderLevel(String reorderLevel) {
		this.reorderLevel = reorderLevel;
	}

	public String getProductAvailable() {
		return productAvailable;
	}

	public void setProductAvailable(String productAvailable) {
		this.productAvailable = productAvailable;
	}

	public String getDiscountAvailable() {
		return discountAvailable;
	}

	public void setDiscountAvailable(String discountAvailable) {
		this.discountAvailable = discountAvailable;
	}

	public int getRanking() {
		return ranking;
	}

	public void setRanking(int ranking) {
		this.ranking = ranking;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productType=" + productType + ", vendorProductId="
				+ vendorProductId + ", productName=" + productName + ", productDescription=" + productDescription
				+ ", supplierId=" + supplierId + ", categoryId=" + categoryId + ", quantityPerUnit=" + quantityPerUnit
				+ ", unitPrice=" + unitPrice + ", availableSize=" + availableSize + ", availableColors="
				+ availableColors + ", size=" + size + ", color=" + color + ", discount=" + discount + ", unitWeight="
				+ unitWeight + ", unitsInStock=" + unitsInStock + ", unitsOnOrder=" + unitsOnOrder + ", reorderLevel="
				+ reorderLevel + ", productAvailable=" + productAvailable + ", discountAvailable=" + discountAvailable
				+ ", ranking=" + ranking + "]";
	}

}
