package it.SpringBootAPI.ADSProjectOOP.util.filters;

import it.SpringBootAPI.ADSProjectOOP.model.*;

public class FilterWord extends Filter{

	public boolean filter (User friend, String word) {
		
		String text = friend.getDescription().toLowerCase();
		if (text.contains(word.toLowerCase())) return true;
			return false;
	}
}


