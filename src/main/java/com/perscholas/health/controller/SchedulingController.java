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

import com.perscholas.health.models.Scheduling;
import com.perscholas.health.services.SchedulingService;

/**
 * This is the controller class for the Scheduling page. Used to serve the html page
 * for Scheduling.html
 */

@Controller
public class SchedulingController {

	/**
	 * This is the autowired for the scheduling page.
	 * Used to resolve and inject the collaborating beans from schedulingService
	 */
	
	@Autowired
	private SchedulingService schedulingService;
	
	/**
	 * This is get mapping to serve the Scheduling.html page.
	 * Allows to request handler methods and use for navigation purposes
	 */
	
	@GetMapping("/Scheduling")
	public String getScheduling(Model model) {
		List<Scheduling> scheduling = schedulingService.getSchedules();
		model.addAttribute("scheduling", scheduling);
		return "scheduling";
	}
	
	/**
	 * This is post mapping to send from data from the scheduling.html page.
	 * Posts data to the database from the webpage.
	 * @param Scheduling scheduling object.
	 * @return redirects the page to reload the Scheduling.html page.
	 */
	
	@PostMapping("/Scheduling/addAppointment")
	public String addAppointment(Scheduling scheduling) {
		schedulingService.createAppointment(scheduling);
		return "redirect:/Scheduling";
	}
	
	/**
	 * This is post mapping to send from data from the employee.html page.
	 * Finds a single appointment form the database by Id.
	 * @param long scheduleId object.
	 * @return Optional <Scheduling>.
	 */
	
	@RequestMapping("/Scheduling/findById")
	@ResponseBody
	public Optional<Scheduling> findById(long scheduleId) {
		return schedulingService.findById(scheduleId);
	}
	
	/**
	 * This is request put mapping to send from data from the employee.html page.
	 * Updates the scheduling information of an appointment.
	 * @param Scheduling scheduling object.
	 * @return redirects the page to reload the Scheduling.html page.
	 */
	
	@RequestMapping(value="/Scheduling/updateAppointment", method= {RequestMethod.PUT, RequestMethod.GET})
	public String updateAppointment(Scheduling scheduling) {
		schedulingService.createAppointment(scheduling);
		return "redirect:/Scheduling";
	}
	
	/**
	 * This is request delete mapping to send from data from the employee.html page.
	 * deletes data within the database indicated by appointment id.
	 * @param long id object.
	 * @return redirects the page to reload the Scheduling.html page.
	 */
	
	@RequestMapping(value="/Scheduling/removeAppointment", method= {RequestMethod.DELETE, RequestMethod.GET})
	public String removeAppointment(long id) {
		schedulingService.removeAppointment(id);
		return "redirect:/Scheduling";
	}
}
