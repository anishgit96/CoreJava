package com.example.RestCrudQualifier.RestCrudQualifier;

public class Topic {
	
	String language;
	String description;
	String level;
	
	
	public Topic(String language, String description, String level) {
		super();
		this.language = language;
		this.description = description;
		this.level = level;
	}
	
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	public String getDescription() {
		return description;
	}
	public String getLevel() {
		return level;
	}

}
