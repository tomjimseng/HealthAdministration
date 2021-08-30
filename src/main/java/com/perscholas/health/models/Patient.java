package com.perscholas.health.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Patient Class which creates the login table within the database with the specified parameters.
 */

@Entity
@Table(name = "Patient")
public class Patient {

	/**
	 * Auto generate Id value within the database.
	 * variables to make up the columns of the table
	 */
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String firstName;
	private String lastName;
	private String email;
	private String phone;
	private String bloodType;
	private String illness;
	
	/**
	 * default empty constructor
	 */
	
	public Patient() {}
	
	/**
	 * Patient Constructor with super class and parameters
	 * @param long id, String firstName, String lastName, String email, String phone, String bloodType, String illness.
	 * @return nothing.
	 */
	
	public Patient(long id, String firstName, String lastName, String email, String phone, String bloodType, String illness) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phone = phone;
		this.bloodType = bloodType;
		this.illness = illness;
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

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
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

	public String getBloodType() {
		return bloodType;
	}

	public void setBloodType(String bloodType) {
		this.bloodType = bloodType;
	}

	public String getIllness() {
		return illness;
	}

	public void setIllness(String illness) {
		this.illness = illness;
	}

	/**
	 * Override hashcode to maintain consistency with application execution.
	 */
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bloodType == null) ? 0 : bloodType.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + ((illness == null) ? 0 : illness.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + ((phone == null) ? 0 : phone.hashCode());
		return result;
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
		Patient other = (Patient) obj;
		if (bloodType == null) {
			if (other.bloodType != null)
				return false;
		} else if (!bloodType.equals(other.bloodType))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (id != other.id)
			return false;
		if (illness == null) {
			if (other.illness != null)
				return false;
		} else if (!illness.equals(other.illness))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (phone == null) {
			if (other.phone != null)
				return false;
		} else if (!phone.equals(other.phone))
			return false;
		return true;
	}

	/**
	 * Override toString if needed to print data from the database in order to determine correctness.
	 */
	
	@Override
	public String toString() {
		return "Patient [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", phone=" + phone + ", bloodType=" + bloodType + ", illness=" + illness + "]";
	}
	
	
}
