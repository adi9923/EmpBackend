package com.main.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.main.Entity.User;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {
	Optional<User>findByUsername(String username);
	//at the time of registration check is username is unique or duplicate
	// at the time check user is already registred or not

}
