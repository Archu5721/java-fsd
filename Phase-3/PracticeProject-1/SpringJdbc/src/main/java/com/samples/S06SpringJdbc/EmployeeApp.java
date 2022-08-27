package com.samples.S06SpringJdbc;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.samples.S06SpringJdbc.dao.EmployeeDAO;
import com.samples.S06SpringJdbc.dto.Employee;

public class EmployeeApp {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext springContainer = new ClassPathXmlApplicationContext(
				"com/samples/S06SpringJdbc/SpringConfig.xml");

		EmployeeDAO employeeDao = (EmployeeDAO) springContainer.getBean("employeedao");

//		create(employeeDao);
//		update(employeeDao);
//		delete(employeeDao);
//		read(employeeDao);
		readEmployees(employeeDao);

	}

	private static void readEmployees(EmployeeDAO employeeDao) {
		List<Employee> employees = employeeDao.read();
		System.out.println(employees);
	}

	private static void read(EmployeeDAO employeeDao) {
		Employee employee = employeeDao.read(5);
		System.out.println(employee);
	}

	private static void delete(EmployeeDAO employeeDao) {
		employeeDao.delete(1);
	}

	private static void update(EmployeeDAO employeeDao) {
		Employee emp = new Employee();
		emp.setId(1);
		emp.setFirstname("Daemon");
		emp.setLastname("Targareyean");

		employeeDao.update(emp);
	}

	private static void create(EmployeeDAO employeeDao) {
		Employee emp = new Employee();
		emp.setId(5);
		emp.setFirstname("David");
		emp.setLastname("Miller");

		employeeDao.create(emp);
	}
}
