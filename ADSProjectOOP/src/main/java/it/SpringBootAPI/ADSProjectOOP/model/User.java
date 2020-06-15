package it.SpringBootAPI.ADSProjectOOP.model;

import java.util.Vector;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import it.SpringBootAPI.ADSProjectOOP.exceptions.TooManyRequestException;
import it.SpringBootAPI.ADSProjectOOP.fetch.FetchClass;

/** <b> Classe User: </b><br><br> Classe che definisce oggetti di tipo User copiando gli attributi
 * dal JSONObject (ottenuto dalla FetchClass) per poi eseguire funzioni per descrivere meglio le proprieta' di ogni User.<br><br>
 * Attributi: 
 * <br>- ID = codice numerico del friend Twitter
 * <br>- screenName = nome visualizzato del friend Twitter
 * <br>- characterNumber = numero di caratteri della descrizione del friend Twitter
 * <br>- descriptionProperties<br><br>
 *
 * Estende la classe FrontUser nella quale sono definiti 2 attributi comuni alle due classi (name e description).<br><br>
 * @author Giordano Angelini
 * @see it.SpringBootAPI.ADSProjectOOP.model.FrontUser
 */

public class User extends FrontUser {
	
	private long ID;
	private String screenName;
	private int characterNumber;
	private int descriptionProperties;
	
	/** Metodo che inizializza il nostro oggetto User ottenendo i valori degli attributi dal JSONObject proveniente dalla FetchClass.
	 * Inoltre calcola (tramite i metodi lenght() e properties()) le caratteristiche di ogni User.
	 * 
	 * @return Vettore di oggetti User, ogni oggetto ha i suoi attributi inizializzati e ben definiti.
	 * @throws NullPointerException se e' stato superato il limite di richieste al server.
	 * @see it.SpringBootAPI.ADSProjectOOP.fetch.FetchClass
	 */
	public Vector <User> fillUp() {
		try {
			FetchClass fetchObject = new FetchClass();
			JSONObject jObject = fetchObject.parsing();
			
			JSONArray jArray = (JSONArray) (jObject.get("users"));
			
			Vector <User> userVector = new Vector <User>();
			
			for(Object object : jArray) {
	
				if (object instanceof JSONObject) {
			    	JSONObject object1 = (JSONObject)object; 
			    	
			    	User temp = new User();
			    	temp.ID = (long) object1.get("id");
			    	temp.name = (String) object1.get("name");
			    	temp.screenName = (String) object1.get("screen_name");
			    	temp.description = (String) object1.get("description");
			    	temp.characterNumber = temp.description.length();
			    	temp.descriptionProperties = properties(temp.description);
			    	
			    	userVector.add(temp);
		        }
			}
			return userVector;
		} catch (NullPointerException e) {
			throw new TooManyRequestException();
		}
	}
	
	/** Metodo che definisce le caratteristiche di ogni descrizione assegnando un intero (valutato poi nelle statistiche)
	 * all'oggetto User considerando la presenza, o meno, di link, hashtag e tag nella descrizione o della descrizione stessa;
	 * a questo scopo chiama i metodi isThereLink(), isThereHashtag() e isThereTag().
	 * 
	 * @param text : Stringa che contiene la descrizione da controllare per ottenerne le proprietà.
	 * @return Intero che tiene conto delle proprietà della stringa.
	 */
	private int properties(String text) {
		int p = 0;
		if (isThereDescription(text)) {
			p = 1;
			boolean link = isThereLink(text);
			boolean hashtag = isThereHashtag(text);
			boolean tag = isThereTag(text);
			if (!link && !hashtag &&  tag)  p = 2;
			if (!link &&  hashtag && !tag)  p = 3;
			if (!link &&  hashtag &&  tag)  p = 4;
			if ( link && !hashtag && !tag)  p = 5;
			if ( link && !hashtag &&  tag)  p = 6;
			if ( link &&  hashtag && !tag)  p = 7;
			if ( link &&  hashtag &&  tag)  p = 8;
		}
		return p;
	}
	
	/** Metodo che stabiisce se la descrizione è presente.
	 * 
	 * @param text : Stringa che contiene la descrizione da controllare.
	 * @return True o false a seconda che la descrizione sia presente o meno.
	 */
	private boolean isThereDescription(String text) {
		if (text.length() == 0) return false;
		else return true;
	}
	
	/** Metodo che stabiisce se nella descrizione è presente un link.
	 * 
	 * @param text : Stringa che contiene la descrizione da controllare.
	 * @return True o false a seconda della presenza, o meno, di un link nella descrizione.
	 */
	private boolean isThereLink(String text) {
		if (text.contains(" " + "https://") ||
			text.contains(" " + "www.")) return true;
		return false;
	}
	
	/** Metodo che stabiisce se nella descrizione è presente un hashtag.
	 * 
	 * @param text : Stringa che contiene la descrizione da controllare.
	 * @return True o false a seconda della presenza, o meno, di un hashtag nella descrizione.
	 */
	private boolean isThereHashtag(String text) {
		if (text.contains(" " + "#")) return true;
		return false;
	}
	
	/** Metodo che stabiisce se nella descrizione è presente un tag.
	 * 
	 * @param text : Stringa che contiene la descrizione da controllare.
	 * @return True o false a seconda della presenza, o meno, di un tag nella descrizione.
	 */
	private boolean isThereTag(String text) {
		if (text.contains(" " + "@")) return true;
		return false;
	}
	
	public long getID() {
		return ID;
	}

	public String getScreenName() {
		return screenName;
	}

	public int getCharacterNumber() {
		return characterNumber;
	}

	public int getDescriptionProperties() {
		return descriptionProperties;
	}
}
