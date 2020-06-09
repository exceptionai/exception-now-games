package br.com.exception.model;

import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class GameModel { 
	  
	private Integer id;
	
	@NotBlank(message = "O campo nome é obrigatório e não deve ser em branco.")
	private String name;
	
	@NotBlank(message = "O campo descrição é obrigatório e não deve ser em branco.")
	private String description;
	
	@NotBlank(message = "O campo gênero é obrigatório e não deve ser em branco.")
	private String genre;
	
	@NotBlank(message = "O campo desenvolvedor(a) é obrigatório e não deve ser em branco.")
	private String developer;
	
	@NotBlank(message = "O campo publisher é obrigatório e não deve ser em branco.")
	private String publisher;
	
	@DecimalMin(value = "0", message = "O jogo não deve ter preço negativo")
	@DecimalMax(value = "9999.99", message = "O jogo deve custar no máximo R$9999,99.")
	@NotNull(message = "É obrigatório informar o preço do jogo.")
	private Double price;
	
	@NotBlank(message = "O URL da imagem do jogo é obrigatório e não deve ser em branco.")
	private String imageUrl;
	
	public GameModel() {}
	public GameModel(Integer id, String name, String description, String genre, String developer, String publisher,
			Double price, String imageUrl) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.genre = genre;
		this.developer = developer;
		this.publisher = publisher;
		this.price = price;
		this.imageUrl = imageUrl;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getDeveloper() {
		return developer;
	}

	public void setDeveloper(String developer) {
		this.developer = developer;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

}
