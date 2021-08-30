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

import com.perscholas.health.models.Patient;
import com.perscholas.health.services.PatientService;

/**
 * This is the controller class for the Patients page. Used to serve the html page
 * for Patients.html
 */

@Controller
public class PatientController {

	/**
	 * This is the autowired for the patients page. Used to resolve and inject the
	 * collaborating beans from patientService
	 */
	
	@Autowired
	private PatientService patientService;
	
	/**
	 * This is get mapping to serve the Patients.html page.
	 * Allows to request handler methods 
	 */
	
	@GetMapping("/Patients")
	public String getPatientsList(Model model) {
		List<Patient> patientList = patientService.getPatients();
		model.addAttribute("patients", patientList);
		return "patients";
	}
	
	/**
	 * This is post mapping to send from data from the patients.html page.
	 * Posts data to the database from the webpage to create a new patient.
	 * @param Patient patient object.
	 * @return redirects the page to reload the Patients.html page.
	 */
	
	@PostMapping("/Patients/addPatient")
	public String addPatient(Patient patient) {
		patientService.createPatient(patient);
		return "redirect:/Patients";
	}
	
	/**
	 * This is request mapping to send from data from the patients.html page.
	 * To find a patient but Id and servers it to the webpage.
	 * @param long id object.
	 * @return nothing.
	 */
	
	@RequestMapping("/Patients/findById")
	@ResponseBody
	public Optional<Patient> findById(long id) {
		return patientService.findById(id);
	}
	
	/**
	 * This is request put mapping to send from data from the patients.html page.
	 * Posts data to the webpage to allow for patient information to be updated then sent back to the database.
	 * @param Patient patient object.
	 * @return redirects the page to reload the Patients.html page.
	 */
	
	@RequestMapping(value="/Patients/updatePatient", method= {RequestMethod.PUT, RequestMethod.GET})
	public String updateEmployee(Patient patient) {
		patientService.createPatient(patient);
		return "redirect:/Patients";
	}
	
	/**
	 * This is request delete mapping to send from data from the patients.html page.
	 * Find patient by Id then deletes the patient from the database.
	 * @param long id object.
	 * @return redirects the page to reload the Patients.html page.
	 */
	
	@RequestMapping(value="/Patients/removePatient", method= {RequestMethod.DELETE, RequestMethod.GET})
	public String removePatient(long id) {
		patientService.removePatient(id);
		return "redirect:/Patients";
	}
}
