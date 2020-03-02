package com.java.training.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java.training.model.Allocation;

public interface AllocationRepository extends JpaRepository<Allocation, Integer> {

}
