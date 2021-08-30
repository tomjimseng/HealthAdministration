package com.perscholas.health.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.perscholas.health.exception.ResourceNotFoundException;
import com.perscholas.health.models.Login;
import com.perscholas.health.repositories.LoginRepository;
import com.perscholas.health.services.LoginService;

/**
 * Service implementation for LoginService for to provide functionality for each abstract method.
 */

@Service
public class LoginServiceImpl implements LoginService {

	/**
	 * creating login repository to utilize crud operations.
	 */
	
	private LoginRepository loginRepository;
	
	/**
	 * Autowired BCryptPasswordEncoder for implementations.
	 */
	
	@Autowired
	private BCryptPasswordEncoder encoder;

	/**
	 * Autowired login service implementations. Set this keyword for loginRepository to parameter given
	 * @param LoginRepository loginRepository.
	 * @return nothing.
	 */
	
	@Autowired
	public LoginServiceImpl(LoginRepository loginRepository) {
		this.loginRepository = loginRepository;
	}

	/**
	 * Override findByEmail method implementations. Searches for employee email given in parameter. 
	 * return login object corresponding to employee email.
	 * @param String email.
	 * @return loginRepository.findByEmail(email).
	 * @throws ResourceNotFoundException.
	 */
	
	@Override
	public Login findByEmail(String email) throws ResourceNotFoundException {
		if (email == null) {
			throw new ResourceNotFoundException("Email is not found in the system");
		} else {
			return loginRepository.findByEmail(email);
		}
	}

	/**
	 * Override registerLogin method implementations. Encodes password with bCrypt prior to saving to database. 
	 * return login object that was saved to database.
	 * @param Login login.
	 * @return loginRepository.save(login). 
	 */
	
	@Override
	public Login registerLogin(Login login) {
		login.setPassword(encoder.encode(login.getPassword()));
		return loginRepository.save(login);
	}

}
