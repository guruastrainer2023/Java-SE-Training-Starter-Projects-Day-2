package com.training.ui;

import java.util.List;
import java.util.function.Consumer;

import com.training.bean.CollectionFactory;

public class Main02 {

	public static void main(String[] args) {
		
		List<Double> doubleList=CollectionFactory.getDoubleList();
		Consumer<Double> consumer=(d)-> System.out.println(d);
		doubleList.forEach(consumer);
		//---------------------------------------------------------
		System.out.println("-------------------------------------------------------------------------");

		doubleList.forEach(d-> System.out.println(d));
	}

}
