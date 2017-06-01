package br.edu.ifrs.canoas.james.controller;

import java.security.Principal;
import java.util.Collections;
import java.util.Map;

//import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import br.edu.ifrs.canoas.james.domain.UserImpl;


@Controller
public class HomeController {

	@GetMapping("/")
	public String home(){
		return ("layouts/home");
	}

	@GetMapping("/hi")
	public Map<String, String> greetings(Principal p) {
		return Collections.singletonMap("content", "Hello, " + p.getName());
	}

}
