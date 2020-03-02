package com.java.training.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.training.model.Address;
import com.java.training.repository.AddressRepo;

@Service
public class AddressServiceImpl implements AddressService{

	@Autowired
	AddressRepo addressrepo;
	
	@Override
	public Address saveaddress(Address address) {
		return addressrepo.save(address);
	}

}
