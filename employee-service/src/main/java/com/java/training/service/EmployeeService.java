package com.java.training.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.java.training.model.Employee;

@Service
public interface EmployeeService {
	

	public Employee saveemployee(Employee employee);
	public List<Employee>getallemployee();
	Employee getemployeebyid(Integer id);
	Employee getEmployee(Integer id);


}
