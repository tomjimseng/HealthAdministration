package com.perscholas.health.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.perscholas.health.models.Patient;

/**
 * Repository for patients extending CrudRepository if needed to utilize create, read, update, delete methods.
 */

@Repository
public interface PatientRepository extends CrudRepository <Patient, Long>{
	
	/**
	 * abstract method find patient by specified id.
	 */
	
	Optional<Patient> findById(long id);
	
	/**
	 * abstract method  to find patient information by checking specified first name.
	 */
	
	Patient findByFirstName(String firstName);
	
	/**
	 * abstract method  to find patient information by checking specified last name.
	 */
	
	Patient findByLastName(String lastName);
	
	/**
	 * abstract method  to find patient information by checking specified email.
	 */
	
	Patient findByEmail(String email);

}
