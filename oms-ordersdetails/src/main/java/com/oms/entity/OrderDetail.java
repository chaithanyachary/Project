package com.oms.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="order_details")
public class OrderDetail 
{
	@Id
	private int orderDetailsId;
	
	private int orderId;
	private int productId;
	private int orderNumber;
	private float price;
	private int quantity;
	private float discount;
	private float total;
	private int size;
	private String color;
	private String shipDate;
	private String billDate;
	
	public int getOrderDetailsId() {
		return orderDetailsId;
	}


	public void setOrderDetailsId(int orderDetailsId) {
		this.orderDetailsId = orderDetailsId;
	}


	public int getOrderId() {
		return orderId;
	}


	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}


	public int getProductId() {
		return productId;
	}


	public void setProductId(int productId) {
		this.productId = productId;
	}


	public int getOrderNumber() {
		return orderNumber;
	}


	public void setOrderNumber(int orderNumber) {
		this.orderNumber = orderNumber;
	}


	public float getPrice() {
		return price;
	}


	public void setPrice(float price) {
		this.price = price;
	}


	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	public float getDiscount() {
		return discount;
	}


	public void setDiscount(float discount) {
		this.discount = discount;
	}


	public float getTotal() {
		return total;
	}


	public void setTotal(float total) {
		this.total = total;
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


	public String getShipDate() {
		return shipDate;
	}


	public void setShipDate(String shipDate) {
		this.shipDate = shipDate;
	}


	public String getBillDate() {
		return billDate;
	}


	public void setBillDate(String billDate) {
		this.billDate = billDate;
	}


	@Override
	public String toString() {
		return "OrderDetail [orderDetailsId=" + orderDetailsId + ", orderId=" + orderId + ", productId=" + productId
				+ ", orderNumber=" + orderNumber + ", price=" + price + ", quantity=" + quantity + ", discount="
				+ discount + ", total=" + total + ", size=" + size + ", color=" + color + ", shipDate=" + shipDate
				+ ", billDate=" + billDate + "]";
	}
	
}
