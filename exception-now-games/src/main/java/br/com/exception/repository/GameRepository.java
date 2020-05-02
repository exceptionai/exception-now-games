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
				"Action, Indie", " Studio MDHR Entertainment Inc.", "Studio MDHR Entertainment Inc", 36.99,"https://steamcdn-a.akamaihd.net/steam/apps/268910/header.jpg?t=1572039891"));
		
		games.put(2, new GameModel(2, "Stardew Valley",
						"Can you learn to live off the land and turn these overgrown fields into a thriving home?",
						"Indie, RPG, Simulation", "ConcernedApe", "ConcernedApe", 24.99,"https://www.bichosgeeks.com/wp-content/uploads/2017/03/stardew-valley-dicas-820x410.jpg"));
		games.put(3, new GameModel(3, "Cyberpunk 2077",
				"Cyberpunk 2077 is an open-world, action-adventure story set in Night City, a megalopolis obsessed with power, glamour and body modification. You play as V, a mercenary outlaw going after a one-of-a-kind implant that is the key to immortality.",
				"Cyberpunk, Open World, RPG", "CD PROJEKT RED", "CD PROJEKT RED", 59.99,"https://i.pinimg.com/originals/87/6d/df/876ddfa41d503ba2e6b9aaa523f44b13.jpg"));
		games.put(4, new GameModel(4, "The Legend of Zelda: Breath of the Wild",
				"Cuphead is a classic run and gun action game heavily focused on boss battles and inspired by cartoons of the 1930s. ",
				"Action, Indie", " Studio MDHR Entertainment Inc.", "Studio MDHR Entertainment Inc", 36.99,"https://tribogamer.com/jogos/imagens/banner/5689.jpg"));
		games.put(5, new GameModel(5, "Dauntless",
				"Cuphead is a classic run and gun action game heavily focused on boss battles and inspired by cartoons of the 1930s. ",
				"Action, Indie", " Studio MDHR Entertainment Inc.", "Studio MDHR Entertainment Inc", 36.99,"https://switch-brasil.com/wp-content/uploads/2019/12/Phoenix-Labs-Dauntless-Keyart.jpg"));
		games.put(6, new GameModel(6, "Undertale",
				"Cuphead is a classic run and gun action game heavily focused on boss battles and inspired by cartoons of the 1930s. ",
				"Action, Indie", " Studio MDHR Entertainment Inc.", "Studio MDHR Entertainment Inc", 36.99,"https://cdn02.nintendo-europe.com/media/images/10_share_images/games_15/nintendo_switch_download_software_1/H2x1_NSwitchDS_Undertale_image1600w.jpg"));

		games.put(7, new GameModel(7, "Resident Evil 3",
				"Cuphead is a classic run and gun action game heavily focused on boss battles and inspired by cartoons of the 1930s. ",
				"Action, Indie", " Studio MDHR Entertainment Inc.", "Studio MDHR Entertainment Inc", 36.99,"https://i.pinimg.com/originals/01/a3/8f/01a38fb96317ff8658bc243fdeeac4d5.jpg"));

		games.put(8, new GameModel(8, "Dungeon Souls",
				"Cuphead is a classic run and gun action game heavily focused on boss battles and inspired by cartoons of the 1930s. ",
				"Action, Indie", " Studio MDHR Entertainment Inc.", "Studio MDHR Entertainment Inc", 36.99,"https://4.bp.blogspot.com/-E7rx1ZZ8k1A/VbIqP0OyPJI/AAAAAAAAA2A/L1n_vx48DzM/s1600/qW3aLM.png"));
		
		games.put(9, new GameModel(9, "Streets of Rage 4",
				"O clássico Streets of Rage, chamado de Luta sem Luvas (ベア・ナックル Bea Nakkuru) no Japão, é uma trilogia no gênero beat ‘em up que ficou famosa por sua jogabilidade atemporal e músicas eletrônicas dançantes. ",
				"Ação, Indie, Beat'em Up, Aventura, Casual", " Studio MDHR Entertainment Inc.", "Studio MDHR Entertainment Inc", 36.99,"https://s2.glbimg.com/SDX8vsoL7qfolI6iho72-y4ODzI=/0x0:1600x800/984x0/smart/filters:strip_icc()/i.s3.glbimg.com/v1/AUTH_08fbf48bc0524877943fe86e43087e7a/internal_photos/bs/2020/7/a/3TtZzlRgqADRLnhQxqKA/streets-of-rage-4.jpg"));
		
		games.put(10, new GameModel(10, "Euro Truck Simulator 2",
				"Travel across Europe as king of the road, a trucker who delivers important cargo across impressive distances! With dozens of cities to explore, your endurance, skill and speed will all be pushed to their limits. ",
				"Simulação, Direção, Realístico, Automobile Slim ", " Studio MDHR Entertainment Inc.", "Studio MDHR Entertainment Inc", 36.99,"https://steamcdn-a.akamaihd.net/steam/apps/227300/header.jpg?t=1587666184"));
		
		
		}
	
	public List<GameModel> retrieveAllGames() {
		List<GameModel> gameList = new ArrayList<GameModel>(games.values());
		
		return gameList;
	}
}
