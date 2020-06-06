package it.SpringBootAPI.ADSProjectOOP.util.stats;

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
	
	private float averageCharacters() {
		return 0;
	}

	private float linkPercentage() {
		return 0;
	}

	private float hashtagPercentage() {
		return 0;
	}

	private float tagPercentage() {
		return 0;
	}

	private String longestDescription() {
		return null;
	}

	private String shortestDescription() {
		return null;
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
