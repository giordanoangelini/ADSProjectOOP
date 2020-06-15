package it.SpringBootAPI.ADSProjectOOP.database;

import java.util.Vector;

import it.SpringBootAPI.ADSProjectOOP.model.User;

/** <b> Classe Database: </b><br><br> Classe nella quale vengono salvati i Vector 
 * ottenuti dalla classe User.
 * @author Giordano Angelini
 */

public class Database {
	
	private Vector <User> database;
	
	/** Costruttore che inizializza ogni nuovo oggetto Database (Vector di oggetti User)
	 * riempiendolo con ognuno dei friends tramite la funzione fillUp() della classe User.
	 * @see it.SpringBootAPI.ADSProjectOOP.model.User
	 */
	public Database() {
		User filler = new User();
		database = filler.fillUp();
	}

	public Vector <User> getDatabase() {
		return database;
	}
}

