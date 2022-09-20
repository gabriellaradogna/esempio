package dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import model.Car;

public interface CarDao extends JpaRepository<Car, Integer>{
	
	List<Car> findAll();
	//query singole
	List<Car> findByCategory(String category);
	List<Car> findByPowerSupplyIn(List<String> powerSupply);
	List<Car> findByNumberDoorsIn(List<String> numberDoors); 
	//query multiple
	List<Car> findByCategoryAndPowerSupplyIn(String category, List<String> powerSupply); 
	List<Car> findByCategoryAndNumberDoorsIn(String category, List<String> numberDoors);
	List<Car> findByPowerSupplyInAndNumberDoorsIn(List<String> powerSupply, List<String> numberDoors);
	
	List<Car> findByCategoryAndPowerSupplyInAndNumberDoorsIn(String category, List<String> powerSupply, List<String> numberDoors);
}
