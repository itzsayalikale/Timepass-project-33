package com.timepass.practise.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.timepass.practise.model.AgriAccount;



@Repository
public interface AgriRepository extends JpaRepository<AgriAccount, Integer> {

	public AgriAccount findById(int id);
}
