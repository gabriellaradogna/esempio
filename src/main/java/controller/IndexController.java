package controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import dao.CarDao;
import model.Car;

@Controller
@RequestMapping(path = {"/", "/index", "/home"})
public class IndexController {
	
	
	@Autowired
	CarDao carDao;
	
	
	@GetMapping
	public String getPage(Model model, @RequestParam(value = "category", required = false) String category)
	{
		List<Car> cars;
		
		if(category == null)
			cars = carDao.findAll();
		else 
			cars = carDao.findByCategory(category);
		
		model.addAttribute("cars", cars);
		return "index";
	}

}
