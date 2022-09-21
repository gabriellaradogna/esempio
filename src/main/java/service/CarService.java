package service;

import java.sql.Date;
import java.util.List;

import model.Car;



public interface CarService {
	
	List<Car> filterByPrice(List<Car> cars, Double price);
	List<Car> filterByDate(List<Car> cars, Date dateStart, Date dateEnd);
	

}
