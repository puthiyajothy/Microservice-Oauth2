package com.java.training.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.training.model.Telephone;
import com.java.training.repository.TelephoneRepository;

@Service
public class TelephoneServiceImpl implements TelephoneService {

	@Autowired
	TelephoneRepository telephoneRepository;

	@Override
	public Telephone savetelephone(Telephone telephone) {
		// TODO Auto-generated method stub
		return telephoneRepository.save(telephone);
	}

	@Override
	public List<Telephone> getAlltelephone() {
		// TODO Auto-generated method stub
		return telephoneRepository.findAll();
	}
}
