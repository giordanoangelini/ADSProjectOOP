package it.SpringBootAPI.ADSProjectOOP.util.filters;

import it.SpringBootAPI.ADSProjectOOP.model.*;

public class FilterCharacterMore extends Filter {
	
	public boolean filter (User friend, Object param1, Object param2) {
		
		int min = Integer.parseInt(param1.toString());
		int param = friend.getCharacterNumber();
		if (param >= min) return true;
		else return false;		
	}
}