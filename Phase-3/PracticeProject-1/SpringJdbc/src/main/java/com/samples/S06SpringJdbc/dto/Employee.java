package com.samples.S06SpringJdbc.dto;

public class Employee {
	private int id;
	private String Firstname;
	private String Lastname;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstname() {
		return Firstname;
	}
	public void setFirstname(String firstname) {
		Firstname = firstname;
	}
	public String getLastname() {
		return Lastname;
	}
	public void setLastname(String lastname) {
		Lastname = lastname;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", Firstname=" + Firstname + ", Lastname=" + Lastname + "]";
	}
	
}
