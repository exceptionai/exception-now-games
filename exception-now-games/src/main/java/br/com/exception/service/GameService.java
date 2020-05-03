package br.com.exception.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.exception.model.GameModel;
import br.com.exception.repository.GameRepository;

@Service
public class GameService {

	@Autowired
	GameRepository repository;

	public GameModel getById(Integer id){
		return repository.retrieveOneById(id);
	} 
	

	public List<GameModel> getAll(){
		Collection<GameModel> games = repository.retrieveAllGames();
		List<GameModel> gameList = new ArrayList<GameModel>(games);
		Collections.reverse(gameList);
		return gameList;
	}
	

	public void create(GameModel model){
		repository.create(model);
	}
	
	
	public void update(GameModel model) {
		repository.update(model);
	}
	
	public void delete(Integer id) {
		repository.delete(id);
	}
}
