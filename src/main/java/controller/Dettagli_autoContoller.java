package controller;

import java.util.Optional;

import javax.servlet.http.HttpSession;

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
import model.User;
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
			@RequestParam(value = "idCar", required = true) int idCar, HttpSession session) {
		
		model.addAttribute("dateStart", session.getAttribute("dateStart"));
		model.addAttribute("dateEnd", session.getAttribute("dateEnd"));
		
		Car car = carService.getById(idCar);
		model.addAttribute("car", car);
		
		if(session.getAttribute("loggedUser")!=null)
			model.addAttribute("preUser", session.getAttribute("loggedUser"));
		else
			model.addAttribute("preUser", new User());
		
		return "dettagli_auto";
		
	}

}
