package it.SpringBootAPI.ADSProjectOOP.exceptions;


/** <b>FilterException: </b><br><br>
 * eccezione personalizzata che si verifica in caso di errore 
 * nell'inserimento del tipo di parametri 
 * @author Cristian Di Silvestre
 */
public class FilterException extends RuntimeException{
	
	private static final long serialVersionUID = -810909024563440569L;
	
	public FilterException () {
		super ("ERROR: WRONG PARAMETER FORMAT");
	}

}
