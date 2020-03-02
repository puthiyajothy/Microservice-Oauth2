package com.java.training.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.java.training.model.Address;
import com.java.training.service.AddressService;

@RestController
public class AddressController {
	
	@Autowired
	AddressService addressservice;
	
	@RequestMapping(value = "/saveaddress", method = RequestMethod.POST)
	public Address saveaddress(@RequestBody Address address ) {
		return addressservice.saveaddress(address);
	}

}
