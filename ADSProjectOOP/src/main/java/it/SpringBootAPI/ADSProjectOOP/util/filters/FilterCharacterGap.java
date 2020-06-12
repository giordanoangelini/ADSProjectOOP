package it.SpringBootAPI.ADSProjectOOP.util.filters;

import it.SpringBootAPI.ADSProjectOOP.model.User;

public class FilterCharacterGap extends Filter {
	
	public boolean filter (User friend, Object param1, Object param2) {		
		FilterCharacterMore obj1 = new FilterCharacterMore();
		FilterCharacterLess obj2 = new FilterCharacterLess();
		if ((obj1.filter(friend, param1, param2)) && (obj2.filter(friend, param2, param1))) 
			return true;
		else return false;
	}
}
