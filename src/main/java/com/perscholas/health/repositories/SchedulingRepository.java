package com.perscholas.health.repositories;

/**
 * Repository for scheduling extending CrudRepository if needed to utilize create, read, update, delete methods.
 */

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.perscholas.health.models.Scheduling;

@Repository
public interface SchedulingRepository extends CrudRepository <Scheduling, Long>{

	/**
	 * abstract method to find appointment by unique schedule id.
	 */
	
	Optional<Scheduling> findById(long scheduleId);
	
	/**
	 * abstract method to find patient by specified first name.
	 */
	
	Scheduling findByPatientFirstName(String patientFirstName);
	
	
	/**
	 * abstract method to find patient by specified last name.
	 */
	
	Scheduling findByPatientLastName(String patientLastName);
	
}
