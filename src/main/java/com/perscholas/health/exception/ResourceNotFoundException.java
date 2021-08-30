package com.perscholas.health.exception;

/**
 * Custom exception to check whether resources within the services of this application are found.
 */

public class ResourceNotFoundException extends RuntimeException{
	
	 /**
	 * serialVersionUID used to remember versions of a Serializable class
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * super used to initialize exception message
	 */
	
	public ResourceNotFoundException() {
	        super();
	    }
	
	/**
	 * Exception to be thrown when email is not found within the database or equal to null.
	 * super used to initialize exception message
	 * @param String email.
	 * @return nothing.
	 */
	public ResourceNotFoundException(String email) {
	        super(email);
	    }
	    
}
