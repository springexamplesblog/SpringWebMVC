package com.springexamples.demo.web;

import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeConroller {
	@GetMapping("/home")
	public String userForm(Locale locale, Model model) {
		model.addAttribute("message", "Hello World !!");
		return "home";
	}
}