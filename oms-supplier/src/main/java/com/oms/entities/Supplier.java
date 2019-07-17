package com.oms.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "Suppliers")
@Entity
public class Supplier {
	@Id
	private int supplierId;
	private String companyName;
	private String contactName;
	private String contactTitle;
	private String address1;
	private String address2;
	private String city;
	private String state;
	private int postalCode;
	private String country;
	private int phone;
	private String email;
	private String url;
	private String paymentMethod;
	private String discountType;
	private String typeGoods;
	private String discountAvailable;
	private String currentOrder;
	private int customerId;
	public int getSupplierId() {
		return supplierId;
	}
	public void setSupplierId(int supplierId) {
		this.supplierId = supplierId;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getContactName() {
		return contactName;
	}
	public void setContactName(String contactName) {
		this.contactName = contactName;
	}
	public String getContactTitle() {
		return contactTitle;
	}
	public void setContactTitle(String contactTitle) {
		this.contactTitle = contactTitle;
	}
	public String getAddress1() {
		return address1;
	}
	public void setAddress1(String address1) {
		this.address1 = address1;
	}
	public String getAddress2() {
		return address2;
	}
	public void setAddress2(String address2) {
		this.address2 = address2;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(int postalCode) {
		this.postalCode = postalCode;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getPaymentMethod() {
		return paymentMethod;
	}
	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}
	public String getDiscountType() {
		return discountType;
	}
	public void setDiscountType(String discountType) {
		this.discountType = discountType;
	}
	public String getTypeGoods() {
		return typeGoods;
	}
	public void setTypeGoods(String typeGoods) {
		this.typeGoods = typeGoods;
	}
	public String getDiscountAvailable() {
		return discountAvailable;
	}
	public void setDiscountAvailable(String discountAvailable) {
		this.discountAvailable = discountAvailable;
	}
	public String getCurrentOrder() {
		return currentOrder;
	}
	public void setCurrentOrder(String currentOrder) {
		this.currentOrder = currentOrder;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	@Override
	public String toString() {
		return "Supplier [supplierId=" + supplierId + ", companyName=" + companyName + ", contactName=" + contactName
				+ ", contactTitle=" + contactTitle + ", address1=" + address1 + ", address2=" + address2 + ", city="
				+ city + ", state=" + state + ", postalCode=" + postalCode + ", country=" + country + ", phone=" + phone
				+ ", email=" + email + ", url=" + url + ", paymentMethod=" + paymentMethod + ", discountType="
				+ discountType + ", typeGoods=" + typeGoods + ", discountAvailable=" + discountAvailable
				+ ", currentOrder=" + currentOrder + ", customerId=" + customerId + "]";
	}

	

}
