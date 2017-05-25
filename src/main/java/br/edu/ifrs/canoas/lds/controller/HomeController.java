package br.edu.ifrs.canoas.lds.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
class HomeController{
	
	@GetMapping("/home")
	public ModelAndView home(){
		return new ModelAndView("home");
	}
}
