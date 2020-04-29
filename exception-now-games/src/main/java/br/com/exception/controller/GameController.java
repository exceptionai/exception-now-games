package br.com.exception.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("game")
public class GameController {
	 
	@GetMapping
	 public String home(Model model) {
		return "index";
	}
	
	@GetMapping("new")
	 public String formAdd(Model model) {
		return "newGame";
	}
}
