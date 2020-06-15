package it.SpringBootAPI.ADSProjectOOP.model;

import java.util.Vector;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import it.SpringBootAPI.ADSProjectOOP.exceptions.TooManyRequestException;
import it.SpringBootAPI.ADSProjectOOP.fetch.FetchClass;

/** <b> Classe FrontUser: </b><br><br> Classe che definisce oggetti di tipo User copiando gli attributi
 * dal JSONObject (ottenuto dalla FetchClass).<br><br>
 * Attributi: 
 * <br>- name = nome del friend Twitter
 * <br>- description = descrizione del friend Twitter<br>
 *
 * @author Giordano Angelini
 */

public class FrontUser {
	
	protected String name;
	protected String description;
	
	/** Metodo che inizializza il nostro oggetto User ottenendo i valori degli attributi dal JSONObject proveniente dalla FetchClass.
	 * 
	 * @return Vettore di oggetti FrontUser, ogni oggetto ha i suoi attributi inizializzati e ben definiti.
	 * @throws NullPointerException se e' stato superato il limite di richieste al server.
	 * @see it.SpringBootAPI.ADSProjectOOP.fetch.FetchClass
	 */
	public Vector <FrontUser> frontFillUp() {
		try {
			FetchClass fetchObject = new FetchClass();
			JSONObject jObject = fetchObject.parsing();
			
			JSONArray jArray = (JSONArray) (jObject.get("users"));
			
			Vector <FrontUser> frontUserVector = new Vector <FrontUser>();
			
			for(Object object : jArray) {
	
				if (object instanceof JSONObject) {
			    	JSONObject object1 = (JSONObject)object; 
			    	
			    	FrontUser temp = new FrontUser();
			    	temp.name = (String) object1.get("name");
			    	temp.description = (String) object1.get("description");
			    	
			    	frontUserVector.add(temp);
		        }
			}
			return frontUserVector;
		} catch (NullPointerException e) {
			throw new TooManyRequestException();
		}
	}

	public String getName() {
		return name;
	}
	
	public String getDescription() {
		return description;
	}
}
