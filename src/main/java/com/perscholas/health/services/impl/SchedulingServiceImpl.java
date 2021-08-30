package com.perscholas.health.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.perscholas.health.models.Scheduling;
import com.perscholas.health.repositories.SchedulingRepository;
import com.perscholas.health.services.SchedulingService;

/**
 * Service implementation for SchedulingService for to provide functionality for each abstract method.
 */

@Service
public class SchedulingServiceImpl implements SchedulingService {

	/**
	 * creating scheduling repository to utilize crud operations.
	 */
	
	private SchedulingRepository schedulingRepository;
	
	/**
	 * Autowired scheduling service implementations. Set this keyword for schedulingRepository to parameter given
	 * @param SchedulingRepository schedulingRepository.
	 * @return nothing.
	 */
	
	@Autowired
	public SchedulingServiceImpl(SchedulingRepository schedulingRepository) {
		this.schedulingRepository = schedulingRepository;
	}

	/**
	 * Override findById method implementations. Searches for schedule id within parameter. 
	 * return scheduling object corresponding to schedule id.
	 * @param long scheduleId.
	 * @return schedulingRepository.findById(scheduleId). 
	 */
	
	@Override
	public Optional<Scheduling> findById(long scheduleId) {
		return schedulingRepository.findById(scheduleId);
	}
	
	/**
	 * Override findByPatientFirstName method implementations. Searches for appointment with first name within parameter. 
	 * return scheduling object corresponding to patient first name.
	 * @param String patientFirstName.
	 * @return schedulingRepository.findByPatientFirstName(patientFirstName). 
	 */
	
	@Override
	public Scheduling findByPatientFirstName(String patientFirstName) {
		return schedulingRepository.findByPatientFirstName(patientFirstName);
	}

	/**
	 * Override findByPatientLastName method implementations. Searches for appointment with last name within parameter. 
	 * return scheduling object corresponding to patient first name.
	 * @param String patientLastName.
	 * @return schedulingRepository.findByPatientLastName(patientLastName). 
	 */
	
	@Override
	public Scheduling findByPatientLastName(String patientLastName) {
		return schedulingRepository.findByPatientLastName(patientLastName);
	}

	/**
	 * Override createAppointment method implementations. 
	 * Saves new scheduling to database.
	 * @param Scheduling scheduling.
	 * @return schedulingRepository.save(scheduling). 
	 */
	
	@Override
	public Scheduling createAppointment(Scheduling scheduling) {
		return schedulingRepository.save(scheduling);
	}

	/**
	 * Override removeAppointment method implementations. Finds appointment to delete by given id. 
	 * Deletes scheduling object from database based on id.
	 * @param long id.
	 * @return nothing. 
	 */
	
	@Override
	public void removeAppointment(long id) {
		schedulingRepository.deleteById(id);
	}

	/**
	 * Override getSchedules method implementations. SchedulingRepository to find all appointments within the database. 
	 * Returns all appointments from the database.
	 * @param nothing.
	 * @return (List<Scheduling>) schedulingRepository.findAll(). 
	 */
	
	@Override
	public List<Scheduling> getSchedules() {
		return (List<Scheduling>) schedulingRepository.findAll();
	}

}
