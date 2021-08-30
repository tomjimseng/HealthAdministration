package com.perscholas.health.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * This is the controller class for the Index page.
 * Used to serve the html page for index.html
 */

@Controller
public class HomeController {

	/**
	 * Serves the home page by get mapping.
	 * Used to serve index.html and allow for navigation back to index page
	 */
	
		@GetMapping("/Index")
		public String getIndex() {
			return "index";
		}
	
}
