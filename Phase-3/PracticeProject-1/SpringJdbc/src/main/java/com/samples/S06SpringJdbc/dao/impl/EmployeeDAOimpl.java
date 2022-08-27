package com.samples.S06SpringJdbc.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.samples.S06SpringJdbc.dao.EmployeeDAO;
import com.samples.S06SpringJdbc.dao.impl.rowmapper.EmployeeRowMapper;
import com.samples.S06SpringJdbc.dto.Employee;
@Component("employeedao")
public class EmployeeDAOimpl implements EmployeeDAO{
	@Autowired
	private JdbcTemplate jdbctemplate;
	

	@Override
	public int create(Employee emp) {
		String sql="insert into employee values(?,?,?)";
		int updateResult = jdbctemplate.update(sql, emp.getId(), emp.getFirstname(), emp.getLastname());
		System.out.println("Row Created");
		return updateResult;
	}


	@Override
	public int update(Employee emp) {
		String sql="update employee set firstname=? , lastname=? where id=?";
		int updateResult = jdbctemplate.update(sql, emp.getFirstname(), emp.getLastname(), emp.getId());
		System.out.println("Row Updated");
		return updateResult;
	}


	@Override
	public int delete(int id) {
		String sql="delete from employee where id=?";
		int updateResult = jdbctemplate.update(sql, id);
		System.out.println("Row deleted");
		return updateResult;
	}


	@Override
	public Employee read(int id) {
		String sql="select * from employee where id=?";
		EmployeeRowMapper mapper = new EmployeeRowMapper();
		Employee employee = jdbctemplate.queryForObject(sql, mapper  ,id);
		return employee;
		
	}


	@Override
	public List<Employee> read() {
		String sql="select * from employee";
		EmployeeRowMapper mapper = new EmployeeRowMapper();
		List<Employee> employees = jdbctemplate.query(sql, mapper);
		return employees;
	}

}
