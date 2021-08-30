package com.perscholas.health.services;

import java.util.List;
import java.util.Optional;

import com.perscholas.health.models.Patient;

/**
 * Patient Service interface for Patient to provide application functionality.
 */

public interface PatientService {

	/**
	 * abstract method find patient by specified id.
	 */
	
	public Optional<Patient> findById(long patientId);
	
	/**
	 * abstract method find patient by specified first name.
	 */
	
	public Patient findByFirstName(String patientFirstName);
	
	/**
	 * abstract method find patient by specified last name.
	 */
	
	public Patient findByLastName(String patientLastName);
	
	/**
	 * abstract method create new patient object to add to the database.
	 */
	
	public Patient createPatient(Patient patient);
	
	/**
	 * abstract method delete patient by specified from database.
	 */
	
	public void removePatient(long id);
	
	/**
	 * abstract method get all patients in a list from the database.
	 */
	
	public List<Patient> getPatients();
}
