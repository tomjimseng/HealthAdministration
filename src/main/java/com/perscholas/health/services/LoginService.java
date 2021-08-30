package com.perscholas.health.services;

import com.perscholas.health.models.Login;

/**
 * Service interface for Contact to provide application functionality.
 */

public interface LoginService {

	/**
	 * abstract method to find user login information by specified email.
	 */
	Login findByEmail(String email);
	
	/**
	 * abstract method to register new user login information by specified login details.
	 */
	
	Login registerLogin(Login login);
	
}
