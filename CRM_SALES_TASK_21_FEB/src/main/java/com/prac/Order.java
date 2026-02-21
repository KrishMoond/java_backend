package com.prac;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Order {

	@Id
	private long oId;
	private String date;
	private String totalAmount;
	
	public long getoId() {
		return oId;
	}
	public void setoId(long oId) {
		this.oId = oId;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}
}
