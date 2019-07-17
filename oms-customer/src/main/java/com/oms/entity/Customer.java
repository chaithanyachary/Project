package com.oms.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Table(name = "customers")
@Entity
public class Customer {
	@Id
	private int customerId;
	private String firstName;
	private String lastName;
	private String building;
	private String address1;
	private String address2;
	private String city;
	private String state;
	private int postalCode;
	private String country;
	private int phone;
	private String email;
	private String password;
	private String creditCard;
	private String creditCardTypeId;
	private String cardExpMo;
	private String cardExpYr;
	private String billingAddress;
	private String billingCity;
	private String billingRegion;
	private int billingPostalCode;
	private String billingCountry;
	private String shipAddress;
	private String shipCity;
	private String shipRegion;
	private int shipPostalCode;
	private String shipCountry;
	private String enteredDate;
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getBuilding() {
		return building;
	}
	public void setBuilding(String building) {
		this.building = building;
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCreditCard() {
		return creditCard;
	}
	public void setCreditCard(String creditCard) {
		this.creditCard = creditCard;
	}
	public String getCreditCardTypeId() {
		return creditCardTypeId;
	}
	public void setCreditCardTypeId(String creditCardTypeId) {
		this.creditCardTypeId = creditCardTypeId;
	}
	public String getCardExpMo() {
		return cardExpMo;
	}
	public void setCardExpMo(String cardExpMo) {
		this.cardExpMo = cardExpMo;
	}
	public String getCardExpYr() {
		return cardExpYr;
	}
	public void setCardExpYr(String cardExpYr) {
		this.cardExpYr = cardExpYr;
	}
	public String getBillingAddress() {
		return billingAddress;
	}
	public void setBillingAddress(String billingAddress) {
		this.billingAddress = billingAddress;
	}
	public String getBillingCity() {
		return billingCity;
	}
	public void setBillingCity(String billingCity) {
		this.billingCity = billingCity;
	}
	public String getBillingRegion() {
		return billingRegion;
	}
	public void setBillingRegion(String billingRegion) {
		this.billingRegion = billingRegion;
	}
	public int getBillingPostalCode() {
		return billingPostalCode;
	}
	public void setBillingPostalCode(int billingPostalCode) {
		this.billingPostalCode = billingPostalCode;
	}
	public String getBillingCountry() {
		return billingCountry;
	}
	public void setBillingCountry(String billingCountry) {
		this.billingCountry = billingCountry;
	}
	public String getShipAddress() {
		return shipAddress;
	}
	public void setShipAddress(String shipAddress) {
		this.shipAddress = shipAddress;
	}
	public String getShipCity() {
		return shipCity;
	}
	public void setShipCity(String shipCity) {
		this.shipCity = shipCity;
	}
	public String getShipRegion() {
		return shipRegion;
	}
	public void setShipRegion(String shipRegion) {
		this.shipRegion = shipRegion;
	}
	public int getShipPostalCode() {
		return shipPostalCode;
	}
	public void setShipPostalCode(int shipPostalCode) {
		this.shipPostalCode = shipPostalCode;
	}
	public String getShipCountry() {
		return shipCountry;
	}
	public void setShipCountry(String shipCountry) {
		this.shipCountry = shipCountry;
	}
	public String getEnteredDate() {
		return enteredDate;
	}
	public void setEnteredDate(String enteredDate) {
		this.enteredDate = enteredDate;
	}
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", building=" + building + ", address1=" + address1 + ", address2=" + address2 + ", city=" + city
				+ ", state=" + state + ", postalCode=" + postalCode + ", country=" + country + ", phone=" + phone
				+ ", email=" + email + ", password=" + password + ", creditCard=" + creditCard + ", creditCardTypeId="
				+ creditCardTypeId + ", cardExpMo=" + cardExpMo + ", cardExpYr=" + cardExpYr + ", billingAddress="
				+ billingAddress + ", billingCity=" + billingCity + ", billingRegion=" + billingRegion
				+ ", billingPostalCode=" + billingPostalCode + ", billingCountry=" + billingCountry + ", shipAddress="
				+ shipAddress + ", shipCity=" + shipCity + ", shipRegion=" + shipRegion + ", shipPostalCode="
				+ shipPostalCode + ", shipCountry=" + shipCountry + ", enteredDate=" + enteredDate + "]";
	}

	
}
