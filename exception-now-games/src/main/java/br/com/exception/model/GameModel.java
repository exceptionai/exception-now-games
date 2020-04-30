package br.com.exception.model;

public class GameModel {
	private int id;
	private String name;
	private String description;
	private String genre;
	private String developer;
	private String publisher;
	private double price;

	public GameModel(int id, String name, String description, String genre, String developer, String publisher,
			double price) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.genre = genre;
		this.developer = developer;
		this.publisher = publisher;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
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

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
}
