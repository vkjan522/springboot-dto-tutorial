package com.vikash.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vikash.springboot.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	

}
