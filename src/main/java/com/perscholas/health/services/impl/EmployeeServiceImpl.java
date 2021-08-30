package com.perscholas.health.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.perscholas.health.models.Employee;
import com.perscholas.health.repositories.EmployeeRepository;
import com.perscholas.health.services.EmployeeService;

/**
 * Service implementation for EmployeeService for to provide functionality for each abstract method.
 */

@Service
public class EmployeeServiceImpl implements EmployeeService {

	/**
	 * creating employee repository to utilize crud operations.
	 */
	
	private EmployeeRepository employeeRepository;
	
	/**
	 * Autowired employee service implementations. Set this keyword for employeeRepository to parameter given
	 * @param EmployeeRepository employeeRepository.
	 * @return nothing.
	 */
	
	@Autowired
	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}
	
	/**
	 * Override findById method implementations. Searches for employee id within parameter. 
	 * return employee object corresponding to employee id.
	 * @param long id.
	 * @return employeeRepository.findById(id). 
	 */
	
	@Override
	public Optional<Employee> findById(long id) {
		return employeeRepository.findById(id);
	}

	/**
	 * Override findByFirstName method implementations. Searches for employee with first name within parameter. 
	 * return employee object corresponding to employee first name.
	 * @param String firstName.
	 * @return employeeRepository.findByFirstName(firstName). 
	 */
	
	@Override
	public Employee findByFirstName(String firstName) {
		return employeeRepository.findByFirstName(firstName);
	}

	/**
	 * Override findByLastName method implementations. Searches for employee with last name within parameter. 
	 * return employee object corresponding to employee last name.
	 * @param String lastName.
	 * @return employeeRepository.findByLastName(lastName). 
	 */
	
	@Override
	public Employee findByLastName(String lastName) {
		return employeeRepository.findByLastName(lastName);
	}

	/**
	 * Override createEmployee method implementations. 
	 * Saves new employee  to database.
	 * @param Employee employee.
	 * @return employeeRepository.save(employee). 
	 */
	
	@Override
	public Employee createEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}

	/**
	 * Override removeEmployee method implementations. Finds employee to delete by given id. 
	 * Deletes employee object from database based on id.
	 * @param long id.
	 * @return nothing. 
	 */
	
	@Override
	public void removeEmployee(long id) {
		employeeRepository.deleteById(id);
	}

	/**
	 * Override getEmployees method implementations. EmployeeRepository to find all employees within the database. 
	 * Returns all employees from the database.
	 * @param nothing.
	 * @return (List<Employee>) employeeRepository.findAll(). 
	 */
	
	@Override
	public List<Employee> getEmployees() {
		return (List<Employee>) employeeRepository.findAll();
	}

	/**
	 * Override updateEmployee method implementations. Finds specified employee to update information. 
	 * Updates saved employee information from database.
	 * @param Employee employee.
	 * @return nothing. 
	 */
	
	@Override
	public void updateEmployee(Employee employee) {
		employeeRepository.save(employee);
	}

}
