package com.training.ui;

import java.time.LocalDate;
import java.util.List;
import java.util.function.Consumer;

import com.training.bean.Circle;
import com.training.bean.CollectionFactory;
import com.training.bean.Employee;
import com.training.bean.Gender;

public class Main01 {
	public static void main(String[] args) {
		
		List<Integer> integerList=CollectionFactory.getIntegerList();
		
		Consumer<Integer> consumer=(i)->{System.out.println(i);};
		
		integerList.forEach(consumer);
		
		//---------------------------------------------------------
		System.out.println("-------------------------------------------------------------------------");
		integerList.forEach((i)->{System.out.println(i);});
		
		
		
		
	}
}
