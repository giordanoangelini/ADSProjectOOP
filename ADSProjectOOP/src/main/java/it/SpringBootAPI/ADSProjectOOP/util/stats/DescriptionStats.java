package it.SpringBootAPI.ADSProjectOOP.util.stats;

import it.SpringBootAPI.ADSProjectOOP.database.*;
import it.SpringBootAPI.ADSProjectOOP.exceptions.StatsException;
import it.SpringBootAPI.ADSProjectOOP.exceptions.TooManyRequestException;
import it.SpringBootAPI.ADSProjectOOP.model.*;

public class DescriptionStats {
	
	private float  averageCharacters;
	private String linkPercentage;
	private String hashtagPercentage;
	private String tagPercentage;
	private String longestDescription;
	private String shortestDescription;
	
	public DescriptionStats() {
		try {
			try {
				averageCharacters = averageCharacters();
				linkPercentage = linkPercentage();
				hashtagPercentage = hashtagPercentage();
				tagPercentage = tagPercentage();
				longestDescription = longestDescription();
				shortestDescription = shortestDescription();
			} catch (ArithmeticException e) {
				throw new StatsException();
			}
		} catch (NullPointerException e) {
			throw new TooManyRequestException();
		}
	}

	private int notEmptyDescriptions() {
		Database obj = new Database();
		int counter = 0;
		for (User singleUser : obj.getDatabase()) {
			if (!singleUser.getDescription().isEmpty()) counter++;
		}
		return counter;
	}
	
	private float averageCharacters() {
		Database obj = new Database();
		int counter = 0;
		for (User singleUser : obj.getDatabase()) counter += singleUser.getCharacterNumber();
		return (float) counter/notEmptyDescriptions();
	}

	private String linkPercentage() {
		Database obj = new Database();
		int counter = 0;
		for (User singleUser : obj.getDatabase()) 
			if (singleUser.getDescriptionProperties() == 5 ||
				singleUser.getDescriptionProperties() == 6 ||
				singleUser.getDescriptionProperties() == 7 ||
				singleUser.getDescriptionProperties() == 8) counter++;
		float percentage = (float) counter*100/notEmptyDescriptions();
		return String.format("%.2f", percentage) + "%";
	}
	
	private String hashtagPercentage() {
		Database obj = new Database();
		int counter = 0;
		for (User singleUser : obj.getDatabase()) 
			if (singleUser.getDescriptionProperties() == 3 ||
				singleUser.getDescriptionProperties() == 4 ||
				singleUser.getDescriptionProperties() == 7 ||
				singleUser.getDescriptionProperties() == 8) counter++;
		float percentage = (float) counter*100/notEmptyDescriptions();
		return String.format("%.2f", percentage) + "%";
	}
	
	private String tagPercentage() {
		Database obj = new Database();
		int counter = 0;
		for (User singleUser : obj.getDatabase()) 
			if (singleUser.getDescriptionProperties() == 2 ||
				singleUser.getDescriptionProperties() == 4 ||
				singleUser.getDescriptionProperties() == 6 ||
				singleUser.getDescriptionProperties() == 8) counter++;
		float percentage = (float) counter*100/notEmptyDescriptions();
		return String.format("%.2f", percentage) + "%";
	}
	
	private String longestDescription() {
		Database obj = new Database();
		String max = "";
		for (User singleUser : obj.getDatabase()) 
			if (singleUser.getDescription().length() >= max.length()) max = singleUser.getDescription();
		return max;
	}
	
	private String shortestDescription() {
		Database obj = new Database();
		StringBuffer buffer = new StringBuffer();
		for (int i = 0; i < 10000; i++) buffer.append("#");
		String min = buffer.toString();
		for (User singleUser : obj.getDatabase()) 
			if (singleUser.getDescription().length() <= min.length() &&
			   !singleUser.getDescription().isEmpty()) min = singleUser.getDescription();
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
