package br.com.exception.model;

public class MessageModel{
	
	public String title;
	public String message;
	public MessageType type;
	public String icon;

	public MessageModel(String title, String message, MessageType type) {
		super();
		this.title = title;
		this.message = message;
		this.type = type;
		this.icon = "https://image.flaticon.com/icons/svg/2590/2590084.svg";
	}
	
	public MessageModel(String title,String icon, String message, MessageType type) {
		this(title, message, type);
		this.icon = icon;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public MessageType getType() {
		return type;
	}

	public void setType(MessageType type) {
		this.type = type;
	}
	
	
}