package com.training.ui;

import java.time.LocalDate;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

import com.training.bean.Circle;
import com.training.bean.CollectionFactory;
import com.training.bean.Employee;
import com.training.bean.Gender;
import com.training.bean.Student;

public class Main01 {
	
	private static void printLine() {
		System.out.println("---------------------------------------------------------------------------------");
	}
	
	private static void mapOperationDemo1() {
		
				// map operation example 1
		
				List<Integer> intList=List.of(1,2,3,4,5);
				
				Function<Integer, Integer> function1;
				function1=(Integer i)-> i*i;
				
				intList.stream().map(function1).forEach((sq)-> System.out.println(sq));;
				printLine();
	}
	
	private static void mapOperationDemo2() {
				// map operation example 2
		
				List<Integer> intList=List.of(1,2,3,4,5);
				
				Function<Integer, String> function2;
				function2=(Integer i)-> "Str "+i;
				
				intList.stream().map(function2).forEach((s)-> System.out.println(s) );
				printLine();
	}
	
	private static void mapOperationDemo3() {
		// map operation example 3

		List<Integer> intList=List.of(1,2,3,4,5);
		
		Function<Integer, Double> function;
		function=(Integer i)-> i.doubleValue();
		
		intList.stream().map(function).forEach((s)-> System.out.println(s) );
		printLine();
	}
	
	private static void mapOperationDemo4() {
		// map operation example 4
		
		List<Circle> circleList=List.of(
							new Circle(20),
							new Circle(40),
							new Circle(10),
							new Circle(2)
						);
		
		Function<Circle, Double> function;
		function=(Circle i)-> i.computeArea();
		
		circleList.stream().map(function).forEach((d)-> System.out.println(d) );
		printLine();
		
	}
	
	
	private static void mapOperationDemo5() {
		// map operation example 5
		
		List<Student> studentList=CollectionFactory.getStudentList();
		
		Function<Student, Double> function;
		function=(Student s)-> s.getAverageMark();
		
		studentList.stream().map(function).forEach((d)-> System.out.println(d)  );
		printLine();
		
	}
	
	public static void main(String[] args) {
		
		mapOperationDemo5();
		
		

		
		
	}
}
