package service;

import java.sql.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import model.Car;

@Service
public class CarServiceImpl implements CarService{

	@Override
	public List<Car> filterByPrice(List<Car> cars, double price) {
		for(Car car : cars)
			if(car.getDailyPrice()>=price)
				cars.remove(car);		
		return cars;
	}

	@Override
	public List<Car> filterByDate(List<Car> cars, Date dateStart, Date dateEnd) {
	
		return null;
	}

}
