package com.example.setter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {

	String name;
	int empid;
	String dept;
	@Autowired
	Address add;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(String name, int empid, String dept) {
		super();
		this.name = name;
		this.empid = empid;
		this.dept = dept;
	}
	
	public Address getAdd() {
		return add;
	}
	public void setAdd(Address add) {
		this.add = add;
	}
	public String getName() {
		return name;
	}
	@Value("${employee.name}")
	public void setName(String name) {
		this.name = name;
	}
	public int getEmpid() {
		return empid;
	}
	@Value("${employee.empid}")
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getDept() {
		return dept;
	}
	@Value("${employee.dept}")
	public void setDept(String dept) {
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", empid=" + empid + ", dept=" + dept + ", " + add + "]";
	}
	
	
}
