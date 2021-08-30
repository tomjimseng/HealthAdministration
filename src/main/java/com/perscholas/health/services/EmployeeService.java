package com.perscholas.health.services;

import java.util.List;
import java.util.Optional;

import com.perscholas.health.models.Employee;

/**
 * Service interface for Employee to provide application functionality.
 */

public interface EmployeeService {

	/**
	 * abstract method find employee by specified id.
	 */
	
	public Optional<Employee> findById(long id);
	
	/**
	 * abstract method find employee by specified first name.
	 */
	
	public Employee findByFirstName(String employeeFirstName);
	
	/**
	 * abstract method find patient by specified last name.
	 */
	
	public Employee findByLastName(String employeeLastName);
	
	/**
	 * abstract method to create a new employee to add to the database.
	 */
	
	public Employee createEmployee(Employee employee);
	
	/**
	 * abstract method delete an employee from the database.
	 */
	
	public void removeEmployee(long id);
	
	/**
	 * abstract method to update existing employee information within the database.
	 */
	
	public void updateEmployee(Employee employee);
	
	/**
	 * abstract method to get a list of all employees existing within the database.
	 */
	
	public List<Employee> getEmployees();
}
