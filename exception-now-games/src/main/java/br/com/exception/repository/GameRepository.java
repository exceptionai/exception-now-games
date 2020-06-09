package br.com.exception.repository;

import java.util.Collection;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import br.com.exception.model.GameModel;

@Repository
public class GameRepository {

	@Autowired
	public JdbcTemplate jdbcTemplate;

	private static final String SELECT_ALL = "SELECT * FROM TB_GAMES";
	private static final String SELECT = "SELECT * FROM TB_GAMES WHERE ID = ?";
	private static final String SAVE = "INSERT INTO TB_GAMES (NAME, DESCRIPTION, GENRE, DEVELOPER, PUBLISHER, PRICE, IMAGE_URL)"

			+ "VALUES (?, ?, ?, ?, ?, ?, ?)";
	private static final String UPDATE = "UPDATE TB_GAMES SET NAME = ?, DESCRIPTION = ?, GENRE = ?, DEVELOPER = ?, PUBLISHER = ?, PRICE = ?, IMAGE_URL = ? WHERE ID = ?";
	private static final String DELETE = "DELETE FROM TB_GAMES WHERE ID = ?";

	public GameRepository() {}

	public Collection<GameModel> retrieveAllGames() {
		return jdbcTemplate.query(SELECT_ALL, new BeanPropertyRowMapper<GameModel>(GameModel.class));
	}

	public GameModel retrieveOneById(Integer id) {
		return this.jdbcTemplate.queryForObject(SELECT, new BeanPropertyRowMapper<GameModel>(GameModel.class), id);
	}

	public void create(GameModel gameModel) {
		jdbcTemplate.update(SAVE, gameModel.getName(), gameModel.getDescription(), gameModel.getGenre(),
				gameModel.getDeveloper(), gameModel.getPublisher(), gameModel.getPrice(), gameModel.getImageUrl());
	}

	public void update(GameModel gameModel) {
		jdbcTemplate.update(UPDATE, gameModel.getName(), gameModel.getDescription(), gameModel.getGenre(),
				gameModel.getDeveloper(), gameModel.getPublisher(), gameModel.getPrice(), gameModel.getImageUrl(),
				gameModel.getId());
	}

	public void delete(Integer id) {
		jdbcTemplate.update(DELETE, id);
	}
}
