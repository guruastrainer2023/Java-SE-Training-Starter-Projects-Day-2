package com.training.ui;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.training.bean.CollectionFactory;
import com.training.bean.Employee;
import com.training.bean.Gender;

public class Main07 {
	
	private static void printLine() {
		System.out.println("---------------------------------------------------------------------------------");
	}
	
	private static void collectExample1() {
		
		List<Employee> employeeList=CollectionFactory.getEmployeeList();
		
		Predicate<Employee> predicate;
		predicate=(Employee e)-> e.getGender()==Gender.MALE;
		
		List<Employee> maleEmployees=employeeList.stream().filter(predicate).collect(Collectors.toList());
		
		System.out.println(maleEmployees);
	}
	

	public static void main(String[] args) {
		collectExample1();

	}

}
