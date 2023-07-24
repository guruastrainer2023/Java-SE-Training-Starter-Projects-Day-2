package com.training.ui;

import java.util.List;
import java.util.Set;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Predicate;

import com.training.bean.Circle;
import com.training.bean.CollectionFactory;
import com.training.bean.Employee;

public class Main02 {
	
	private static void printLine() {
		System.out.println("---------------------------------------------------------------------------------");
	}
	
	private static void filterOperationDemo1() {
		// Filter Example 1
		
		Set<Integer> integerSet=Set.of(10,3,2,7,8);
		
		Predicate<Integer> predicate;
		predicate=(Integer i)-> i>5;
		
		integerSet.stream().filter(predicate).forEach( (i)-> System.out.println(i) );
		printLine();
		
	}
	
	private static void filterOperationDemo2() {
		// Filter Example 2
		
		List<String> stringList=List.of(
					"hello",
					"HTML",
					"CSS",
					"JS",
					"Angular",
					"TS"
					);
		
		Predicate<String> predicate;
		predicate=(String s)-> s.length()>=3;
		
		stringList.stream().filter(predicate).forEach( (s)-> System.out.println(s)  );
		printLine();
	
	}
	
	private static void filterOperationDemo3() {
		// Filter with peek Example 3
		
		Set<Integer> integerSet=Set.of(10,3,2,7,8);
		
		Predicate<Integer> predicate;
		predicate=(Integer i)-> i>5;
		
		integerSet.stream().filter(predicate).peek((i)-> System.out.print(i+"-")).forEach((i)-> System.out.println(i) );
		printLine();
		
		
	}
	
	private static void filterOperationDemo4() {
		// Filter Example 4
		
		List<Circle> circleList=CollectionFactory.getCircleList();
		
		Predicate<Circle> predicate;
		predicate=(Circle c)-> c.getRadius()>50;
		
		circleList.stream().filter(predicate).forEach( (c)-> System.out.println(c) );
		printLine();
	}
	
	private static void filterOperationDemo5() {
		
		// Filter Example 5
		List<Employee> employeeList=CollectionFactory.getEmployeeList();
		
		Predicate<Employee> predicate;
		predicate=(Employee e)-> e.getBasicSalary()>15000;
		
		employeeList.stream().filter(predicate).forEach( (e)-> System.out.println(e) );
		printLine();
		
	}
	

	public static void main(String[] args) {
		filterOperationDemo5();
	}

}
