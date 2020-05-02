package br.com.exception.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class ExceptionNowController{


	
	@GetMapping("/")
	 public String home(Model teste) {
		return "redirect:game";   
	}
	
	
}