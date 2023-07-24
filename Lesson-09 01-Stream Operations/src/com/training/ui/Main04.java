package com.training.ui;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

import com.training.bean.Circle;
import com.training.bean.CollectionFactory;
import com.training.bean.Employee;
import com.training.bean.Gender;
import com.training.bean.Student;
import com.training.bean.comparator.CircleRadiusComparator;
import com.training.bean.comparator.EmployeeSalaryComparator;
import com.training.bean.comparator.IntComparator;
import com.training.bean.comparator.StudentMarkComparator;

public class Main04 {

	private static void printLine() {
		System.out.println("---------------------------------------------------------------------------------");
	}
	
	private static void countOperationExample1() {
		// count Example 1
		
		List<Integer> integerList=List.of(10,20,30, 40);
		
		long count=integerList.stream().count();
		
		System.out.println(count);
		printLine();
		
	}
	
	private static void countOperationExample2() {
		// count Example 2
		
		List<Integer> integerList=List.of(10,20,30, 40);
		
		long count=integerList.stream().filter( (i) -> i>20  ).count();
		
		System.out.println(count);
		printLine();
		
	}
	
	private static void countOperationExample3() {
		// count Example 3
		
		List<Double> doubleList = List.of(200.00, 400.00, 600.00, 800.00);

		Predicate<Double> predicate;
		predicate = (Double d) -> d > 500;
		
		long count=doubleList.stream().filter( predicate  ).count();
		
		System.out.println(count);
		printLine();
		
	}
	
	private static void countOperationExample4() {
		// count Example 4
		List<Employee> employeeList=CollectionFactory.getEmployeeList();
		
		Predicate<Employee> predicate1;
		predicate1=(Employee e)-> e.getGender()==Gender.MALE;
		
		Predicate<Employee> predicate2;
		predicate2=(Employee e)-> e.getBasicSalary()>15000.00;
		
		long count=employeeList.stream().filter(predicate1).filter(predicate2).count();
		System.out.println(count);
		printLine();
		
	}
	
	private static void minOperationExample1() {
		// min Example 1
		
		List<Integer> integerList=List.of(90, 50, 70, 10, 100);
		
		IntComparator comparator=new IntComparator();
		
		Optional<Integer> optionalResult=integerList.stream().min(comparator);
		if(optionalResult.isPresent()) {
			System.out.println(optionalResult.get());
		}else {
			System.out.println("Min Value Not Found..May be the Collection is Empty");
		}
		printLine();
		
	}
	
	private static void minOperationExample2() {
		// min Example 2
		
		List<Circle> circleList=CollectionFactory.getCircleList();
		
		CircleRadiusComparator comparator=new CircleRadiusComparator();
		
		Optional<Circle> optionalResult=circleList.stream().min(comparator);
		if(optionalResult.isPresent()) {
			System.out.println(optionalResult.get());
		}else {
			System.out.println("Min Value Not Found..May be the Collection is Empty");
		}
		printLine();
		
	}
	
	private static void minOperationExample3() {
		// min Example 3
		
		List<Student> studentList=CollectionFactory.getStudentList();
		
		
	    StudentMarkComparator comparator=new StudentMarkComparator();
		
		Optional<Student> optionalResult=studentList.stream().min(comparator);
		if(optionalResult.isPresent()) {
			System.out.println(optionalResult.get());
		}else {
			System.out.println("Min Value Not Found..May be the Collection is Empty");
		}
		printLine();
		
	}
	
	private static void minOperationExample4() {
		// min Example 4
		
		List<Employee> empoloyeeList=CollectionFactory.getEmployeeList();
		
		
	    EmployeeSalaryComparator comparator=new EmployeeSalaryComparator();
		
		Optional<Employee> optionalResult=empoloyeeList.stream().min(comparator);
		if(optionalResult.isPresent()) {
			System.out.println(optionalResult.get());
		}else {
			System.out.println("Min Value Not Found..May be the Collection is Empty");
		}
		printLine();
		
	}
	
	private static void maxOperationExample1() {
		// max Example 1
		
		List<Integer> integerList=List.of(90, 50, 70, 10, 100);
		
		IntComparator comparator=new IntComparator();
		
		Optional<Integer> optionalResult=integerList.stream().max(comparator);
		if(optionalResult.isPresent()) {
			System.out.println(optionalResult.get());
		}else {
			System.out.println("Max Value Not Found..May be the Collection is Empty");
		}
		printLine();
		
	}
	
	private static void maxOperationExample2() {
		// max Example 2
		
		List<Circle> circleList=CollectionFactory.getCircleList();
		
		CircleRadiusComparator comparator=new CircleRadiusComparator();
		
		Optional<Circle> optionalResult=circleList.stream().max(comparator);
		if(optionalResult.isPresent()) {
			System.out.println(optionalResult.get());
		}else {
			System.out.println("Max Value Not Found..May be the Collection is Empty");
		}
		printLine();
		
	}
	
	private static void maxOperationExample3() {
		// max Example 3
		
		List<Student> studentList=CollectionFactory.getStudentList();
		
		
	    StudentMarkComparator comparator=new StudentMarkComparator();
		
		Optional<Student> optionalResult=studentList.stream().max(comparator);
		if(optionalResult.isPresent()) {
			System.out.println(optionalResult.get());
		}else {
			System.out.println("Max Value Not Found..May be the Collection is Empty");
		}
		printLine();
		
	}
	
	private static void maxOperationExample4() {
		// max Example 4
		
		List<Employee> empoloyeeList=CollectionFactory.getEmployeeList();
		
		
	    EmployeeSalaryComparator comparator=new EmployeeSalaryComparator();
		
		Optional<Employee> optionalResult=empoloyeeList.stream().max(comparator);
		if(optionalResult.isPresent()) {
			System.out.println(optionalResult.get());
		}else {
			System.out.println("Max Value Not Found..May be the Collection is Empty");
		}
		printLine();
		
	}
	
	public static void main(String[] args) {
		maxOperationExample4();

	}

}
