package it.SpringBootAPI.ADSProjectOOP.util.filters;

import it.SpringBootAPI.ADSProjectOOP.model.*;

public class FilterCharacterMore extends Filter {
	
	public boolean filter (User friend, Object param1, Object param2) {
		
		String temp = param1.toString();
		int min = Integer.valueOf(temp);
		int param = friend.getCharacterNumber();
		if (param >= min) return true;
		else return false;		
	}
}