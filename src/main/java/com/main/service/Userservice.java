package com.main.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import com.main.Entity.User;
import com.main.repository.UserRepository;

@Service
public class Userservice {
	@Autowired
	UserRepository repo;
	
	public String register(User u) {
		User user1=repo.findByUsername(u.getUsername()).orElse(null);
		if(user1 != null) {
			return "user name is already exist. choose another user name";
		}else {
			repo.save(u);
			return "User Registeration successfully completed";
		}
		
	}
	public User login (String username, String password) {
		User existinguser = repo.findByUsername(username).orElse(null);
		if(existinguser !=null) {
			if(existinguser.getPassword().equals(password)) {
				return existinguser;
			}
		}
		return null;
	}

}
