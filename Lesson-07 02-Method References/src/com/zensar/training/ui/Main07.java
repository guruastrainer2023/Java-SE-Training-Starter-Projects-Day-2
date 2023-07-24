package com.zensar.training.ui;

import com.training.bean.pack5.StringAnalyzer;
import com.training.bean.pack5.StringLengthTester;

public class Main07 {

	public static void main(String[] args) {
		StringLengthTester stringLengthTester1;
		stringLengthTester1=(String a, int b)->{
			if(a.length()>=b)
				return true;
			return false;
		};
		
		System.out.println(stringLengthTester1.testLength("Welcome", 5));
		
		StringLengthTester stringLengthTester2;
		stringLengthTester2=StringAnalyzer::analyze;
		
		System.out.println(stringLengthTester2.testLength("Hello World", 20));

	}

}
