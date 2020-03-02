package com.java.training.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.java.training.model.Employee;
import com.java.training.repository.EmployeeRepository;
import com.java.training.service.EmployeeService;

@RestController
//@RequestMapping("/services")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeservice;

	@Autowired
	private EmployeeRepository emprepo;

	@RequestMapping("/hello")
	public String GetallEmployee() {
		return "<h1>hello Baby</h1>";

	}

	@RequestMapping(value = "/saveemployee", method = RequestMethod.POST)
	public Employee saveemployee(@RequestBody Employee employee) {
		return emprepo.save(employee);
	}

//	@RequestMapping(value = "/saveemployee", method = RequestMethod.POST)
//    public Employee save(@RequestBody Employee employee) {
//        if (employee.getTelephones() != null) {
//            for (Telephone telephone : employee.getTelephones()) {
//                telephone.setEmployee(employee);
//            }
//        }
//        return employeeservice.saveemployee(employee);
//    }

	@RequestMapping(value = "/getemployee", method = RequestMethod.GET)
	public List<Employee> getAllemployee() {
		return employeeservice.getallemployee();
//		return Employee.getAllEmployees();
	}

	@RequestMapping(value = "/employeeby/{id}", method = RequestMethod.GET)
	public Employee getEmployee(@PathVariable Integer id) {
		return employeeservice.getEmployee(id);
	}

	@RequestMapping(value = "/employee/{id}", method = RequestMethod.GET)
	public Employee getEmployeebyid(@PathVariable Integer id) {
		return employeeservice.getemployeebyid(id);
	}

}
