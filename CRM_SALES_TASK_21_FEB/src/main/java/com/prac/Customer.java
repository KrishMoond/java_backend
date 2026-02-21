package com.prac;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Customer {
	@Id
	private long cid;
	private String email;
	private String name;
	private String phone;
	
	
	@OneToMany
	private List<Order> Orders; 
	
	@OneToOne
	private Address add;
	
	public List<Order> getOrders() {
		return Orders;
	}
	public void setOrders(List<Order> orders) {
		Orders = orders;
	}
	public double getCid() {
		return cid;
	}
	public void setCid(long cid) {
		this.cid = cid;
	}
	public Address getAdd() {
		return add;
	}
	public void setAdd(Address add) {
		this.add = add;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
}
