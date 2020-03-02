package com.java.training.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.java.training.model.Allocation;
import com.java.training.service.AllocationService;

@RestController
public class AllocationController {
	
	@Autowired
	AllocationService allocationservice;
	
	
	@RequestMapping(value = "/saveallocation", method = RequestMethod.POST)
	public Allocation savealoction(@RequestBody Allocation allocation) {
		return allocationservice.saveallocation(allocation);
	}
	
	@RequestMapping(value="/getallocation",method=RequestMethod.GET)
	public List<Allocation>getallocation(){
		return allocationservice.getallallocation();
	}
	
	@RequestMapping(value = "/allocation/{id}", method = RequestMethod.GET)
    public Allocation getAllocation(@PathVariable Integer id) {
        return allocationservice.getAllocationbyid(id);
    }
	@RequestMapping(value = "/employeebyid/{id}", method = RequestMethod.GET)
    public Allocation[] getAllocationByEmpId(@PathVariable Integer id) {
        List<Allocation> all = allocationservice.findByEmployee(id);
        return all.toArray(new Allocation[all.size()]);
    }


}
