package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home/dettagli")
public class Dettagli_autoContoller {
	
	@GetMapping
	public String getPage(Model model) {
		
		return "dettagli_auto";
		
	}

}
