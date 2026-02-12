package com.prac;

import javax.persistence.Entity;
import javax.persistence.*;

@Entity
@Table(name="Info")
public class Student {
	@Id
	private int id;
	private String name;
	private double percentage;
	private String dob;
	
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
	
	public double getPercent() {
		return percentage;
	}
	
	public void setPer(double percentage) {
		this.percentage=percentage;
	}
	
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob=dob;
	}
}
