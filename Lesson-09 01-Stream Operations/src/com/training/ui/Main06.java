package com.training.ui;

import java.util.Comparator;
import java.util.List;

import com.training.bean.Circle;
import com.training.bean.CollectionFactory;
import com.training.bean.Employee;
import com.training.bean.comparator.EmployeeNameComparator;
import com.training.bean.comparator.EmployeeSalaryComparator;

public class Main06 {
	
	
	private static void printLine() {
		System.out.println("---------------------------------------------------------------------------------");
	}
	
	private static void sortOperation1() {
		// Sort Example1
		
		List<Integer> integerList=List.of(45,12, 30, 55, 6, 14);
		
		integerList.stream().sorted().forEach((i)-> System.out.println(i));
		printLine();
	}
	
	private static void sortOperation2() {
		// Sort Example2
		
		List<Double> doubleList = List.of(800.00, 400.00, 600.00, 200.00);
		
		doubleList.stream().sorted().forEach((d)-> System.out.println(d));
		printLine();
	}
	
	private static void sortOperation3() {
		// Sort Example3
		
		List<Circle> circleList=CollectionFactory.getCircleList();
		
		circleList.stream().sorted().forEach((c)-> System.out.println(c));
		printLine();
	}
	
	private static void sortOperation4() {
		// Sort Example4
		
		List<Employee> employeeList=CollectionFactory.getEmployeeList();
		
		employeeList.stream().sorted().forEach((e)-> System.out.println(e));
		printLine();
	}
	
	private static void sortOperation5() {
		// Sort Example 5
		
		List<Employee> employeeList=CollectionFactory.getEmployeeList();
		
		EmployeeSalaryComparator comparator=new EmployeeSalaryComparator();
		
		employeeList.stream().sorted(comparator).forEach((e)-> System.out.println(e));
		printLine();
	}
	
	private static void sortOperation6() {
		// Sort Example 6
		
		List<Employee> employeeList=CollectionFactory.getEmployeeList();
		
		EmployeeSalaryComparator comparator=new EmployeeSalaryComparator();
		
		employeeList.stream().sorted(comparator.reversed()).forEach((e)-> System.out.println(e));;
		printLine();
	}
	

	private static void sortOperation7() {
		// Sort Example 6
		
		List<Employee> employeeList=CollectionFactory.getEmployeeList();
		
		EmployeeSalaryComparator comparator=new EmployeeSalaryComparator();
		EmployeeNameComparator comparator2=new EmployeeNameComparator();
		
		employeeList.stream().sorted(comparator.thenComparing(comparator2)).forEach((e) -> System.out.println(e));
		printLine();
	}

	public static void main(String[] args) {
		sortOperation7();
		

	}

}
