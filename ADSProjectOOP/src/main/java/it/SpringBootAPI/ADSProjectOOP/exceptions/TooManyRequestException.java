package it.SpringBootAPI.ADSProjectOOP.exceptions;

public class TooManyRequestException extends RuntimeException {

	private static final long serialVersionUID = -7019077010414167503L;

	public TooManyRequestException(String message) {
		super(message);
	}

}
