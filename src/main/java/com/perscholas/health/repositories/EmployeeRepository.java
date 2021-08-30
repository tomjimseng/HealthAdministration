package com.perscholas.health.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.perscholas.health.models.Employee;

/**
 * Repository for employee extending CrudRepository if needed to utilize create, read, update, delete methods.
 */

@Repository
public interface EmployeeRepository extends CrudRepository <Employee, Long>{

	/**
	 * abstract method to find employee with specified Id.
	 */
	Optional<Employee> findById(long id);
	
	/**
	 * abstract method to find employee by first name.
	 */
	Employee findByFirstName(String employeeFirstName);
	
	/**
	 * abstract method to find employee by last name.
	 */
	Employee findByLastName(String employeeLastName);
	
}
