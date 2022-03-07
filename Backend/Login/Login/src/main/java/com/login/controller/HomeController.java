package com.login.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.login.entity.Admins;
import com.login.repository.UserRepository;

@Controller
public class HomeController {
	
	
	@Autowired
	private BCryptPasswordEncoder passwordEncode;

	@Autowired
	private UserRepository userRepo;
	

	
	@GetMapping("/policy")
	public String policy() {
		return "policy";
	}
	
	@GetMapping("/contact")
	public String contact() {
		return "contact";
	}
	
	@GetMapping("/links")
	public String links() {
		return "links";
	}
	
	@GetMapping("/about")
	public String about() {
		return "about";
	}

	@GetMapping("/")
	public String home() {
		return "home";
	}

	@GetMapping("/login")
	public String login() {
		return "login";
	}

	@GetMapping("/signup")
	public String signup() {
		return "signup";
	}
	
	@GetMapping("/forgotpass")
	public String forgotpass() {
		return "forgotpass";
	}

	@PostMapping("/saveUser")
	public String saveUser(@ModelAttribute Admins user, Model m, HttpSession session) {
		
		
		user.setPassword(passwordEncode.encode(user.getPassword()));
		user.setRole("ROLE_USER");
		
		Admins u = userRepo.save(user);

		if (u != null) {
			session.setAttribute("msg", "Register Sucessfully");
		} else {
			session.setAttribute("msg", "Something wrong on server");
		}

		return "redirect:/signup";
	}
	
	

}