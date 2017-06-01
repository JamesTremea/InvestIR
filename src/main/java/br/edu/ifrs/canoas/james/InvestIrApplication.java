package br.edu.ifrs.canoas.james;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@SpringBootApplication
public class InvestIrApplication {

	public static void main(String[] args) {
		SpringApplication.run(InvestIrApplication.class, args);
	}

}

