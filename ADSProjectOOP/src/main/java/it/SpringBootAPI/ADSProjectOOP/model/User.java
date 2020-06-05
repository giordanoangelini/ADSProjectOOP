package it.SpringBootAPI.ADSProjectOOP.model;

import java.util.Vector;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import it.SpringBootAPI.ADSProjectOOP.fetch.FetchClass;

public class User {
	
	private long ID;
	private String name;
	private String screenName;
	private String description;
	//private int characterNumber;
	//private int descriptionProperties;
	
	/*public User() {
		FetchClass fetchObject = new FetchClass();
		JSONObject jo = fetchObject.parsing();
		
		JSONArray jA = (JSONArray) (jo.get("users"));
		int i;
		for(Object o : jA){
			for (i = 0; i < 5; i++) {
				if (o instanceof JSONObject) {
			    	JSONObject o1 = (JSONObject)o; 
			    	utenti[i].ID = (long) o1.get("id");
			    	System.out.println(utenti[i].ID);
			    	utenti[i].name = (String) o1.get("name");
			    	utenti[i].screenName = (String) o1.get("screen_name");
			    	utenti[i].description = (String) o1.get("description");	
		        }
			}
		}
		//System.out.println(utenti[0].name);
    	//System.out.println(utenti[0].description + "\n");
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

	public  String getName() {
		return name;
	}

	public String getScreenName() {
		return screenName;
	}
	
	public String getDescription() {
		return description;
	}

	/*public int getCharacterNumber() {
		return characterNumber;
	}

	public int getDescriptionProperties() {
		return descriptionProperties;
	}*/
	
	public static void main(String[] args) {
		FetchClass fetchObject = new FetchClass();
		JSONObject jo = fetchObject.parsing();
		
		JSONArray jA = (JSONArray) (jo.get("users"));
		
		Vector <User> utenti = new Vector<User>();
		
		for(Object o : jA){

			if (o instanceof JSONObject) {
		    	JSONObject o1 = (JSONObject)o; 
		    	
		    	User temp = new User();
		    	temp.ID = (long) o1.get("id");
		    	temp.name = (String) o1.get("name");
		    	temp.screenName = (String) o1.get("screen_name");
		    	temp.description = (String) o1.get("description");
		    	
		    	utenti.add(temp);
	        }
		}
		System.out.println(utenti.elementAt(1).description);
	}
}
