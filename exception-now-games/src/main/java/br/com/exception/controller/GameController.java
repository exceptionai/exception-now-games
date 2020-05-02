package br.com.exception.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.exception.model.GameModel;
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
	
	@GetMapping("form")
	 public String form(@ModelAttribute("gameModel") GameModel gameModel,
			 			@RequestParam String page,
			 			@RequestParam(required = false) Integer id,
			 			Model model) {
		
		if ("editGame".equals(page)) {
			model.addAttribute("game", repository.retrieveOneById(id));
		}
		
		return page;
	}
	
	@PostMapping("new")
	 public String saveNew(@Valid GameModel gameModel, BindingResult bindingResult, RedirectAttributes redirectAttributes) {
		
		if (bindingResult.hasErrors())
			return "newGame";
		
		repository.create(gameModel);
		
		redirectAttributes.addFlashAttribute("message", gameModel.getName() + " cadastrado com sucesso!");
		
		return "redirect:/game";
	}
}
