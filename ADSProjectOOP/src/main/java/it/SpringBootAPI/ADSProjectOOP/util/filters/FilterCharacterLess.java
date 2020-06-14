package it.SpringBootAPI.ADSProjectOOP.util.filters;

import it.SpringBootAPI.ADSProjectOOP.exceptions.FilterException;
import it.SpringBootAPI.ADSProjectOOP.model.User;

public class FilterCharacterLess extends Filter {
	
	public boolean filter (User friend, Object param1, Object param2) {
		int max = 0;
		try {
		max = Integer.parseInt(param1.toString());
		}catch (NumberFormatException e) {
			throw new FilterException();
		}
		int param = friend.getCharacterNumber();
		if (param <= max && param != 0) return true;
		else return false;		
	}
}
