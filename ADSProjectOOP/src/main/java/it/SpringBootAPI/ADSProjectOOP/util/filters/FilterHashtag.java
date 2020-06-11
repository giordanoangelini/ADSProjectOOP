package it.SpringBootAPI.ADSProjectOOP.util.filters;

import it.SpringBootAPI.ADSProjectOOP.model.User;

public class FilterHashtag extends Filter {
	
	public boolean filter (User friends) {
		int param = friends.getDescriptionProperties();
		if (param == 3 || param == 4 || param == 7 || param == 8) 
		return true;
		else
		return false;
	}
}
