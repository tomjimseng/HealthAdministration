package com.perscholas.health.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

import com.perscholas.health.services.LoginService;

/**
 * Spring Boot Security Configuration to allow users to log into the system.
 * Incorrect User information will not be authenticated.
 */

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

	/**
	 * Override method for configuring Http Security and Authorization.
	 * @param HttpSecurity http.
	 * @return nothing.
	 * @throws exception
	 */
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.csrf().disable()
		.authorizeRequests().antMatchers("/Login", "/resources/**", "/css/**", "/fonts/**", "/img/**").permitAll()
		.antMatchers("/Login/Register").permitAll()
		.anyRequest()
		.authenticated().and().formLogin().loginPage("/Login").permitAll().and().logout()
		.invalidateHttpSession(true).clearAuthentication(true)
		.logoutRequestMatcher(new AntPathRequestMatcher("/logout")).logoutSuccessUrl("/Login").permitAll();
	}

	/**
	 * Bean creation for bCryptPasswordEncoder. Allow for password encoding prior to saving within the database.
	 * @param none.
	 * @return new BCryptPasswordEncoder().
	 */
	
	@Bean
	public BCryptPasswordEncoder bCryptPasswordEncoder() {
		return new BCryptPasswordEncoder();
	}

	/**
	 * Autowired to create private variable of userDetailsService. Used to load user-specific data.
	*/
	@Autowired
	private UserDetailsService userDetailsService;

	/**
	 * Bean creation for AuthenticationProvider. Checks user details and password bCryptEncoder.
	 * Creates new instance of DaoAuthenticationProvider
	 * @param provider.
	 * @return provider.
	 */
	
	@Bean
	public AuthenticationProvider authenticationProvider() {
		DaoAuthenticationProvider provider = new DaoAuthenticationProvider();
		provider.setUserDetailsService(userDetailsService);
		provider.setPasswordEncoder(bCryptPasswordEncoder());
		return provider;
	}
}
