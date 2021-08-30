package com.perscholas.health.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.perscholas.health.models.Login;
import com.perscholas.health.services.LoginService;

/**
 * This is the controller class for the login page. Used to serve the html page
 * for Login.html
 */

@Controller
public class LoginController {

	/**
	 * This is the autowired for the login page. Used to resolve and inject the
	 * collaborating beans from loginService
	 */

	@Autowired
	private LoginService loginService;

	/**
	 * This is get mapping to serve the Login.html page. Allows to request handler
	 * methods
	 */

	@GetMapping("/Login")
	public String getLogin() {
		return "login";
	}

	/**
	 * This is post mapping to send from data in order to register a new user
	 * Login.html page. Posts data to the database from the webpage with encrypted
	 * password.
	 * 
	 * @param Login login object.
	 * @return redirects the page to reload the Login.html page.
	 */

	@PostMapping("/Login/Register")
	public String register(Login login) {
		loginService.registerLogin(login);
		return "redirect: /Login";
	}
}
