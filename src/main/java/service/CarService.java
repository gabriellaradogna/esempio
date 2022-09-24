package service;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import dao.CarDao;
import model.Car;



public interface CarService {
	
	Car getById(Integer id_car);
	List<Car> filterByPrice(List<Car> cars, Double price);
	List<Car> filterByDate(List<Car> cars, Date dateStart, Date dateEnd);
	boolean checkDate(Car car, Date dateStart, Date dateEnd);

}
