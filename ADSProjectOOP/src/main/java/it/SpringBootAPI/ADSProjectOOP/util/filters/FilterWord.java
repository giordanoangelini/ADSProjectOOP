package it.SpringBootAPI.ADSProjectOOP.util.filters;

import it.SpringBootAPI.ADSProjectOOP.model.*;

public class FilterWord extends Filter{

	public boolean filter (User friend, String word) {
		
		String text = friend.getDescription();
		if (text.contains(word)) return true;
			return false;
	}
}


