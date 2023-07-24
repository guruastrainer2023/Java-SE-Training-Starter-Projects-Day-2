package com.training.bean;

import java.time.LocalDate;

public class SalesExecutive extends Employee{
	
	private int numberOfOrders;

	public SalesExecutive(int id, String name, char grade, LocalDate hiredDate, double basicSalary, Gender gender,
			int numberOfOrders) {
		super(id, name, grade, hiredDate, basicSalary, gender);
		this.numberOfOrders = numberOfOrders;
	}

	public SalesExecutive() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getNumberOfOrders() {
		return numberOfOrders;
	}

	public void setNumberOfOrders(int numberOfOrders) {
		this.numberOfOrders = numberOfOrders;
	}
	
	@Override
	public double computeAllowance() {
		
		return super.computeAllowance()+(numberOfOrders*1000);
	}

	@Override
	public String toString() {
		return "SalesExecutive [numberOfOrders=" + numberOfOrders + ", getId()=" + getId() + ", getName()=" + getName()
				+ ", getGrade()=" + getGrade() + ", getHiredDate()=" + getHiredDate() + ", getBasicSalary()="
				+ getBasicSalary() + ", getGender()=" + getGender() + ", getNetSalary()=" + getNetSalary() + "]";
	}

	
	
}
