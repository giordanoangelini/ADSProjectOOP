package it.SpringBootAPI.ADSProjectOOP.util.filters;

import it.SpringBootAPI.ADSProjectOOP.model.*;

public class FilterDescription extends Filter {

	public boolean filter (User friend, Object param1, Object param2) {
		
		int param = friend.getDescriptionProperties();
		if (param != 0) return true;
		else return false;
	}
}