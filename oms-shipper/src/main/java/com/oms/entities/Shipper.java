package com.oms.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "Shippers")
@Entity
public class Shipper {
	@Id
	private int shipperId;
	private String companyName;
	private int phone;

	public int getShipperId() {
		return shipperId;
	}

	public void setShipperId(int shipperId) {
		this.shipperId = shipperId;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Shipper [shipperId=" + shipperId + ", companyName=" + companyName + ", phone=" + phone + "]";
	}

}
