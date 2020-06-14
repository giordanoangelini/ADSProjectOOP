package it.SpringBootAPI.ADSProjectOOP.exceptions;

public class FetchException extends RuntimeException{

	private static final long serialVersionUID = 8838704443735091336L;

	public FetchException () {
		super ("ERROR: FAILED TO FETCH FRIENDS");
	}
}
