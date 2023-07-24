package com.zensar.training.ui;

import com.training.bean.pack1.Addition;
import com.training.bean.pack1.Multiplication;
import com.training.bean.pack1.Task;

public class Main01 {

	public static void main(String[] args) {
		
		Task task;
		task=Addition::add; // (a,b)->a+b // Method Reference for a static method
		System.out.println(task.execute(10, 10));
		
		task=Multiplication::multiply;
		System.out.println(task.execute(10, 10));

	}

}
