package com.perscholas.health.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.perscholas.health.models.Contact;
import com.perscholas.health.models.Patient;
import com.perscholas.health.services.ContactService;

/**
 * This is the controller class for the contacts page.
 * Used to serve the html page for ContactUs.html
 */

@Controller
public class ContactController {

	/**
	 * This is the autowired for the contacts page.
	 * Used to resolve and inject the collaborating beans from contactService
	 */
	
	@Autowired
	private ContactService contactService;
	
	/**
	 * This is get mapping to serve the ContactUs.html page.
	 * Allows to request handler methods 
	 */
	
	@GetMapping("/ContactUs")
	public String getContactUs() {
		return "contactUs";
	}
	
	/**
	 * This is post mapping to send from data from the contact.html page.
	 * Posts data to the database from the webpage.
	 * @param Contact contact object.
	 * @return redirects the page to reload the contact.html page.
	 */
	
	@PostMapping("/ContactUs/createMessage")
	public String createMessage(Contact contact) {
		contactService.createMessage(contact);
		return "redirect:/ContactUs";
	}
}
