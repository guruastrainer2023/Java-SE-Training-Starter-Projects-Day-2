package com.training.ui;


import java.util.List;
import java.util.function.Consumer;

import com.training.bean.CollectionFactory;
import com.training.bean.Rectangle;

public class Main03 {

	public static void main(String[] args) {

		List<Rectangle> rectangleList=CollectionFactory.getRectangleList();
		
		Consumer<Rectangle> consumer=r-> System.out.println(r);
		rectangleList.forEach(consumer);
		
		//---------------------------------------------------------
		System.out.println("-------------------------------------------------------------------------");
		
		rectangleList.forEach(r-> System.out.println(r));
		rectangleList.forEach(r-> System.out.println(r.getHeight()));
		rectangleList.forEach(r-> System.out.println(r.getWidth()));
	}

}
