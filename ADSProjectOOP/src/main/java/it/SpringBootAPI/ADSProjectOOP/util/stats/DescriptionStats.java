package it.SpringBootAPI.ADSProjectOOP.util.stats;

import it.SpringBootAPI.ADSProjectOOP.database.*;

public class DescriptionStats {
	private float averageCharacters;
	private String linkPercentage;
	private String hashtagPercentage;
	private String tagPercentage;
	private String longestDescription;
	private String shortestDescription;
	
	public DescriptionStats() {
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
		return (float) counter/notEmptyDescriptions();
	}

	private String linkPercentage() {
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
		float percentage = (float) counter*100/notEmptyDescriptions();
		return String.format("%.2f", percentage) + "%";
	}

	private String hashtagPercentage() {
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
		float percentage = (float) counter*100/notEmptyDescriptions();
		return String.format("%.2f", percentage) + "%";
	}

	private String tagPercentage() {
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
		float percentage = (float) counter*100/notEmptyDescriptions();
		return String.format("%.2f", percentage) + "%";
	}

	private String longestDescription() {
		Database obj = new Database();
		String max = obj.getDatabase().elementAt(0).getDescription();
		for (int i = 1; i < obj.getDatabase().size(); i++) {
			if (obj.getDatabase().elementAt(i).getDescription().length() >= 
				obj.getDatabase().elementAt(i-1).getDescription().length())
				max = obj.getDatabase().elementAt(i).getDescription();
		}
		return max;
	}

	private String shortestDescription() {
		Database obj = new Database();
		String min = obj.getDatabase().elementAt(0).getDescription();
		for (int i = 1; i < obj.getDatabase().size(); i++) {
			if ((obj.getDatabase().elementAt(i).getDescription().length() != 0) &&
				(obj.getDatabase().elementAt(i).getDescription().length() <=
				 obj.getDatabase().elementAt(i-1).getDescription().length()))
				min = obj.getDatabase().elementAt(i).getDescription();
		}
		return min;
	}

	public float getAverageCharacters() {
		return averageCharacters;
	}
	
	public String getLinkPercentage() {
		return linkPercentage;
	}
	
	public String getHashtagPercentage() {
		return hashtagPercentage;
	}
	
	public String getTagPercentage() {
		return tagPercentage;
	}
	
	public String getLongestDescription() {
		return longestDescription;
	}

	public String getShortestDescription() {
		return shortestDescription;
	}
}
