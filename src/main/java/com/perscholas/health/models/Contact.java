package com.perscholas.health.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Contact Class which creates the contact table within the database with the specified parameters.
 */

@Entity
@Table(name = "Contact")
public class Contact {

	/**
	 * Auto generate Id value within the database.
	 * variables to make up the columns of the table
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String fullName;
	private String email;
	private String phone;
	private String message;
	
	/**
	 * default empty constructor
	 */
	
	public Contact() {}
	
	/**
	 * Contact Constructor with super class and parameters.
	 * @param long id, String fullName, String email, String phone, String message.
	 * @return nothing.
	 */
	
	public Contact(long id, String fullName, String email, String phone, String message) {
		super();
		this.id = id;
		this.fullName = fullName;
		this.email = email;
		this.phone = phone;
		this.message = message;
	}
	
	/**
	 * Getter and Setter methods for the parameters of Contact in order to retrieve and store data.
	 */
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
}
