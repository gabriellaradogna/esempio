package service;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import model.Car;
import model.RentalCars;

@Service
public class CarServiceImpl implements CarService{

	@Override
	public List<Car> filterByPrice(List<Car> cars, Double price) {
		
		List<Car> carsPrice = new ArrayList();
		if(price != null) {
		for(Car car : cars)
			if(car.getDailyPrice()>price)
				carsPrice.add(car);	
		}
		cars.removeAll(carsPrice);
		return cars;
	}

	@Override
	public List<Car> filterByDate(List<Car> cars, Date dateStart, Date dateEnd) {
		
		List<Car> carsDate = new ArrayList();
		if(dateStart!= null && dateEnd!= null) {
		for(Car c : cars) {
			List<RentalCars> prenotazioni = c.getRentalCars();
			for(RentalCars rc : prenotazioni) {
				if((rc.getRental_start().compareTo(dateStart)>=0 && rc.getRental_start().compareTo(dateEnd)>=0 )
						|| (rc.getRental_start().compareTo(dateStart)<=0 && rc.getRental_end().compareTo(dateEnd)>=0)) {
					carsDate.add(c);
					}
					
				}
			}
		}
		cars = carsDate;
		return cars;
	}

}
