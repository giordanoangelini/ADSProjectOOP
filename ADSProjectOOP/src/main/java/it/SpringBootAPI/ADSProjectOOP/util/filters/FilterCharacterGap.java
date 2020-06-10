package it.SpringBootAPI.ADSProjectOOP.util.filters;

import it.SpringBootAPI.ADSProjectOOP.model.User;

public class FilterCharacterGap extends Filter {
	
	public boolean filter (User friend, int min, int max) {
		FilterCharacterMore obj1 = new FilterCharacterMore();
		FilterCharacterLess obj2 = new FilterCharacterLess();
		if ( (obj1.filter(friend , min)) && (obj2.filter(friend ,max))) return true;
		else return false;
	}

}
