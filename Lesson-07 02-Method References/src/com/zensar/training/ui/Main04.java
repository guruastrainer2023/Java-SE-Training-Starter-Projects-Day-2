package com.zensar.training.ui;

import java.util.LinkedList;
import java.util.List;

public class Main04 {

	public static void main(String[] args) {
		List<String> names=new LinkedList<>();
		names.add("david");
		names.add("john");
		names.add("meena");
		
		// method reference for a method in arbitrary objects of particular type(String)
		
		names.stream().map(String::toUpperCase).forEach((s)->System.out.println(s));
				
	}

}
