package dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import model.RentalCars;
import model.User;

public interface RentalCarsDao extends JpaRepository<RentalCars, Integer>{
 List<RentalCars> findByUser(User user);
}
