package br.com.exception.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.exception.model.GameModel;
import br.com.exception.model.MessageModel;
import br.com.exception.model.MessageType;
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
	 public String formAdd(@ModelAttribute("gameModel") GameModel gameModel) {
		return "newGame";
	}
	
	@PostMapping("new")
	 public String saveNew(@Valid GameModel gameModel, BindingResult bindingResult, RedirectAttributes redirectAttributes) {
		
		if (bindingResult.hasErrors())
			return "newGame";
		
		repository.create(gameModel);
		
		MessageModel message = new MessageModel("Sucesso",gameModel.getName() + " cadastrado com sucesso!", MessageType.success);
		redirectAttributes.addFlashAttribute("message", message);
		
		return "redirect:/game";
	}
	
	@DeleteMapping("{id}")
	public String deleteGame(Integer id) {
		
		repository.delete(id);
		
		return "redirect:game";
	}
}
