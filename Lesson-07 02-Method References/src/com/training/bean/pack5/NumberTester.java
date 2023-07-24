package com.training.bean.pack5;

public interface NumberTester {

	public static <T extends Number> boolean doTest(T t) {
		if(t.intValue()> 100) {
			return true;
		
		}
		return false;	
	}
}
