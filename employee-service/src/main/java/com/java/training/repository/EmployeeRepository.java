package com.java.training.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java.training.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

}
