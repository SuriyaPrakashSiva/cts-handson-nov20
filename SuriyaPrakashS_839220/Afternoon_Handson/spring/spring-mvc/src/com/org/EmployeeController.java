package com.org;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeService service;

	@RequestMapping(value = "/time", method = RequestMethod.GET)
	public ModelAndView viewDateTime() {
		ModelAndView mav = new ModelAndView("hello", "msg", service.fetchDateTimeService());
		return mav;
	}
	
	@RequestMapping(value = "/sortByNameReverse", method = RequestMethod.GET)
	public ModelAndView viewAllEmployeesNameInReverseOrder() {
		ModelAndView mav = new ModelAndView("hello", "msg", service.getAllEmployeesNamesInReverseOrder());
		return mav;
	}
	
	@RequestMapping(value = "/sortByNameAscending", method = RequestMethod.GET)
	public ModelAndView viewAllEmployeesNameInAscendingOrder() {
		ModelAndView mav = new ModelAndView("hello", "msg", service.getAllEmployeesNamesInAscendingOrder());
		return mav;
	}
	@RequestMapping(value = "/sortByIdReverse", method = RequestMethod.GET)
	public ModelAndView viewAllEmployeesIdInReverseOrder() {
		ModelAndView mav = new ModelAndView("hello", "msg", service.getAllEmployeesIdInReverseOrder());
		return mav;
	}
	@RequestMapping(value = "/sortByIdAscending", method = RequestMethod.GET)
	public ModelAndView viewAllEmployeesIdInAscendingOrder() {
		ModelAndView mav = new ModelAndView("hello", "msg", service.getAllEmployeesIdInAscendingOrder());
		return mav;
	}
	@RequestMapping(value = "/sortBySalaryReverse", method = RequestMethod.GET)
	public ModelAndView viewAllEmployeesSalaryInReverseOrder() {
		ModelAndView mav = new ModelAndView("hello", "msg", service.getAllEmployeesSalaryInReverseOrder());
		return mav;
	}
	@RequestMapping(value = "/sortBySalaryAscending", method = RequestMethod.GET)
	public ModelAndView viewAllEmployeesSalaryInAscendingOrder() {
		ModelAndView mav = new ModelAndView("hello", "msg", service.getAllEmployeesSalaryInAscendingOrder());
		return mav;
	}
}