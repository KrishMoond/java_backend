package com.prac;

import javax.persistence.Entity;
import javax.persistence.*;

@Entity
@Table(name="Emp_info")
public class Employee {
	@Id
	@Column(name="Emp_id")
	private int id;
	@Column(name="Emp_name")
	private String name;
	@Column(name="Emp_sal")
	private double sal;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id=id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public double getSal() {
		return sal;
	}
	
	public void setId(double percentage) {
		this.sal=sal;
	}
}
