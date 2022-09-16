package model;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;





@Entity
@Table(name= "rental_cars")
public class RentalCars implements Serializable{

	
	private static final long serialVersionUID = 5275047123789155350L;


	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int id_rental;
	

	@Column
	private int id_user;
	
	@Column
	private int id_car;
	
	@Column
	private Date rental_start; 
	
	
	@Column
	private Date rental_end;
	
	

	@Column
	private double total_price;


	
	public int getId_rental() {
		return id_rental;
	}

 void setId_rental(int id_rental) {
		this.id_rental = id_rental;
	}



	public int getId_user() {
		return id_user;
	}


	
	public void setId_user(int id_user) {
		this.id_user = id_user;
	}


	
	public int getId_car() {
		return id_car;
	}



	public void setId_car(int id_car) {
		this.id_car = id_car;
	}


	public Date getRental_start() {
		return rental_start;
	}


	public void setRental_start(Date rental_start) {
		this.rental_start = rental_start;
	}


	public Date getRental_end() {
		return rental_end;
	}


	public void setRental_end(Date rental_end) {
		this.rental_end = rental_end;
	}

	public Double getTotal_price() {
		return total_price;
	}


	public void setTotal_price(Double total_price) {
		this.total_price = total_price;
	}
	
}
