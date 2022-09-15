package dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import model.Car;

public interface CarDao extends JpaRepository<Car, Integer>{
	
	List<Car> findAll();
	List<Car> findByCategory(String category);

}
