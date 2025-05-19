package com.main.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.main.Entity.employees;

@Repository
public interface employeeRepository extends JpaRepository<employees, Integer>{
	
	List<employees> findByName(String name);
	List<employees> findByDepartment(String dept);
	List<employees> findByRole(String role);

}
