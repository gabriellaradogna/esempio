package dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import model.Car;

public interface CarDao extends JpaRepository<Car, Integer>{
	
	List<Car> findAll();
	//query singole
	List<Car> findByCategory(String category);
	List<Car> findByPowerSupplyIn(List<String> powerSupply);
	List<Car> findByNumberSeatsIn(List<String> numberSeats);
	//query multiple
	List<Car> findByCategoryAndPowerSupplyIn(String category, List<String> powerSupply);
	List<Car> findByCategoryAndNumberSeatsIn(String category, List<String> numberSeats);
	List<Car> findByPowerSupplyInAndNumberSeatsIn(List<String> powerSupply, List<String> numberSeats);
	
	List<Car> findByCategoryAndPowerSupplyInAndNumberSeatsIn(String category, List<String> powerSupply, List<String> numberSeats);
}
