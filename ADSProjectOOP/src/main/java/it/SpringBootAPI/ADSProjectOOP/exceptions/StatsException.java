package it.SpringBootAPI.ADSProjectOOP.exceptions;

/** <b> Classe StatsException: </b><br><br>
 * Eccezione personalizzata che si verifica in caso di eccezone aritmetica nelle statistiche.
 * @author Giordano Angelini
 */
public class StatsException extends RuntimeException {

	private static final long serialVersionUID = -3105934294334431685L;
	
	public StatsException () {
		super("ERROR: UNABLE TO GET STATS DUE TO ARITHMETIC EXCEPTION");
	}
}
