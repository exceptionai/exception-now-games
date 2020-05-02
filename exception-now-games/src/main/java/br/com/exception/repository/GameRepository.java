package br.com.exception.repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import br.com.exception.model.GameModel;

@Repository
public class GameRepository {

	private static Map<Integer, GameModel> games;

	private GameRepository() {
		games = new HashMap<Integer, GameModel>();

		games.put(1, new GameModel(1, "Cuphead",
				"Cuphead is a classic run and gun action game heavily focused on boss battles and inspired by cartoons of the 1930s. ",
				"Action, Indie", " Studio MDHR Entertainment Inc.", "Studio MDHR Entertainment Inc", 36.99, "https://steamcdn-a.akamaihd.net/steam/apps/268910/header.jpg?t=1572039891"));

		games.put(2, new GameModel(2, "Stardew Valley",
						"Can you learn to live off the land and turn these overgrown fields into a thriving home?",
						"Indie, RPG, Simulation", "ConcernedApe", "ConcernedApe", 24.99, "https://steamcdn-a.akamaihd.net/steam/apps/413150/header.jpg?t=1583864420"));
		
		games.put(3, new GameModel(3, "Terraria",
				"Dig, fight, explore, build! Nothing is impossible in this action-packed adventure game. Four Pack also available!",
				"Action, Adventure, Indie, RPG", "ReLogic", "Relogic", 19.99, "https://steamcdn-a.akamaihd.net/steam/apps/105600/header.jpg?t=1580862559"));
	}

	public Collection<GameModel> retrieveAllGames() {
		return games.values();
	}
	
	public GameModel retrieveOneById(Integer id) {
		return games.get(id);
	}
	
	public void create(GameModel gameModel) {
		Integer gameId = games.size() + 1;
		gameModel.setId(gameId);
		games.put(gameId, gameModel);
	}
	
	public void update(GameModel gameModel) {
		games.put(gameModel.getId(), gameModel);
	}
}

