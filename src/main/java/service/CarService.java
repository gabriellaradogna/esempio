package service;

import java.util.List;

import model.Car;



public interface CarService {
	
	List<Car> getCars();
	Car getCarById(int id);
	List<Car> getCarByBrand(String brand);
	List<Car> getCarByCategory(String category);
	List<Car> getCarByModel(String model); //
	List<Car> getCarByPowerSupply(String powerSupply);
	List<Car> getCarByDayliPrice(double minPrice, double maxPrice);
	

}
