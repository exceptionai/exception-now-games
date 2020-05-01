package br.com.exception.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import br.com.exception.model.GameModel;

public class GameRepository {

	private static GameRepository instance;
	private static Map<Integer, GameModel> games;

	public static GameRepository getInstance() {
		if (instance == null) {
			return new GameRepository();
		}
		return instance;
	}

	private GameRepository() {
		games = new HashMap<Integer, GameModel>();

		games.put(1, new GameModel(1, "Cuphead",
				"Cuphead is a classic run and gun action game heavily focused on boss battles and inspired by cartoons of the 1930s. ",
				"Action, Indie", " Studio MDHR Entertainment Inc.", "Studio MDHR Entertainment Inc", 36.99));

		games.put(2, new GameModel(2, "Stardew Valley",
						"Can you learn to live off the land and turn these overgrown fields into a thriving home?",
						"Indie, RPG, Simulation", "ConcernedApe", "ConcernedApe", 24.99));
	}

	public List<GameModel> retrieveAllGames() {
		List<GameModel> gameList = new ArrayList<GameModel>(games.values());

		return gameList;
	}
	
	public void create(GameModel gameModel) {
		Integer gameId = games.size() + 1;
		gameModel.setId(gameId);
		games.put(gameId, gameModel);
	}
}

