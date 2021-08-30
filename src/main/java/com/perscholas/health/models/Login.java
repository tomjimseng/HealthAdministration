package com.perscholas.health.models;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Login Class which creates the login table within the database with the specified parameters.
 */

@Entity
@Table(name = "Login")
public class Login {

	/**
	 * Auto generate Id value within the database.
	 * variables to make up the columns of the table
	 */
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private String email;
	private String password;
	
	/**
	 * default empty constructor
	 */
	
	public Login() {}
	
	/**
	 * Login Constructor with super class and parameters
	 * @param String email, String password.
	 * @return nothing.
	 */
	
	public Login(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}
	
	/**
	 * Getter and Setter methods for the parameters of Employee in order to retrieve and store data.
	 */
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	/**
	 * Override hashcode to maintain consistency with application execution.
	 */
	
	@Override
	public int hashCode() {
		return Objects.hash(email, id, password);
	}
	
	/**
	 * Override equals to maintain consistency with application execution when checking equivalent Objects.
	 */
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Login other = (Login) obj;
		return Objects.equals(email, other.email) && id == other.id && Objects.equals(password, other.password);
	}

	/**
	 * Override toString if needed to print data from the database in order to determine correctness.
	 */
	
	@Override
	public String toString() {
		return "Login [id=" + id + ", email=" + email + ", password=" + password + "]";
	}
	
}
