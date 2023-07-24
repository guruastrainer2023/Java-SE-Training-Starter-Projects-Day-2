package com.training.bean;

import java.time.LocalDate;

public class Manager extends Employee{
	
	private int employeeCount;

	public Manager(int id, String name, char grade, LocalDate hiredDate, double basicSalary, Gender gender,
			int employeeCount) {
		super(id, name, grade, hiredDate, basicSalary, gender);
		this.employeeCount = employeeCount;
	}

	public Manager(int id, String name, char grade, LocalDate hiredDate, double basicSalary, Gender gender) {
		super(id, name, grade, hiredDate, basicSalary, gender);
	}

	public Manager(int id) {
		super(id);
		
	}
	
	

	public Manager() {
		super();
	}

	public int getEmployeeCount() {
		return employeeCount;
	}

	public void setEmployeeCount(int employeeCount) {
		this.employeeCount = employeeCount;
	}
	
	@Override
	public double computeAllowance() {
		return super.computeAllowance()+(employeeCount*500);
	}

	@Override
	public String toString() {
		return "Manager [employeeCount=" + employeeCount + ", getId()=" + getId() + ", getName()=" + getName()
				+ ", getGrade()=" + getGrade() + ", getHiredDate()=" + getHiredDate() + ", getBasicSalary()="
				+ getBasicSalary() + ", getGender()=" + getGender() + ", getNetSalary()=" + getNetSalary() + "]";
	}

	

	
	
	

}
