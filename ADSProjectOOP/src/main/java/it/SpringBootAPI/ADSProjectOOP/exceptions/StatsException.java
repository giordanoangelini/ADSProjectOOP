package it.SpringBootAPI.ADSProjectOOP.exceptions;

public class StatsException extends RuntimeException {

	private static final long serialVersionUID = -3105934294334431685L;
	
	public StatsException (String message) {
		super(message);
	}
}
