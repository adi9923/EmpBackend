package com.main.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="employee_info")
public class employees {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	String name;
	String department;
	String role;
	String email;
	String img;
	double salary;
	long cantactNo;
	public employees() {
		super();
		// TODO Auto-generated constructor stub
	}
	public employees(int id, String name, String department, String role, String email, String img, double salary,
			int cantactNo) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.role = role;
		this.email = email;
		this.img = img;
		this.salary = salary;
		this.cantactNo = cantactNo;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public long getCantactNo() {
		return cantactNo;
	}
	public void setCantactNo(long cantactNo) {
		this.cantactNo = cantactNo;
	}
	
	

}
