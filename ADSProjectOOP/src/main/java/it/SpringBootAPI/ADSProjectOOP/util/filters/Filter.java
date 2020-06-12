package it.SpringBootAPI.ADSProjectOOP.util.filters;

import java.util.Vector;

import it.SpringBootAPI.ADSProjectOOP.database.*;
import it.SpringBootAPI.ADSProjectOOP.model.*;

public class Filter {
	
	public boolean filter (User friend, Object param1, Object param2) {
		return true;
	}
	
	public Vector <FrontUser> filterVector(Object param1, Object param2) {
		
		Vector <FrontUser> positiveFriendsVector = new Vector <FrontUser>();
		Database database = new Database();
		FrontDatabase frontDatabase = new FrontDatabase();
		
		for (int i = 0; i < database.getDatabase().size(); i++){
			if (filter(database.getDatabase().elementAt(i), param1, param2)) {
				positiveFriendsVector.add(frontDatabase.getFrontDatabase().elementAt(i));
			}
		}
		return positiveFriendsVector;
	}
}
