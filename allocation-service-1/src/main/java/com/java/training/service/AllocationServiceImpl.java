package com.java.training.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Example;
import com.java.training.model.Allocation;
import com.java.training.repository.AllocationRepository;
import java.util.Optional;
@Service
public class AllocationServiceImpl  implements AllocationService{
	
	@Autowired
	AllocationRepository allocationRepo;

	@Override
	public Allocation saveallocation(Allocation allocation) {
		// TODO Auto-generated method stub
		return allocationRepo.save(allocation);
	}

	@Override
	public List<Allocation> getallallocation() {
		// TODO Auto-generated method stub
		return allocationRepo.findAll();
	}

	@Override
	public Allocation getAllocationbyid(Integer id) {
		Optional<Allocation> optionalAllocation = allocationRepo.findById(id);
        if (optionalAllocation.isPresent()) {
            return optionalAllocation.get();
        }
		return null;
     
	}

	@Override
	public List<Allocation> findByEmployee(Integer id) {
		Allocation allocation=new Allocation();
        allocation.setEmpid(id);
        Example <Allocation> example=Example.of(allocation);
        List<Allocation> allocations=allocationRepo.findAll(example);
        return allocations;
	}

	
		

}
