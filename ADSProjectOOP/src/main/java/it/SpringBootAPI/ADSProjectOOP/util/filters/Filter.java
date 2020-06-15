package it.SpringBootAPI.ADSProjectOOP.util.filters;

import java.util.Vector;

import it.SpringBootAPI.ADSProjectOOP.database.*;
import it.SpringBootAPI.ADSProjectOOP.model.*;

/**<b>SuperClasse Filter: </b>
 * da tale classe estendono tutti i tipi di filtri
 * @author Cristian Di Silvestre
 */
public class Filter {
	
	/**Metodo astratto implementato in ogni filtro.
	 * @param friend - sul quale si sta applicando il filtro
	 * @param param1
	 * @param param2
	 * @return boolean
	 */
	public boolean filter (User friend, Object param1, Object param2) {
		return true;
	}
	
	/**Scorre tramite un for tutti gli elementi del database 
	 * e applica il metodo filter su ognuno di loro, se tale metodo dà risultato positivo
	 * prende l'elemento del FrontDatabase corrispondente al friend e lo carica in un vettore di FrontUser.
	 * @param param1
	 * @param param2
	 * @return positiveFriendsVector: vettore contenente tutti i friends positivi al filtro.
	 * @see it.SpringBootAPI.ADSProjectOOP.database.Database
	 * @see it.SpringBootAPI.ADSProjectOOP.database.FrontDatabase
	 */
	public Vector <FrontUser> filterVector(Object param1, Object param2) {
		
		Vector <FrontUser> positiveFriendsVector = new Vector <FrontUser>();
		Database database = new Database();
		FrontDatabase frontDatabase = new FrontDatabase();
		
		for (int i = 0; i < database.getDatabase().size(); i++){
			if (filter(database.getDatabase().elementAt(i), param1, param2)) {
				positiveFriendsVector.add(frontDatabase.getFrontDatabase().elementAt(i));
			}
		}
		return positiveFriendsVector;
	}
}
