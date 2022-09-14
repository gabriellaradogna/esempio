package model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "cars")
public class Car implements Serializable{
	
	private static final long serialVersionUID = 5610287293442676523L;


	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int id_car;
	
	
	@Column(name = "category")
	private String category;
	
	
	@Column(name = "brand")
	private String brand;
	
	
	@Column(name = "model")
	private String model;
	
	@Column(name = "powerSupply")
	private String powerSupply;
	
	@Column(name = "displacement")
	private String displacement;
	
	@Column(name = "number_seat")
	private String numberSeats;
	
	@Column(name = "color")
	private String color;
	
	
	@Column(name = "daily_price")
	private double dailyPrice;


	public int getId_car() {
		return id_car;
	}


	public void setId_car(int id_car) {
		this.id_car = id_car;
	}


	public String getCategory() {
		return category;
	}


	public void setCategory(String category) {
		this.category = category;
	}


	public String getBrand() {
		return brand;
	}


	public void setBrand(String brand) {
		this.brand = brand;
	}


	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}


	public String getPowerSupply() {
		return powerSupply;
	}


	public void setPowerSupply(String powerSupply) {
		this.powerSupply = powerSupply;
	}


	public String getDisplacement() {
		return displacement;
	}


	public void setDisplacement(String displacement) {
		this.displacement = displacement;
	}


	public String getNumberSeats() {
		return numberSeats;
	}


	public void setNumberSeats(String numberSeats) {
		this.numberSeats = numberSeats;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public double getDailyPrice() {
		return dailyPrice;
	}


	public void setDailyPrice(double dailyPrice) {
		this.dailyPrice = dailyPrice;
	}
	
	

}
