package dao;

import org.springframework.data.jpa.repository.JpaRepository;

import model.RentalCars;

public interface RentalCarsDao extends JpaRepository<RentalCars, Integer>{

}
