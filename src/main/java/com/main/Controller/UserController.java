package com.main.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.main.Entity.User;
import com.main.dto.userdto;
import com.main.service.Userservice;

@RestController
@RequestMapping("/user")
@CrossOrigin(origins ="http://localhost:3000")
public class UserController {
	@Autowired
	Userservice serv;
	@PostMapping("/register")
	public String register(@RequestBody User u) {
		return serv.register(u);
	}
	@PostMapping("/login")
	public ResponseEntity<?>login(@RequestBody userdto u){
		User u1 = serv.login(u.getUsername(),u.getPassword());
		if(u1 !=null) {
			return ResponseEntity.ok(u);
		}
		return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid credentials");
	}

}
