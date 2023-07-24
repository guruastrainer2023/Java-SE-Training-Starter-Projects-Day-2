package com.training.bean.pack5;

public interface NumericAcceptor{
	
	public static <T extends Number> void acceptNumber(T t) {
		System.out.println("Number : " + t);
	}

}
