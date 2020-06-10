package it.SpringBootAPI.ADSProjectOOP.util.filters;

import it.SpringBootAPI.ADSProjectOOP.model.User;

public class FilterCharacterLess extends Filter {
	
	public boolean filter (User friends, int max) {
		int param = friends.getCharacterNumber();
		if (param <= max && param != 0) return true;
		else return false;		
	}
}
