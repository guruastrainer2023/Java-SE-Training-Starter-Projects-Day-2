package com.training.ui;

import java.util.function.UnaryOperator;

import com.training.bean.Circle;

public class Main2 {

	public static void main(String[] args) {
		
		Circle c=new Circle(10);
		
		UnaryOperator<Circle> unaryOperator;
		unaryOperator=(Circle c1)-> new Circle(c1.getRadius()*c1.getRadius());
		
		Circle c2=unaryOperator.apply(c);
		
		System.out.println(c2);

	}

}
