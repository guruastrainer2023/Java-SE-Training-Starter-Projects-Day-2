package com.training.bean.pack5;

import com.training.bean.pack3.Circle;

public interface SomeConverter1 {
	
	public static <U extends Circle, V extends Integer> U convert(V v) {
		return (U) new Circle(v.intValue());
		
	}

}
