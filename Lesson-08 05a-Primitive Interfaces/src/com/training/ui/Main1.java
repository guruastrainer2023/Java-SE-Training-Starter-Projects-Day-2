package com.training.ui;

import java.util.function.ToDoubleFunction;
import java.util.function.ToIntBiFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongBiFunction;
import java.util.function.ToLongFunction;

import com.training.bean.Circle;
import com.training.bean.Gender;
import com.training.bean.Student;

public class Main1 {

	public static void main(String[] args) {
		
		Circle c1=new Circle(10);
		
		ToDoubleFunction<Circle> function1;
		function1=(c)->c.computeArea();
		
		double area1=function1.applyAsDouble(c1);
		System.out.println(area1);
		//-------------------------------------------------------------------------
		
		ToIntFunction<Circle> function2;
		function2=(c)->c.getDiameter();
		
		int diameter1=function2.applyAsInt(c1);
		System.out.println(diameter1);
		
		//-------------------------------------------------------------------------
		ToLongFunction<Circle> function3;
		function3=(c)-> c.getRadius();
		
		long radius=function3.applyAsLong(c1);
		System.out.println(radius);
		
		//-------------------------------------------------------------------------
		
		
		ToDoubleFunction<Student> function4;
		function4=(s)->s.getAverageMark();
		double avg=function4.applyAsDouble(new Student(111,"Rahul", Gender.MALE, 45.0, "ECE"));
		System.out.println(avg);
		

	}

}
