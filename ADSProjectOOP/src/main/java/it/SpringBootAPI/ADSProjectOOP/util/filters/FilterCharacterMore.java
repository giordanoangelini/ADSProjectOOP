package it.SpringBootAPI.ADSProjectOOP.util.filters;

import it.SpringBootAPI.ADSProjectOOP.model.*;

public class FilterCharacterMore extends Filter {
	
	public boolean filter (User friends, int min) {
		int param = friends.getCharacterNumber();
		if (param > min) return true;
		else return false;		
	}
}