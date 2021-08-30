package com.perscholas.health.security;

import java.util.Collection;
import java.util.Collections;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.perscholas.health.models.Login;

/**
 * Current user class which implements the UserDetails interface for utilizing spring security
 */

public class CurrentUser implements UserDetails{

	/**
	 * serialVersionUID used to remember versions of a Serializable class
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * private variable of the Login model
	 */
	
	private Login login;
	
	/**
	 * CurrentUser Constructor to set parameter for login information
	 * @param Login login
	 * @return nothing.
	 */

	public CurrentUser(Login login) {
		this.login = login;
	}

	/**
	 * grants user authorization based on granted authority 
	 * @param none.
	 * @return Collections.singleton(new SimpleGrantedAuthority("USER")). Simply every user in the system is granted user rights.
	 */
	
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return Collections.singleton(new SimpleGrantedAuthority("USER"));
	}

	/**
	 * Override method for getting password information from the database.
	 * @param none.
	 * @return login.getPassword().
	 */
	
	@Override
	public String getPassword() {
		return login.getPassword();
	}

	/**
	 * Override method for getting email information from the database.
	 * @param none.
	 * @return login.getEmail().
	 */
	
	@Override
	public String getUsername() {
		return login.getEmail();
	}

	/**
	 * method to check if account is still active
	 *@return true. Set value to true by default 
	 */
	
	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	/**
	 * method to check if account is locked 
	 *@return true. Set value to true by default 
	 */
	
	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	/**
	 * method to check if account has expired credentials
	 *@return true. Set value to true by default 
	 */
	
	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	/**
	 * method to check if account is enabled or disabled 
	 *@return true. Set value to true by default 
	 */
	
	@Override
	public boolean isEnabled() {
		return true;
	}

}
