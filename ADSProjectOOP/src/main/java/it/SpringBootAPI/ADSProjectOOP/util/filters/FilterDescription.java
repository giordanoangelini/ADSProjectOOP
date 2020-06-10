package it.SpringBootAPI.ADSProjectOOP.util.filters;

import it.SpringBootAPI.ADSProjectOOP.model.*;

public class FilterDescription extends Filter {

	public boolean filter (User friends) {
		
		int param = friends.getDescriptionProperties();
		if (param != 0) return true;
		else return false;
	}
	
	/*public Vector <FrontUser> filterDescription() {
		Filter obj = new Filter();
		Vector <FrontUser> vector = obj.filterVector();
		return vector;
	}*/
}