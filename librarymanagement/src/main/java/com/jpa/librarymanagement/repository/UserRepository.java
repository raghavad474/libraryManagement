package com.jpa.librarymanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jpa.librarymanagement.entity.User;

public interface UserRepository extends JpaRepository<User, Integer>{
	
}
