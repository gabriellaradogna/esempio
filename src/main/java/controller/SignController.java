package controller;





import javax.servlet.http.HttpSession;
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
	public String getPage(Model model, HttpSession session){
		
		model.addAttribute("user", new User());
		if(session.getAttribute("loggedUser")==null)
			return "login";
		else 
			return "redirect:/userarea";
	}
	
	@PostMapping("/login")
	public String login(Model model, @RequestParam("username") String username, @RequestParam("password") String password, HttpSession session) 
	{
		for(User u : userDao.findAll()) {
			if(username.equals(u.getUsername()) && password.equals(u.getPassword())) {
				session.setAttribute("loggedUser", u);
				return "redirect:/userarea";
			}
		}
		return "redirect:/sign?le";
	}

	@PostMapping("/reg")
	public String userProva(@Valid @ModelAttribute("user") User user, BindingResult result, HttpSession session )
	{
		System.out.println(user.getFirst_name());
		userDao.save(user);
		session.setAttribute("loggedUser", user);
		return "redirect:/";
	}
}