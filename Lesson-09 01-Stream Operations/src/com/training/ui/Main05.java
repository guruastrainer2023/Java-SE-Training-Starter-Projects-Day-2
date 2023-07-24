package com.training.ui;

import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class Main05 {
	
	private static void printLine() {
		System.out.println("---------------------------------------------------------------------------------");
	}
	
	private static void averageOperation1() {
		// average Example
		
		
		IntStream intStream=IntStream.of(10,20,30,40, 50);
		
		OptionalDouble optionalResult=intStream.average();
		if(optionalResult.isPresent()) {
			System.out.println("The Average is : "+ optionalResult.getAsDouble());
		}else {
			System.out.println("Average Could not be computed ..May be the Stream is Empty");
		}
		
		printLine();
	}
	
	private static void averageOperation2() {
		// average Example
		
		
		DoubleStream doubleStream=DoubleStream.of(56.0, 62.00, 71.0, 15.0);
		
		OptionalDouble optionalResult=doubleStream.average();
		if(optionalResult.isPresent()) {
			System.out.println("The Average is : "+ optionalResult.getAsDouble());
		}else {
			System.out.println("Average Could not be computed ..May be the Stream is Empty");
		}
		
		printLine();
	}
	
	private static void sumOperation1() {
		// sum Example
		
		
		IntStream intStream=IntStream.of(10,20,30,40, 50);
		
		int sum=intStream.sum();
		System.out.println(sum);
		
		printLine();
	}
	
	private static void sumOperation2() {
		// sum Example
		
		
		DoubleStream doubleStream=DoubleStream.of(56.0, 62.00, 71.0, 15.0);
		
		double sum=doubleStream.sum();
		System.out.println(sum);
		
		printLine();
	}
	
	private static void sumOperation4() {
		// sum Example
		
		
		LongStream longStream=LongStream.of(10L,20L,30L);
		
		long sum=longStream.sum();
		System.out.println(sum);
		
		printLine();
	}
	
	

	public static void main(String[] args) {
		sumOperation4();

	}

}
