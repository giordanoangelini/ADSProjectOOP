package it.SpringBootAPI.ADSProjectOOP.exceptions;

/** <b> Classe TooManyRequestException: </b><br><br>
 * Eccezione personalizzata che si verifica in caso di NullPointerException nelle classi User, FrontUser, DescriptionStats, Filter.
 * @author Giordano Angelini
 */
public class TooManyRequestException extends RuntimeException {

	private static final long serialVersionUID = -7019077010414167503L;

	public TooManyRequestException() {
		super("ERROR: TOO MANY REQUESTS");
	}

}
