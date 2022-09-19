package controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import dao.CarDao;
import dao.UserDao;
import model.Car;
import service.CarService;
import service.CarServiceImpl;

@Controller
@RequestMapping(path = {"/", "/index", "/home"})
public class IndexController {
	
	
	@Autowired
	CarDao carDao;
	
	@Autowired
	CarServiceImpl carServiceImpl;
	

	
	@GetMapping
	public String getPage(Model model, @RequestParam(value = "category", required = false) String category,
			@RequestParam(value = "powerSupply", required = false) List<String> powerSupply,
			@RequestParam(value = "numberSeats", required = false) List<String> numberSeats,
			@)
	{
		List<Car> cars;
		
		if(category != null && powerSupply == null && numberSeats == null)
			cars = carDao.findByCategory(category);
		
		else if(category == null && powerSupply != null && numberSeats == null)
			cars = carDao.findByPowerSupplyIn(powerSupply);
		
		else if (category == null && powerSupply == null && numberSeats != null)
			cars = carDao.findByNumberSeatsIn(numberSeats);
		
		else if (category == null && powerSupply == null && numberSeats == null)
			cars = carDao.findAll();
		
		else if(category != null & powerSupply == null && numberSeats == null)
			cars = carDao.findByCategoryAndPowerSupplyInAndNumberSeatsIn(category, powerSupply, numberSeats);
		
		else if(category != null && powerSupply != null && numberSeats == null)
			cars = carDao.findByCategoryAndPowerSupplyIn(category, powerSupply);
		
		else if(category != null && numberSeats != null && powerSupply == null)
			cars = carDao.findByCategoryAndNumberSeatsIn(category, numberSeats);
		
		else if(category == null && powerSupply != null && numberSeats != null);
			cars = carDao.findByPowerSupplyInAndNumberSeatsIn(powerSupply, numberSeats);
		
			
			
	    model.addAttribute("cars", cars);
		return "index";
	}

}
