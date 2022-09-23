package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.Valid;



@Entity
@Table(name = "cars")
public class Car implements Serializable{
	
	private static final long serialVersionUID = 5610287293442676523L;
	
	public Car() {};

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int id_car;
	
	
	@Column(name = "category")
	private String category;
	
	
	@Column(name = "brand")
	private String brand;
	
	
	@Column(name = "model")
	private String model;
	
	@Column(name = "power_supply")
	private String powerSupply;
	
	@Column(name = "displacement")
	private String displacement;
	
	@Column(name = "number_doors")
	private String numberDoors;
	
	@Column(name = "color")
	private String color;
	
	
	@Column(name = "daily_price")
	private double dailyPrice;
	
	@OneToMany(mappedBy = "car", cascade = CascadeType.MERGE, fetch = FetchType.EAGER, orphanRemoval = true)
	private List<RentalCars> rentalCars = new ArrayList();
	

	public List<RentalCars> getRentalCars() {
		return rentalCars;
	}


	public void setRentalCars(List<RentalCars> rentalCars) {
		this.rentalCars = rentalCars;
	}


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


	public String getNumberDoors() {
		return numberDoors;
	}


	public void setNumberDoors(String numberDoors) {
		this.numberDoors = numberDoors;
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
