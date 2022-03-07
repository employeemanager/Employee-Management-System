package com.login.controller;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.login.entity.Admins;
import com.login.repository.UserRepository;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserRepository userRepository;


	@ModelAttribute
	public void addCommnData(Principal p, Model m) {
		String email = p.getName();
		Admins user = userRepository.findByEmail(email);
		m.addAttribute("user", user);
	}
	@GetMapping("/manage")
	public String manage() {
		return "user/manage";
	}










}