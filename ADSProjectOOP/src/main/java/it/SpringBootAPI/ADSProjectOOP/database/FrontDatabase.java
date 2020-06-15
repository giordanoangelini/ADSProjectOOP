package it.SpringBootAPI.ADSProjectOOP.database;

import java.util.Vector;

import it.SpringBootAPI.ADSProjectOOP.model.FrontUser;

/** <b> Classe Database: </b><br><br> Classe nella quale vengono salvati i Vector 
 * ottenuti dalla classe FrontUser.
 * @author Giordano Angelini
 */

public class FrontDatabase {
	
	private Vector <FrontUser> frontDatabase;
	
	/** Costruttore che inizializza ogni nuovo oggetto Database (Vector di oggetti User)
	 * riempiendolo con ognuno dei friends tramite la funzione frontFillUp() della classe FrontUser.
	 * @see it.SpringBootAPI.ADSProjectOOP.model.FrontUser
	 */
	public FrontDatabase() {
		FrontUser filler = new FrontUser();
		frontDatabase = filler.frontFillUp();
	}

	public Vector <FrontUser> getFrontDatabase() {
		return frontDatabase;
	}
}

