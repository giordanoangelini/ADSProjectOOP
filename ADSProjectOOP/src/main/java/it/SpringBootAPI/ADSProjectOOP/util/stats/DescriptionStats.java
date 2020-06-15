package it.SpringBootAPI.ADSProjectOOP.util.stats;

import it.SpringBootAPI.ADSProjectOOP.database.*;

import it.SpringBootAPI.ADSProjectOOP.exceptions.StatsException;
import it.SpringBootAPI.ADSProjectOOP.exceptions.TooManyRequestException;
import it.SpringBootAPI.ADSProjectOOP.model.*;

/** <b>Classe DescriptionStats: </b><br><br>
 * Classe che stila le statistiche sugli User (contenuti nei Vector) ottenuti dalla classe Database.<br>
 * Gli attrbuti sono:
 * <br>- averageCharacters = numero medio di caratteri delle descrizioni degli User (contenuti nel Vector)
 * <br>- linkPercentage = percentuale di descrizioni contenenti link
 * <br>- hashtagPercentage = percentuale di descrizioni contenenti hashtag
 * <br>- tagPercentage = percentuale di descrizioni contenenti tag
 * <br>- longestDescription = descrizione piu' lunga
 * <br>- shortestDescription = descrizione piu' corta<br>
 * 
 * @author Giordano Angelini
 * @see it.SpringBootAPI.ADSProjectOOP.database.Database
 * @see it.SpringBootAPI.ADSProjectOOP.model.User
 */

public class DescriptionStats {
	
	private float  averageCharacters;
	private String linkPercentage;
	private String hashtagPercentage;
	private String tagPercentage;
	private String longestDescription;
	private String shortestDescription;
	
	/** Costruttore che inizializza ogni attributo chiamando le varie funzioni per il calcolo delle statistiche.
	 * @throws ArithmeticException nel caso in cui ci sia una divisione per 0 (descrizioni dei friends tutte vuote).
	 * @throws NullPointerException se e' stato superato il limite di richieste al server.
	 */
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

	/** Metodo che conta le descrizioni non vuote (con un mumero di caratteri > 0).
	 * 
	 * @return Counter, un intero che rappresenta il numero di descrizioni non vuote.
	 */
	private int notEmptyDescriptions() {
		Database obj = new Database();
		int counter = 0;
		for (User singleUser : obj.getDatabase()) {
			if (!singleUser.getDescription().isEmpty()) counter++;
		}
		return counter;
	}
	
	/** Metodo che calcola il nuero di caratteri medi delle descizioni non vuote prese in esame.
	 * 
	 * @return Float che esprime il numero di caratteri medi.
	 */
	private float averageCharacters() {
		Database obj = new Database();
		int counter = 0;
		for (User singleUser : obj.getDatabase()) counter += singleUser.getCharacterNumber();
		return (float) counter/notEmptyDescriptions();
	}

	/** Metodo che calcola la percentuale di descrizioni con link tra le descrizioni non vuote.
	 * 
	 * @return Stringa per la rappresentazione percentuale del float calcolato.
	 */
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
	
	/** Metodo che calcola la percentuale di descrizioni con hashtag tra le descrizioni non vuote.
	 * 
	 * @return Stringa per la rappresentazione percentuale del float calcolato.
	 */
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
	
	/** Metodo che calcola la percentuale di descrizioni con tag tra le descrizioni non vuote.
	 * 
	 * @return Stringa per la rappresentazione percentuale del float calcolato.
	 */
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
	
	/** Metodo che calcola quale sia la descrizione più lunga (maggior numero di caratteri) tra quelle prese in esame.
	 * 
	 * @return Stringa contenente la descrizione più lunga.
	 */
	private String longestDescription() {
		Database obj = new Database();
		String max = "";
		for (User singleUser : obj.getDatabase()) 
			if (singleUser.getDescription().length() >= max.length()) max = singleUser.getDescription();
		return max;
	}
	
	/** Metodo che calcola quale sia la descrizione più corta (minor numero di caratteri) tra quelle prese in esame.
	 * 
	 * @return Stringa contenente la descrizione più corta.
	 */
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
