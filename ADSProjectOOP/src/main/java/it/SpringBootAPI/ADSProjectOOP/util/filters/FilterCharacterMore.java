package it.SpringBootAPI.ADSProjectOOP.util.filters;

import it.SpringBootAPI.ADSProjectOOP.exceptions.FilterException;
import it.SpringBootAPI.ADSProjectOOP.model.*;

public class FilterCharacterMore extends Filter {
	
	public boolean filter (User friend, Object param1, Object param2) {
		
		int min = 0;
		try {
		min = Integer.parseInt(param1.toString());
		}catch (NumberFormatException e) {
			throw new FilterException();
		}
		int param = friend.getCharacterNumber();
		if (param >= min) return true;
		else return false;		
	}
}