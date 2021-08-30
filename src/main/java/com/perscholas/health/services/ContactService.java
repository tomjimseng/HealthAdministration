package com.perscholas.health.services;

import java.util.List;

import com.perscholas.health.models.Contact;

/**
 * Service interface for Contact to provide application functionality.
 */

public interface ContactService {

	/**
	 * abstract method to create a new Contact object to be added to the database.
	 */
	
	public Contact createMessage(Contact contact);
	
	/**
	 * abstract method for deleting Contact Object from the database.
	 */
	
	public void removeMessage(Contact contact);
	
	/**
	 * abstract method to get list of all Contact messages from the database.
	 */
	
	public List<Contact> getMessages();
	
}
