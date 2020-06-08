package it.SpringBootAPI.ADSProjectOOP.model;

import java.util.Vector;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import it.SpringBootAPI.ADSProjectOOP.fetch.FetchClass;

public class FrontUser {
	
	private String name;
	private String description;
	
	public Vector <FrontUser> fillUp() {
		FetchClass fetchObject = new FetchClass();
		JSONObject jObject = fetchObject.parsing();
		
		JSONArray jArray = (JSONArray) (jObject.get("users"));
		
		Vector <FrontUser> frontUserVector = new Vector <FrontUser>();
		
		for(Object object : jArray) {

			if (object instanceof JSONObject) {
		    	JSONObject object1 = (JSONObject)object; 
		    	
		    	FrontUser temp = new FrontUser();
		    	temp.name = (String) object1.get("name");
		    	temp.description = (String) object1.get("description");
		    	
		    	frontUserVector.add(temp);
	        }
		}
		return frontUserVector;
	}

	public String getName() {
		return name;
	}
	
	public String getDescription() {
		return description;
	}
}
