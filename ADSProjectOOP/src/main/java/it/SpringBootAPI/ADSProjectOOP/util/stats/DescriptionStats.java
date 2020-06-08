package it.SpringBootAPI.ADSProjectOOP.util.stats;

import it.SpringBootAPI.ADSProjectOOP.model.Database;

public class DescriptionStats {
	private float averageCharacters;
	private float linkPercentage;
	private float hashtagPercentage;
	private float tagPercentage;
	private String longestDescription;
	private String shortestDescription;
	
	DescriptionStats() {
		averageCharacters = averageCharacters();
		linkPercentage = linkPercentage();
		hashtagPercentage = hashtagPercentage();
		tagPercentage = tagPercentage();
		longestDescription = longestDescription();
		shortestDescription = shortestDescription();
	}
	
	private int notEmptyDescriptions() {
		Database obj = new Database();
		int counter = 0;
		for (int i = 0; i < obj.getDatabase().size(); i++) {
			if (obj.getDatabase().elementAt(i).getDescription().length() != 0)
				counter++;
		}
		return counter;
	}
	
	private float averageCharacters() {
		Database obj = new Database();
		int counter = 0;
		for (int i = 0; i < obj.getDatabase().size(); i++) {
			if (obj.getDatabase().elementAt(i).getDescription().length() != 0)
				counter += obj.getDatabase().elementAt(i).getDescription().length();
		}
		return (float) counter/(notEmptyDescriptions());
	}

	private float linkPercentage() {
		Database obj = new Database();
		int counter = 0;
		for (int i = 0; i < obj.getDatabase().size(); i++) {
			if (obj.getDatabase().elementAt(i).getDescription().length() != 0) {
				if ((obj.getDatabase().elementAt(i).getDescriptionProperties() == 5) ||
					(obj.getDatabase().elementAt(i).getDescriptionProperties() == 6) ||
					(obj.getDatabase().elementAt(i).getDescriptionProperties() == 7) ||
					(obj.getDatabase().elementAt(i).getDescriptionProperties() == 8))
					counter++;
			}
		}
		return (float) counter*100/(notEmptyDescriptions());
	}

	private float hashtagPercentage() {
		Database obj = new Database();
		int counter = 0;
		for (int i = 0; i < obj.getDatabase().size(); i++) {
			if (obj.getDatabase().elementAt(i).getDescription().length() != 0) {
				if ((obj.getDatabase().elementAt(i).getDescriptionProperties() == 3) ||
					(obj.getDatabase().elementAt(i).getDescriptionProperties() == 4) ||
					(obj.getDatabase().elementAt(i).getDescriptionProperties() == 7) ||
					(obj.getDatabase().elementAt(i).getDescriptionProperties() == 8))
					counter++;
			}
		}
		return (float) counter*100/(notEmptyDescriptions());
	}

	private float tagPercentage() {
		Database obj = new Database();
		int counter = 0;
		for (int i = 0; i < obj.getDatabase().size(); i++) {
			if (obj.getDatabase().elementAt(i).getDescription().length() != 0) {
				if ((obj.getDatabase().elementAt(i).getDescriptionProperties() == 2) ||
					(obj.getDatabase().elementAt(i).getDescriptionProperties() == 4) ||
					(obj.getDatabase().elementAt(i).getDescriptionProperties() == 6) ||
					(obj.getDatabase().elementAt(i).getDescriptionProperties() == 8))
					counter++;
			}
		}
		return (float) counter*100/(notEmptyDescriptions());
	}

	private String longestDescription() {
		Database obj = new Database();
		String max = null;
		for (int i = 0; i < obj.getDatabase().size(); i++) {
			if (obj.getDatabase().elementAt(i+1).getDescription().length() >= 
				obj.getDatabase().elementAt(i).getDescription().length())
				max = obj.getDatabase().elementAt(i+1).getDescription();
		}
		return max;
	}

	private String shortestDescription() {
		Database obj = new Database();
		String min = null;
		for (int i = 0; i < obj.getDatabase().size(); i++) {
			if ((obj.getDatabase().elementAt(i+1).getDescription().length() != 0) &&
				(obj.getDatabase().elementAt(i+1).getDescription().length() <=
				 obj.getDatabase().elementAt(i+1).getDescription().length()))
				min = obj.getDatabase().elementAt(i+1).getDescription();
		}
		return min;
	}

	public float getAverageCharacters() {
		return averageCharacters;
	}
	
	public float getLinkPercentage() {
		return linkPercentage;
	}
	
	public float getHashtagPercentage() {
		return hashtagPercentage;
	}
	
	public float getTagPercentage() {
		return tagPercentage;
	}
	
	public String getLongestDescription() {
		return longestDescription;
	}

	public String getShortestDescription() {
		return shortestDescription;
	}
}
