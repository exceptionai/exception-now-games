package br.com.exception.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.exception.repository.GameRepository;

@Controller
@RequestMapping("game")
public class GameController {
	 
	GameRepository repository = GameRepository.getInstance();

	@GetMapping
	 public String home(Model model) {
		model.addAttribute("games", repository.retrieveAllGames());
		
		return "index";
	}
	
	@GetMapping("new")
	 public String formAdd(Model model) {
		return "newGame";
	}
}
