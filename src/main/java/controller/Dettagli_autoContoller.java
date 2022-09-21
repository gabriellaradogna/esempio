package controller;

import java.util.Optional;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;




import dao.CarDao;
import model.Car;
import service.CarService;

@Controller
@RequestMapping("/dettagli")
public class Dettagli_autoContoller {
	
	@Autowired
	CarDao carDao;
	
	@Autowired
	CarService carService;
	
	
	@GetMapping
	public String getPage(Model model,
			@RequestParam(value = "idCar", required = true) int idCar) {

		Car car = carService.getById(idCar);
		model.addAttribute("car", car);
		return "dettagli_auto";
		
	}

}
