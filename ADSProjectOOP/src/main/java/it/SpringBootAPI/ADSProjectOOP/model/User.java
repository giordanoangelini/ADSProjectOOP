package it.SpringBootAPI.ADSProjectOOP.model;

public class User {
	
	private long ID;
	private String name;
	private String screenName;
	private int characterNumber;
	private int descriptionProperties;
	
	public User() {
		//	ID = prende da JSON
		//	name = 
		//	screenName = 
		//	description =
		//	characterNumber = characterCount fatto su JSON
		//	descriptionProperties = properties fatto su JSON
	}
	
	private int characterCount() {
		
	}
	
	private int properties() {
		
	}
	
	private boolean isThereDescription() {
		
	}
	
	private boolean isThereLink() {
		
	}

	public long getID() {
		return ID;
	}

	public String getName() {
		return name;
	}

	public String getScreenName() {
		return screenName;
	}

	public int getCharacterNumber() {
		return characterNumber;
	}

	public int getDescriptionProperties() {
		return descriptionProperties;
	}
}
