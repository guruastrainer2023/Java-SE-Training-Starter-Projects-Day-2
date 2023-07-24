package com.training.ui;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.training.bean.CollectionFactory;
import com.training.bean.Employee;
import com.training.bean.Gender;

public class Main08 {
	
	private static void printLine() {
		System.out.println("---------------------------------------------------------------------------------");
	}
	
	private static void groupByOperation1() {
		// group by Example
		
		List<Employee> employeeList=CollectionFactory.getEmployeeList();
		
		Map<Gender, List<Employee>> genderMap;
		genderMap= employeeList.stream().collect(Collectors.groupingBy(Employee::getGender));
		System.out.println(genderMap);
		
		printLine();
		
	}
	private static void groupByOperation2() {
		// group by Example
		
		List<Employee> employeeList=CollectionFactory.getEmployeeList();
		
		Map<Character, List<Employee>> genderMap;
		genderMap= employeeList.stream().collect(Collectors.groupingBy(Employee::getGrade));
		System.out.println(genderMap);
		
		printLine();
		
	}
	
	private static void joiningOperation1() {
		// joining Example
		
		List<Employee> employeeList=CollectionFactory.getEmployeeList();
		
		
		
		String str=employeeList.stream().map(Employee::getName).collect(Collectors.joining());
		
		System.out.println(str);
		printLine();
		
	}
	
	private static void averagingDoubleOperation1() {
		// averaging Double Example
		
		List<Employee> employeeList=CollectionFactory.getEmployeeList();
		
		
		
		//String str=employeeList.stream().map(Employee::getName).collect(Collectors.joining());
		
		double avg=employeeList.stream().collect(Collectors.averagingDouble(e->e.getBasicSalary()));
		
		System.out.println(avg);
		printLine();
		
	}

	private static void patitioningOperation1() {
		// patitioning Example
		
		List<Employee> employeeList=CollectionFactory.getEmployeeList();
		
		
		
		//String str=employeeList.stream().map(Employee::getName).collect(Collectors.joining());
		
		Map<Boolean, List<Employee>> genderPartition=employeeList.stream().collect(Collectors.partitioningBy(e-> e.getGender()==Gender.MALE));
		
		
		System.out.println(genderPartition);
		printLine();
		
	}

	public static void main(String[] args) {
		
		patitioningOperation1();
	}

}
