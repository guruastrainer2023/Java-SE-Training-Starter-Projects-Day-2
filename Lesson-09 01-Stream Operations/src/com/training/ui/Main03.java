package com.training.ui;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

import com.training.bean.Circle;
import com.training.bean.CollectionFactory;
import com.training.bean.Square;
import com.training.bean.Student;

public class Main03 {

	private static void printLine() {
		System.out.println("---------------------------------------------------------------------------------");
	}

	private static void findFirstOperationDemo1() {

		// find First Example

		List<Integer> intList = List.of(20, 7, 50, 34, 41, 10, 15);

		Optional<Integer> optionalResult = intList.stream().findFirst();
		if (optionalResult.isPresent())
			System.out.println(optionalResult.get());

		printLine();

	}

	private static void findFirstOperationDemo2() {

		// find First Example

		List<Circle> circleList = CollectionFactory.getCircleList();
		Optional<Circle> optionalResult = circleList.stream().findFirst();

		if (optionalResult.isPresent())
			System.out.println(optionalResult.get());

		printLine();

	}

	private static void findFirstOperationDemo3() {

		// find First Example

		List<Integer> intList = List.of();

		Optional<Integer> optionalResult = intList.stream().findFirst();
		if (optionalResult.isPresent())
			System.out.println(optionalResult.get());
		else
			System.out.println("Collection is Empty...First Element Not Found");

		printLine();

	}

	private static void findFirstOperationDemo4() {
		// find First Example

		List<Square> squareList = CollectionFactory.getSquareList();
		// studentList.clear();

		Optional<Square> optionalResult = squareList.stream().findFirst();

		if (optionalResult.isPresent())
			System.out.println(optionalResult.get());
		else
			System.out.println("Collection is Empty...First Element Not Found");

		printLine();
	}

	private static void findFirstOperationDemo5() {
		// find First Example

		List<Student> studentList = CollectionFactory.getStudentList();
		// studentList.clear();

		Optional<Student> optionalResult = studentList.stream().findFirst();

		if (optionalResult.isPresent())
			System.out.println(optionalResult.get());
		else
			System.out.println("Collection is Empty...First Element Not Found");

		printLine();
	}

	private static void findAnyOperationDemo1() {
		// findAny Example

		List<Double> doubleList = List.of(200.00, 400.00, 600.00, 800.00);

		Optional<Double> optionalResult = doubleList.stream().findAny();
		if (optionalResult.isPresent())
			System.out.println(optionalResult.get());
		else
			System.out.println("Collection is Empty...Element Not Found");

		printLine();
	}

	private static void findAnyOperationDemo2() {
		// findAny Example

		List<Double> doubleList = new LinkedList<>();
		doubleList.add(10.0);
		doubleList.add(200.00);
		doubleList.add(400.00);
		doubleList.add(300.00);
		doubleList.add(100.00);
		doubleList.add(150.00);
		doubleList.add(250.00);

		Optional<Double> optionalResult = doubleList.stream().parallel().findAny();
		if (optionalResult.isPresent())
			System.out.println(optionalResult.get());
		else
			System.out.println("Collection is Empty...Element Not Found");

		printLine();
	}

	private static void findAnyOperationDemo3() {
		// findAny Example

		List<Circle> circleList = CollectionFactory.getCircleList();

		Optional<Circle> optionalResult = circleList.stream().parallel().findAny();
		if (optionalResult.isPresent())
			System.out.println(optionalResult.get());
		else
			System.out.println("Collection is Empty...Element Not Found");

		printLine();
	}

	private static void anyMatchOperationDemo1() {
		// anyMatch Example

		List<Double> doubleList = List.of(200.00, 400.00, 600.00, 800.00);

		Predicate<Double> predicate;
		predicate = (Double d) -> d > 500;

		boolean result = doubleList.stream().anyMatch(predicate);
		System.out.println(result);

		printLine();
	}

	private static void anyMatchOperationDemo2() {
		// anyMatch Example

		List<String> stringList = List.of("hello", "HTML", "CSS", "JS", "Angular", "TS");

		Predicate<String> predicate;
		predicate = (String s) -> s.length() >= 3;

		boolean result = stringList.stream().anyMatch(predicate);
		System.out.println(result);

		printLine();
	}

	private static void anyMatchOperationDemo3() {
		// anyMatch Example

		List<Circle> circleList = CollectionFactory.getCircleList();

		Predicate<Circle> predicate;
		predicate = (Circle c) -> c.getRadius() > 500;

		boolean result = circleList.stream().anyMatch(predicate);
		System.out.println(result);

		printLine();
	}

	private static void anyMatchOperationDemo4() {
		// anyMatch Example

		List<Student> studentList = CollectionFactory.getStudentList();

		Predicate<Student> predicate;
		predicate = (Student s) -> s.getAverageMark() < 10.0;

		boolean result = studentList.stream().anyMatch(predicate);
		System.out.println(result);

		printLine();
	}

	private static void allMatchOperationDemo1() {

		// allMatch Example

		List<Double> doubleList = List.of(200.00, 400.00, 600.00, 800.00);

		Predicate<Double> predicate;
		predicate = (Double d) -> d > 500;

		boolean result = doubleList.stream().allMatch(predicate);
		System.out.println(result);

		printLine();
	}

	private static void allMatchOperationDemo2() {

		// allMatch Example

		List<String> stringList = List.of("hello", "HTML", "CSS", "JS", "Angular", "TS");

		Predicate<String> predicate;
		predicate = (String s) -> s.length() <10;

		boolean result = stringList.stream().allMatch(predicate);
		System.out.println(result);

		printLine();
	}
	
	private static void allMatchOperationDemo3() {

		// allMatch Example
		List<Circle> circleList = CollectionFactory.getCircleList();

		Predicate<Circle> predicate;
		predicate = (Circle c) -> c.getRadius() > 500;

		boolean result = circleList.stream().allMatch(predicate);
		System.out.println(result);
		
		printLine();
	}
	
	private static void allMatchOperationDemo4() {

		// allMatch Example
		
		List<Student> studentList = CollectionFactory.getStudentList();

		Predicate<Student> predicate;
		predicate = (Student s) -> s.getAverageMark() < 10.0;

		boolean result = studentList.stream().allMatch(predicate);
		System.out.println(result);

		
		printLine();
	}
	
	private static void noneMatchOperationDemo1() {

		// noneMatch Example

		List<Double> doubleList = List.of(200.00, 400.00, 600.00, 800.00);

		Predicate<Double> predicate;
		predicate = (Double d) -> d > 500;

		boolean result = doubleList.stream().noneMatch(predicate);
		System.out.println(result);

		printLine();
	}

	private static void noneMatchOperationDemo2() {

		// noneMatch Example

		List<String> stringList = List.of("hello", "HTML", "CSS", "JS", "Angular", "TS");

		Predicate<String> predicate;
		predicate = (String s) -> s.length() <10;

		boolean result = stringList.stream().noneMatch(predicate);
		System.out.println(result);

		printLine();
	}
	
	private static void noneMatchOperationDemo3() {

		// noneMatch Example
		List<Circle> circleList = CollectionFactory.getCircleList();

		Predicate<Circle> predicate;
		predicate = (Circle c) -> c.getRadius() > 500;

		boolean result = circleList.stream().noneMatch(predicate);
		System.out.println(result);
		
		printLine();
	}
	
	private static void noneMatchOperationDemo4() {

		// noneMatch Example
		
		List<Student> studentList = CollectionFactory.getStudentList();

		Predicate<Student> predicate;
		predicate = (Student s) -> s.getAverageMark() < 10.0;

		boolean result = studentList.stream().noneMatch(predicate);
		System.out.println(result);

		
		printLine();
	}
	
	

	public static void main(String[] args) {
		noneMatchOperationDemo4();

	}

}
