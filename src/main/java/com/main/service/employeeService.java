package com.main.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.main.Entity.employees;
import com.main.repository.employeeRepository;

@Service
public class employeeService {
	
	@Autowired
	employeeRepository repo;
	
	public String save(employees u) {
		repo.save(u);
		return "User record added successfully";
	}
	
	public List<employees> findAll(){
		return repo.findAll();
	}
	
	public employees findById(int id) {
		return repo.findById(id).orElse(null);
	}
	
	public String deleteUser(int id){
		employees exuser = repo.findById(id).orElse(null);
		
		if(exuser != null) {
		repo.deleteById(id);
		return "User record deleted successfully";
		}else {
			return "User record not found";
		}
	}
	
	public String updatyeUser(employees u,int id) {
		employees excitingUser = repo.findById(id).orElse(null);
		if(excitingUser != null){
			
			if(u != null) {
				
				if(u.getName()!=null) {
					excitingUser.setName(u.getName());
				}
				
				if(u.getRole()!=null) {
					excitingUser.setRole(u.getRole());
				}
				
				if(u.getEmail()!=null) {
					excitingUser.setEmail(u.getEmail());
				}
				if(u.getCantactNo()!=0) {
					excitingUser.setCantactNo(u.getCantactNo());
				}
				
				if(u.getSalary()!=0) {
					excitingUser.setSalary(u.getSalary());
				}
				
				if(u.getDepartment()!=null) {
					excitingUser.setDepartment(u.getDepartment());
				}
				
				if(u.getImg()!=null) {
					excitingUser.setImg(u.getImg());
				}
				
				
				repo.save(excitingUser);
				return "Employee Updated successfully";
			}
			return "Employee record is empty";
		}
		return "Record not found";
	}
	
	public List<employees> findbyname(String name){
		return repo.findByName(name);
	}
	public List<employees> findbydepartment(String dept){
		return repo.findByDepartment(dept);
	}
	public List<employees> findbyrole(String role){
		return repo.findByRole(role);
	}

}
