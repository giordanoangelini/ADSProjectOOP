package it.SpringBootAPI.ADSProjectOOP.model;

import java.io.FileReader; 
import java.util.Iterator; 
import java.util.Map; 
  
import org.json.simple.JSONArray; 
import org.json.simple.JSONObject; 
import org.json.simple.parser.*;

public class User {
	
	private long ID;
	private String name;
	private String screenName;
	private int characterNumber;
	private int descriptionProperties;
	
	public User() {
		JSONObject jo = parsing();
		name = (String) jo.get("name");
		//	name = 
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
	
	public static void main(String[] args) {
		String ID = getID();
		System.out.print(ID);
	}
		
	}
