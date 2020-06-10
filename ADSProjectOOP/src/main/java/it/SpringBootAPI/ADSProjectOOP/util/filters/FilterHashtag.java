package it.SpringBootAPI.ADSProjectOOP.util.filters;

import java.util.Vector;

import it.SpringBootAPI.ADSProjectOOP.model.FrontUser;
import it.SpringBootAPI.ADSProjectOOP.model.User;

public class FilterHashtag extends Filter {
	
	public boolean filter (User friends) {
		int param = friends.getDescriptionProperties();
		if (param == 3 || param == 4 || param == 7 || param == 8) 
		return true;
		else
		return false;
	}
	
	public Vector <FrontUser> filterHashtag() {
		Filter obj = new Filter();
		Vector <FrontUser> vector = obj.filterVector();
		return vector;
	}

}
