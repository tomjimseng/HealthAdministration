package com.perscholas.health.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.perscholas.health.models.Employee;
import com.perscholas.health.services.EmployeeService;

/**
 * This is the controller class for the employee page.
 * Used to serve the html page for Employee.html
 */

@Controller
public class EmployeeController {

	/**
	 * This is the autowired for the employee page.
	 * Used to resolve and inject the collaborating beans from employeeService
	 */
	
	@Autowired
	private EmployeeService employeeService;
	
	/**
	 * This is get mapping to serve the Employee.html page.
	 * Allows to request handler methods 
	 */
	
	@GetMapping("/Employee")
	public String getEmployee(Model model) {
	List<Employee> employeeList = employeeService.getEmployees();
	model.addAttribute("employees", employeeList);
		return "employee";
	}
	
	/**
	 * This is post mapping to send from data from the employee.html page.
	 * Posts data to the database from the webpage.
	 * @param Employee employee object.
	 * @return redirects the page to reload the Employee.html page.
	 */
	
	@PostMapping("/Employee/addEmployee")
	public String addEmployee(Employee employee) {
		employeeService.createEmployee(employee);
		return "redirect:/Employee";
	}
	
	/**
	 * This is request mapping to receive data from the healthadmin database and serve it to the webpage.
	 * Find a single employee by the auto-generated Id from the database.
	 * @param long id.
	 * @return Optional<Employee>.
	 */
	
	@RequestMapping("/Employee/findById")
	@ResponseBody
	public Optional<Employee> findById(long id) {
		return employeeService.findById(id);
	}
	
	/**
	 * This is request mapping to receive data from the healthadmin database to be updated.
	 * Finds a single employee from the database to update information fields.
	 * @param Employee employee object.
	 * @return redirects the page to reload the Employee.html page.
	 */
	
	@RequestMapping(value="/Employee/updateEmployee", method= {RequestMethod.PUT, RequestMethod.GET})
	public String updateEmployee(Employee employee) {
		employeeService.updateEmployee(employee);
		return "redirect:/Employee";
	}
	
	/**
	 * This is request mapping to receive data from the healthadmin database to be deleted.
	 * Find a single employee by the auto-generated Id from the database and remove from the database.
	 * @param long id.
	 * @return nothing.
	 */
	
	@RequestMapping(value="/Employee/removeEmployee", method= {RequestMethod.DELETE, RequestMethod.GET})
	public String removeEmployee(long id) {
		employeeService.removeEmployee(id);
		return "redirect:/Employee";
	}
}
