package br.com.exception.controller;

import java.util.HashMap;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.exception.model.GameModel;
import br.com.exception.model.MessageModel;
import br.com.exception.model.MessageType;
import br.com.exception.repository.GameRepository;
import br.com.exception.service.GameService;

@Controller
@RequestMapping("game")
public class GameController {
	
	@Autowired
	GameService service;

	@GetMapping
	 public String home(Model model) {
		model.addAttribute("games", service.getAll());
		
		return "index";
	}
	
	@GetMapping("form")
	 public String form(@ModelAttribute("gameModel") GameModel gameModel,
			 			@RequestParam String page,
			 			@RequestParam(required = false) Integer id,
			 			Model model,
			 			RedirectAttributes redirectAttributes) {
		
		if ("editGame".equals(page)) {
			GameModel game = service.getById(id);
			if(game == null) {
				MessageModel message = new MessageModel("Houve uma falha", "Ocorreu um erro ao editar. ", MessageType.error);
				redirectAttributes.addFlashAttribute("message", message);
				return "redirect:/game";
			}
			model.addAttribute("gameModel", game);
		}
		
		return page;
	}
	
	@PostMapping("new")
	 public String saveNew(@Valid GameModel gameModel, BindingResult bindingResult, RedirectAttributes redirectAttributes) {
		
		if (bindingResult.hasErrors())
			return "newGame";
		
		service.create(gameModel);
		
		MessageModel message = new MessageModel("Sucesso",gameModel.getName() + " cadastrado com sucesso!", MessageType.success);
		redirectAttributes.addFlashAttribute("message", message);
		
		return "redirect:/game";
	}
	
	@PutMapping
	 public String update(@Valid GameModel gameModel, BindingResult bindingResult, RedirectAttributes redirectAttributes) {
		
		if (bindingResult.hasErrors())
			return "editGame";
			
					
		service.update(gameModel);
		
		MessageModel message = new MessageModel("Sucesso",gameModel.getName() + " editado com sucesso!", MessageType.success);
		redirectAttributes.addFlashAttribute("message", message);
		
		return "redirect:/game";
	}
	
	@DeleteMapping("/{id}")
	public String delete(@PathVariable("id") Integer id, RedirectAttributes redirectAttributes) {
		GameModel model = service.getById(id);
		
		if(model == null) {
			MessageModel message = new MessageModel("Houve uma falha", "Ocorreu um erro ao excluir da lista.", MessageType.error);
			redirectAttributes.addFlashAttribute("message", message);
			return "redirect:/game";
		}
				
		service.delete(id);
		
		MessageModel message = new MessageModel("Sucesso", model.getName() + " excluído da lista.", MessageType.success);
		redirectAttributes.addFlashAttribute("message", message);
		
		return "redirect:/game";
	}
}
