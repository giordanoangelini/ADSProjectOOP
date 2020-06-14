package it.SpringBootAPI.ADSProjectOOP.exceptions;

public class FilterException extends RuntimeException{
	
	private static final long serialVersionUID = -810909024563440569L;
	
	public FilterException () {
		super ("ERROR: WRONG PARAMETER FORMAT");
	}

}
