package com.java.training.service;

import java.util.List;

import com.java.training.model.Allocation;

public interface AllocationService {
	
	Allocation saveallocation(Allocation allocation);
	List<Allocation>getallallocation();
	Allocation  getAllocationbyid(Integer id);
	List<Allocation> findByEmployee(Integer id);

}
