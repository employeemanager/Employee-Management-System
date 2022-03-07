package com.login.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.login.entity.Admins;

public interface UserRepository extends JpaRepository<Admins,Integer>{
	
	public Admins findByEmail(String email);
	

}