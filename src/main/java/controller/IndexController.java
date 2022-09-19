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
	

	

	
	@GetMapping
	public String getPage(Model model, @RequestParam(value = "category", required = false) String category,
			@RequestParam(value = "powerSupply", required = false) List<String> powerSupply,
			@RequestParam(value = "numberDoors", required = false) List<String> numberDoors
			)
	{
		List<Car> cars;
		cars = carDao.findAll();
		if(category != null && powerSupply == null && numberDoors == null)
			cars = carDao.findByCategory(category);
		
		else if(category == null && powerSupply != null && numberDoors == null)
			cars = carDao.findByPowerSupplyIn(powerSupply);
		
		else if (category == null && powerSupply == null && numberDoors != null)
			cars = carDao.findByNumberDoorsIn(numberDoors);
		
		else if (category == null && powerSupply == null && numberDoors == null)
			cars = carDao.findAll();
		
		else if(category != null & powerSupply == null && numberDoors == null)
			cars = carDao.findByCategoryAndPowerSupplyInAndNumberDoorsIn(category, powerSupply, numberDoors);
		
		else if(category != null && powerSupply != null && numberDoors == null)
			cars = carDao.findByCategoryAndPowerSupplyIn(category, powerSupply);
		
		else if(category != null && numberDoors != null && powerSupply == null)
			cars = carDao.findByCategoryAndNumberDoorsIn(category, numberDoors);
		
		else if(category == null && powerSupply != null && numberDoors != null);
			cars = carDao.findByPowerSupplyInAndNumberDoorsIn(powerSupply, numberDoors);
		
			
			
	    model.addAttribute("cars", cars);
		return "index";
	}

}
