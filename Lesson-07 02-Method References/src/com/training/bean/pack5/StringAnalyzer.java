package com.training.bean.pack5;

public interface StringAnalyzer {

	public static boolean analyze(String a, int b) {
		if(a.length()>=b)
			return true;
		return false;
	}
}
