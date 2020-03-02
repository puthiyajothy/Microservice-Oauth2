package com.java.training.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.java.training.model.Telephone;
import com.java.training.repository.TelephoneRepository;

@Controller
//@RequestMapping("/services")
public class TelephoneController {

//	@Autowired
//	TelephoneService telephoneservice;

	@Autowired
	TelephoneRepository telephoneRepository;
	
	@PostMapping("/savetelephone")
	public Telephone savetelephone(@RequestBody Telephone telephone) {
		return telephoneRepository.save(telephone);
	}

//	@RequestMapping(value = "/gettelephone", method = RequestMethod.GET)
//	public List<Telephone> getAlltelephone() {
//		return telephoneservice.getAlltelephone();
//	}

}
