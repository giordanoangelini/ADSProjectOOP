package it.SpringBootAPI.ADSProjectOOP.util.filters;

import it.SpringBootAPI.ADSProjectOOP.model.User;

public class FilterTag extends Filter {
	
	public boolean filter (User friend, Object param1, Object param2) {
		
		int param = friend.getDescriptionProperties();
		if (param == 2 || param == 4 || param == 6 || param == 8) return true;
		else return false;
	}
}
