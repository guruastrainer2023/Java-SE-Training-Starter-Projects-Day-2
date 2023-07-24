package com.zensar.training.ui;

import com.training.bean.pack3.Circle;
import com.training.bean.pack4.Converter;
import com.training.bean.pack5.SomeConverter1;

public class Main08 {

	public static void main(String[] args) {
		Converter<Circle, Integer> converter1;
		converter1=(Integer i)->{
			return new Circle(i);
		};
		
		System.out.println(converter1.convert(10));
		
		Converter<Circle, Integer> converter2;
		converter2=SomeConverter1::convert;
		
		Circle c=converter2.convert(50);
		System.out.println(c);

	}

}
