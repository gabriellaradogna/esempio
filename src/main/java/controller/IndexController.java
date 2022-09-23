package controller;



import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import dao.CarDao;

import model.Car;
import service.CarService;


@Controller
@RequestMapping(path = {"/", "/index", "/home"})
public class IndexController { 
	
	
	@Autowired
	CarDao carDao;
	
	@Autowired
	CarService carService;
	

	@GetMapping
	public String getPage(Model model, 
			@RequestParam(value = "category", required = false) String category,
			@RequestParam(value = "powerSupply", required = false) List<String> powerSupply,
			@RequestParam(value = "numberDoors", required = false) List<String> numberDoors,
			@RequestParam(value = "price", required = false) Double price,
			@RequestParam(value = "dateStart", required = false) Date dateStart,
			@RequestParam(value = "dateEnd", required = false) Date dateEnd,
			HttpSession session)
	{
		List<Car> cars;
		cars = carDao.findAll();
		
		java.util.Date tD = new java.util.Date();
		String todayDate = new SimpleDateFormat("yyyy-MM-dd").format(tD);
		
		model.addAttribute("todayDate", todayDate);
		
		if(category == null && numberDoors == null && powerSupply == null)
			cars = carDao.findAll();
		else if(category != null && powerSupply == null && numberDoors == null)
			cars = carDao.findByCategory(category);
		
		else if(category == null && powerSupply != null && numberDoors != null) {
			cars = carDao.findByPowerSupplyInAndNumberDoorsIn(powerSupply, numberDoors);
		}
		
		else if(category == null && powerSupply != null && numberDoors == null)
			cars = carDao.findByPowerSupplyIn(powerSupply);
		 	
		else if (category == null && powerSupply == null && numberDoors != null)
			cars = carDao.findByNumberDoorsIn(numberDoors);
		
		else if(category != null && powerSupply != null && numberDoors != null)
			cars = carDao.findByCategoryAndPowerSupplyInAndNumberDoorsIn(category, powerSupply, numberDoors);
		
		else if(category != null && powerSupply != null && numberDoors == null)
			cars = carDao.findByCategoryAndPowerSupplyIn(category, powerSupply);
		
		else if(category != null && numberDoors != null && powerSupply == null)
			cars = carDao.findByCategoryAndNumberDoorsIn(category, numberDoors);
		
		carService.filterByPrice(cars, price);
			
		carService.filterByDate(cars, dateStart, dateEnd);
			
	    model.addAttribute("cars", cars);
	    session.setAttribute("dateStart", dateStart);
	    session.setAttribute("dateEnd", dateEnd);
		return "index";
	}

}
