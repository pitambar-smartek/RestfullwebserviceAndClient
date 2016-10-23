package com.yash.service;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yash.bean.Employee;

@Controller
public class EmployeeController {
	@RequestMapping(value="/employee/{employeeId}",method = RequestMethod.GET)
	@ResponseBody
	public Employee getEmployee(@PathVariable Integer employeeId) {
		System.out.println("pitambar");
		return new Employee();

	}

}

