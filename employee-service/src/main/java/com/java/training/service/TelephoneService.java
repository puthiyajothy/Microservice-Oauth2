package com.java.training.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.java.training.model.Telephone;

@Service
public interface TelephoneService {

	Telephone savetelephone(Telephone telephone);
	List<Telephone>getAlltelephone();
}
