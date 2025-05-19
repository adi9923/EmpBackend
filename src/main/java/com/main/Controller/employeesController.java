package com.main.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.main.Entity.employees;
import com.main.service.employeeService;

@RestController
@RequestMapping("/employee")
@CrossOrigin(origins = "http://localhost:3000" )
public class employeesController{
	
	@Autowired
	employeeService serv;
	
	@PostMapping("/add")
	public String save(@RequestBody employees u) {
		return serv.save(u);
	}
	
	@GetMapping("/getall")
	public List<employees> findAll(){
		return serv.findAll();
	}
	
	@GetMapping("/findall/{id}")
	public employees findById(@PathVariable int id) {
		return serv.findById(id);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteuser(@PathVariable int id) {
		return serv.deleteUser(id);
	}
	
	@PutMapping("/update/{id}")
	public String updateuser(@RequestBody employees u, @PathVariable int id) {
		return serv.updatyeUser(u,id);		
	}
	
	@GetMapping("/findbyname/{name}")
	public List<employees> findbyname(@PathVariable String name){
		return serv.findbyname(name);
	}
	
	@GetMapping("/findbydept/{dept}")
	public List<employees> findbydept(@PathVariable String dept){
		return serv.findbydepartment(dept);
	}
	
	@GetMapping("/findbyrole/{role}")
	public List<employees> findbyrole(@PathVariable String role){
		return serv.findbyrole(role);
	}
	
	

}
