package com.perscholas.health.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.perscholas.health.models.Patient;
import com.perscholas.health.repositories.PatientRepository;
import com.perscholas.health.services.PatientService;

/**
 * Service implementation for PatientService for to provide functionality for
 * each abstract method.
 */

@Service
public class PatientServiceImpl implements PatientService {

	/**
	 * creating employee repository to utilize crud operations.
	 */
	
	private PatientRepository patientRepository;

	/**
	 * Autowired patient service implementations. Set this keyword for patientRepository to parameter given
	 * @param PatientRepository patientRepository.
	 * @return nothing.
	 */
	
	@Autowired
	public PatientServiceImpl(PatientRepository patientRepository) {
		this.patientRepository = patientRepository;
	}

	/**
	 * Override findById method implementations. Searches for patient id within parameter. 
	 * return patient object corresponding to patient id.
	 * @param long patientId.
	 * @return patientRepository.findById(patientId). 
	 */
	
	@Override
	public Optional<Patient> findById(long patientId) {
		return patientRepository.findById(patientId);
	}

	/**
	 * Override findByFirstName method implementations. Searches for patient first name within parameter. 
	 * return employee object corresponding to patient first name.
	 * @param String firstName.
	 * @return patientRepository.findByFirstName(firstName). 
	 */
	
	@Override
	public Patient findByFirstName(String firstName) {
		return patientRepository.findByFirstName(firstName);
	}

	/**
	 * Override findByLastName method implementations. Searches for patient last name within parameter. 
	 * return employee object corresponding to patient first name.
	 * @param String lastName.
	 * @return patientRepository.findByLastName(lastName). 
	 */
	
	@Override
	public Patient findByLastName(String lastName) {
		return patientRepository.findByLastName(lastName);
	}

	/**
	 * Override createPatient method implementations. 
	 * Saves new patient  to database.
	 * @param Patient patient.
	 * @return patientRepository.save(patient). 
	 */
	
	@Override
	public Patient createPatient(Patient patient) {
		return patientRepository.save(patient);
	}

	/**
	 * Override removePatient method implementations. Finds patient to delete by given id. 
	 * Deletes patient object from database based on id.
	 * @param long id.
	 * @return nothing. 
	 */
	
	@Override
	public void removePatient(long id) {
		patientRepository.deleteById(id);
	}
	
	/**
	 * Override getPatients method implementations. PatientRepository to find all patients within the database. 
	 * Returns all patients from the database.
	 * @param nothing.
	 * @return (List<Patient>) patientRepository.findAll(). 
	 */
	
	@Override
	public List<Patient> getPatients() {
		return (List<Patient>) patientRepository.findAll();
	}

}
