package it.SpringBootAPI.ADSProjectOOP.util.filters;

import it.SpringBootAPI.ADSProjectOOP.model.User;

public class FilterCharacterLess extends Filter {
	
	public boolean filter (User friend, Object param1, Object param2) {
		String temp = param1.toString();
		int max = Integer.valueOf(temp);
		int param = friend.getCharacterNumber();
		if (param <= max && param != 0) return true;
		else return false;		
	}
}
