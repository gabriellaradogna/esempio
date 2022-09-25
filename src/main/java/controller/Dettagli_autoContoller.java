package controller;

import java.sql.Date;
import java.util.Optional;

import javax.servlet.http.HttpSession;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;




import dao.CarDao;
import dao.RentalCarsDao;
import model.Car;
import model.RentalCars;
import model.User;
import service.CarService;

@Controller
@RequestMapping("/dettagli")
public class Dettagli_autoContoller {
	
	@Autowired
	CarDao carDao;
	
	@Autowired
	CarService carService;
	
	@Autowired
	RentalCarsDao rentalCarsDao;
	
	
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

	@PostMapping("/pren")
	public String rentCar(Model model, HttpSession session,
			@RequestParam("idCar") Integer idCar,
			@RequestParam("dateStart") Date dateStart,
			@RequestParam("dateEnd") Date dateEnd) {
		RentalCars rC = new RentalCars();
		Car car = carService.getById(idCar);
		
		
		if(session.getAttribute("loggedUser")==null)
		{
			return "redirect:/dettagli?idCar="+idCar+"&ue";
		}
		User user = (User)session.getAttribute("loggedUser");
		if(carService.checkDate(car, dateStart, dateEnd))
			{
		rC.setCar(car);
		rC.setUser(user);
		rC.setRental_start(dateStart);
		rC.setRental_end(dateEnd);
		rentalCarsDao.saveAndFlush(rC);
		
		return "redirect:/dettagli?idCar="+idCar+"&pc";
			}else {
				return "redirect:/dettagli?idCar="+idCar+"&pe";
			}
	}
	
}
