package com.samples.S06SpringJdbc.dao;

import java.util.List;

import com.samples.S06SpringJdbc.dto.Employee;

public interface EmployeeDAO {
	
	 int create(Employee emp);
	 
	 int update(Employee emp);
	 
	 int delete(int id);
	 
	 Employee read(int id);
	 
	 List<Employee> read();

}
