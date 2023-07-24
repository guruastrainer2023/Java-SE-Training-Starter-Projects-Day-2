package com.training.ui;

import java.util.List;
import java.util.function.Predicate;

import com.training.bean.CollectionFactory;

public class Main06 {

	public static void main(String[] args) {
		List<Integer> integerList=CollectionFactory.getIntegerList();
		Predicate<Integer> predicate=(i)->{
											if(i>60)
												return true;
											else 
												return false;
										};
		integerList.stream().filter(predicate).forEach(i->System.out.println(i));
	}

}
