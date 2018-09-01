/**
 * 
 */
package com.employee.basic.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.employee.basic.bean.EmployeeBean;
import com.employee.basic.service.EmployeeBasicDataService;

/**
 * Controller to hit the respesctive methods
 * 
 * @author Abhi
 *
 */

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeBasicDataService service;

	/**
	 * Controller method to get the basic details of all the Employees
	 * 
	 * @return {@link ResponseEntity}
	 */
	@RequestMapping(value = "emp/basic/data/getAllEmployees", produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.GET)
	public ResponseEntity<List<EmployeeBean>> getAllEmployees() {
		List<EmployeeBean> empList = service.getAllEmployeeBasicData();
		return new ResponseEntity<List<EmployeeBean>>(empList, HttpStatus.OK);
	}
}
