package model;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;





@Entity
@Table(name= "rental_cars")
public class RentalCars implements Serializable{

	
	private static final long serialVersionUID = 5275047123789155350L;


	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int id_rental;
	

	@ManyToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "id_user", referencedColumnName = "id_user")
	private User user;
	
	@ManyToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "id_car", referencedColumnName = "id_car")
	private Car car;
	
	@Column(name = "rental_start")
	private Date rental_start; 
	
	
	@Column(name = "rental_end")
	private Date rental_end;
	
	

	@Column
	private double total_price;


	
	public int getId_rental() {
		return id_rental;
	}

 void setId_rental(int id_rental) {
		this.id_rental = id_rental;
	}



	

	public User getUser() {
	return user;
}

public void setUser(User user) {
	this.user = user;
}

public Car getCar() {
	return car;
}

public void setCar(Car car) {
	this.car = car;
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
