package it.SpringBootAPI.ADSProjectOOP.util.filters;

import it.SpringBootAPI.ADSProjectOOP.model.*;
import it.SpringBootAPI.ADSProjectOOP.database.*;

import java.util.Vector;

public class FilterDescription implements Filter {

	public boolean filter (User friends) {
		
		int param = friends.getDescriptionProperties();
		if (param != 0) return true;
		else return false;
	}
	
	public Vector <User> filterDescription(){
		
		Vector <User> positiveFriendsVector = new Vector <User>();
		Vector <User> allFriends = new Vector <User>();
		Database database = new Database();
		allFriends=database.getDatabase();
		for (User friends : allFriends) {
			if (filter (friends)) {
				positiveFriendsVector.add(friends);
			}
		}
		return positiveFriendsVector;
	}
}