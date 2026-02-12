package one_to_one_mapping;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Car {
	@Id
	private int id;
	private String brand;
	private String colour;
	private String model;
	private String modealYear;
	private double price;
	
	@OneTOne
	private Engine engine;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBrand() {
		return brand;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getModealYear() {
		return modealYear;
	}
	public void setModealYear(String modealYear) {
		this.modealYear = modealYear;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Car [id=" + id + ", brand=" + brand + ", colour=" + colour + ", model=" + model + ", modealYear="
				+ modealYear + ", price=" + price + "]";
	}
	
}