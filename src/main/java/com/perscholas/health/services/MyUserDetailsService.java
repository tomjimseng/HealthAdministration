package com.perscholas.health.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.perscholas.health.models.Login;
import com.perscholas.health.repositories.LoginRepository;
import com.perscholas.health.security.CurrentUser;

/**
 * MyUserDetails Service implementing UserDetails Service for Login to provide application functionality.
 */

@Service
public class MyUserDetailsService implements UserDetailsService {

	/**
	 * Autowired to create loginRepository instance.
	*/
	
	@Autowired
	LoginRepository loginRepository;
	
	/**
	 * Override method for loadUsername. Checks user credentials and either throws error for missing or null credentials or logs in the user.
	 * @param String username (email).
	 * @return new CurrentUser(login).
	 * @throws UsernameNotFoundException
	 */
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Login login = loginRepository.findByEmail(username);
		
		if(login == null) {
			throw new UsernameNotFoundException("User not found!");
		}
		return new CurrentUser(login);
	}

}
