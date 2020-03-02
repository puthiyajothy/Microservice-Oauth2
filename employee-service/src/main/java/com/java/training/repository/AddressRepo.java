package com.java.training.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java.training.model.Address;

public interface AddressRepo extends JpaRepository<Address, Integer>{

}
