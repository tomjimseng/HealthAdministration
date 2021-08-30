package com.perscholas.health.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.perscholas.health.models.Contact;
import com.perscholas.health.repositories.ContactRepository;
import com.perscholas.health.services.ContactService;

/**
 * Service implementation for ContactService for to provide functionality for each abstract method.
 */

@Service
public class ContactServiceImpl implements ContactService {

	/**
	 * creating contact repository to utilize crud operations.
	 */
	
	private ContactRepository contactRepository;
	
	/**
	 * Autowired contact service implementations. Set this keyword for contactRepository to parameter given
	 * @param ContactRepository contactRepository.
	 * @return nothing.
	 */
	
	@Autowired
	public ContactServiceImpl(ContactRepository contactRepository) {
		this.contactRepository = contactRepository;
	}
	
	/**
	 * Override createMessage method implementations. Set this keyword for contactRepository to parameter given. 
	 * Saves new contact message to database.
	 * @param Contact contact.
	 * @return contactRepository.save(contact). 
	 */
	
	@Override
	public Contact createMessage(Contact contact) {
		return contactRepository.save(contact);
	}

	/**
	 * Override removeMessage method implementations. Set this keyword for contactRepository to parameter given. 
	 * deletes contact message from database.
	 * @param Contact contact.
	 * @return nothing. 
	 */
	
	@Override
	public void removeMessage(Contact contact) {
		contactRepository.delete(contact);
	}

	/**
	 * Override getMessages method implementations. ContactRepository to find all data and add to List. 
	 * Generates contact message list from database.
	 * @param nothing.
	 * @return (List<Contact>) contactRepository.findAll(). 
	 */
	
	@Override
	public List<Contact> getMessages() {
		return (List<Contact>) contactRepository.findAll();
	}

}
