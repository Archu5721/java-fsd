package com.samples.S06SpringJdbc.dao.impl.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.samples.S06SpringJdbc.dto.Employee;

public class EmployeeRowMapper implements RowMapper<Employee>{

	@Override
	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		Employee emp = new Employee();
		emp.setId(rs.getInt(1));
		emp.setFirstname(rs.getString(2));
		emp.setLastname(rs.getString(3));
		return emp;
	}

}
