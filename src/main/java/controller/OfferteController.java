package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home/offerte")

public class OfferteController {
	
	
	@GetMapping
	public String getPage(Model model) {
		
		
		return "offerte";
	}


}
