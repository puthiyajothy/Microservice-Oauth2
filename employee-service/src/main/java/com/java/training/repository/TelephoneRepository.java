package com.java.training.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java.training.model.Telephone;

public interface TelephoneRepository extends JpaRepository<Telephone, Integer> {

}
