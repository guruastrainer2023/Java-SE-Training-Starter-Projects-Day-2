package com.training.bean;

import java.time.LocalDate;

public class RegionalManager extends Manager{

	private int branchCount;

	public RegionalManager(int id, String name, char grade, LocalDate hiredDate, double basicSalary, Gender gender,
			int employeeCount, int branchCount) {
		super(id, name, grade, hiredDate, basicSalary, gender, employeeCount);
		this.branchCount = branchCount;
	}

	public RegionalManager() {
		super();
	}

	public int getBranchCount() {
		return branchCount;
	}

	public void setBranchCount(int branchCount) {
		this.branchCount = branchCount;
	}
	
	@Override
	public double computeAllowance() {
		
		return super.computeAllowance()+ (this.branchCount*4000);
	}

	@Override
	public String toString() {
		return "RegionalManager [branchCount=" + branchCount + ", getEmployeeCount()=" + getEmployeeCount()
				+ ", computeAllowance()=" + computeAllowance() + ", getId()=" + getId() + ", getName()=" + getName()
				+ ", getGrade()=" + getGrade() + ", getHiredDate()=" + getHiredDate() + ", getBasicSalary()="
				+ getBasicSalary() + ", getGender()=" + getGender() + ", getNetSalary()=" + getNetSalary() + "]";
	}
	
	
}
