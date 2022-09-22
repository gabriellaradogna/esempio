package controller;



import java.sql.Date;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import dao.UserDao;
import model.User;


@Controller
@RequestMapping("/sign")
public class SignController {
	
	@Autowired
	UserDao userDao;

	@GetMapping
	public String getPage(Model model){
		
		model.addAttribute("user", new User());
		
		return "login";
	}
	
	@PostMapping("/login")
	public String login(Model model, @RequestParam("username") String username, @RequestParam("password") String password) 
	{
		for(User u : userDao.findAll()) {
			if(username.equals(u.getUsername()) && password.equals(u.getPassword())) {
				model.addAttribute("loggedUser", u);
				return "userarea";
			}
		}
		return "redirect:/sign?le";
	}
	
	@PostMapping("/signup")
	public String signup(Model model, 
			@RequestParam("nome") String nome,
			@RequestParam("cognome") String cognome,
			@RequestParam("genere") String genere,
			@RequestParam("date") Date date,
			@RequestParam("email") String email,
			@RequestParam("username") String username,
			@RequestParam("password") String password
			)
	{
		return "userarea";
	}

	@PostMapping("/reg")
	public String userProva(@Valid @ModelAttribute("user") User user, BindingResult result )
	{
		System.out.println(user.getFirst_name());
		return null;
	}
}