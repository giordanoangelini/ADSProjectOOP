package it.SpringBootAPI.ADSProjectOOP.model;

import java.util.Vector;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import it.SpringBootAPI.ADSProjectOOP.fetch.FetchClass;

public class User {
	
	private long ID;
	private String name;
	private String screenName;
	private String description;
	private int characterNumber;
	private int descriptionProperties;
	
	/*private int properties() {
		
	}
	
	private boolean isThereDescription() {
		
	}
	
	private boolean isThereLink() {
		
	}*/

	public  long getID() {
		return ID;
	}

	public  String getName() {
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
	
	public Vector<User> fillUp() {
		FetchClass fetchObject = new FetchClass();
		JSONObject jObject = fetchObject.parsing();
		
		JSONArray jArray = (JSONArray) (jObject.get("users"));
		
		Vector <User> userVector = new Vector <User>();
		
		for(Object object : jArray) {

			if (object instanceof JSONObject) {
		    	JSONObject object1 = (JSONObject)object; 
		    	
		    	User temp = new User();
		    	temp.ID = (long) object1.get("id");
		    	temp.name = (String) object1.get("name");
		    	temp.screenName = (String) object1.get("screen_name");
		    	temp.description = (String) object1.get("description");
		    	temp.characterNumber = temp.description.length();
		    	
		    	userVector.add(temp);
	        }
		}
		return userVector;
	}
}
