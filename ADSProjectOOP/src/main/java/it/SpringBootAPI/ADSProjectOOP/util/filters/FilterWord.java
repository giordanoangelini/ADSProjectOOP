package it.SpringBootAPI.ADSProjectOOP.util.filters;

import it.SpringBootAPI.ADSProjectOOP.model.*;

public class FilterWord extends Filter{

	public boolean filter (User friend, Object param1, Object param2) {
		String word = param1.toString();
		String text = friend.getDescription().toLowerCase();
		if (text.contains(word.toLowerCase())) return true;
			return false;
	}
}


