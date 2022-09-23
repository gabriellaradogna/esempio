package controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/userarea")
public class UserAreaController {
	
	@GetMapping
	public String getPage(HttpSession session) {
		if(session.getAttribute("loggedUser") == null)
			return "redirect:/sign";
		return "userarea";
		
	}
	
	

}
