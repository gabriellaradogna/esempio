package controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import dao.UserDao;
import model.User;

@Controller
@RequestMapping("/userarea")
public class UserAreaController {
	
	@Autowired
	UserDao userDao;
	
	@GetMapping
	public String getPage(HttpSession session, Model model) {
		if(session.getAttribute("loggedUser") == null)
			return "redirect:/sign";
		model.addAttribute("loggedUser", session.getAttribute("loggedUser"));
		
		
		return "userarea";
		
	}
	
	@GetMapping("logout")
		public String logout(HttpSession session) {
		session.removeAttribute("loggedUser");
		return "redirect:/";
	}
	
	@PostMapping("/mod")
		public String mod(HttpSession session,
				@RequestParam("nome") String first_name,
				@RequestParam("cognome") String last_name,
				@RequestParam("telefono") String telephone,
				@RequestParam("email") String mail,
				@RequestParam("codice_fiscale") String fiscal_code,
				@RequestParam("ragione_sociale") String business_name,
				@RequestParam("partita_iva") String vat_number,
				@RequestParam("indirizzo") String address,
				@RequestParam("localita") String locality,
				@RequestParam("provincia") String province,
				@RequestParam("cap") String postal_code,
				@RequestParam("username") String username){
		
		User u = (User)session.getAttribute("loggedUser");
		
		u.setFirst_name(first_name);
		u.setLast_name(last_name);
		u.setTelephone(telephone);
		u.setMail(mail);
		u.setFiscal_code(fiscal_code);
		u.setBusiness_name(business_name);
		u.setVat_number(vat_number);
		u.setAddress(address);
		u.setLocality(locality);
		u.setProvince(province);
		u.setPostal_code(postal_code);
		u.setUsername(username);
		userDao.save(u);
		return"redirect:/userarea";	
	}
	
	@PostMapping("/modpw")
	public String modpw(HttpSession session, @RequestParam ("pw1") String pw1, @RequestParam("pw2") String pw2) {
		
		User u = (User) session.getAttribute("loggedUser");
		if(pw1.equals(u.getPassword())) {
			u.setPassword(pw2);
			userDao.save(u); 
		}
		return "redirect:/userarea";
	}
	
}
