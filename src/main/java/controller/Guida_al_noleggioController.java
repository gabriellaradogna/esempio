package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/guidaAlNoleggio")
public class Guida_al_noleggioController {

	@GetMapping
	public String getPage(Model model) {
		
		
		return "guida_al_noleggio";
	}
	
}
