package it.SpringBootAPI.ADSProjectOOP.model;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import it.SpringBootAPI.ADSProjectOOP.fetch.FetchClass;

public class User {
	
	private long ID;
	private static String name;
	private String screenName;
	private String description;
	private int characterNumber;
	private int descriptionProperties;
	
	public User() {
		
		//	screenName = 
		//	description =
		//	characterNumber = characterCount fatto su JSON
		//	descriptionProperties = properties fatto su JSON
	}
	
	/*private int characterCount() {
		
	}
	
	private int properties() {
		
	}
	
	private boolean isThereDescription() {
		
	}
	
	private boolean isThereLink() {
		
	}*/

	public  long getID() {
		return ID;
	}

	public static String getName() {
		return name;
	}

	public String getScreenName() {
		return screenName;
	}
	
	public String getDescription() {
		return description;
	}

	public int getCharacterNumber() {
		return characterNumber;
	}

	public int getDescriptionProperties() {
		return descriptionProperties;
	}
	
	public static void main(String[] args) {
		FetchClass obj = new FetchClass();
		JSONObject json = obj.parsing();
		System.out.print(json);
	}
		
}
