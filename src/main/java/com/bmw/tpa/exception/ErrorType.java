package com.bmw.tpa.exception;
/**
 * The Enum ErrorType.
 *
 * @author niraj
 */
public enum ErrorType {

	
	/** The config initlization. */
	CONFIG_LOAD("Unable to load the file tpa.properties"),
	
	/** The config missing. */
	CONFIG_MISSING("Config file tpa.properties missing on the location specified"),
	
	;

	/** The message. */
	String message;

	/**
	 * Instantiates a new error type.
	 *
	 * @param message
	 *            the message
	 */
	private ErrorType(String message) {
		this.message = message;
	}

	/**
	 * Gets the message.
	 *
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}
}
