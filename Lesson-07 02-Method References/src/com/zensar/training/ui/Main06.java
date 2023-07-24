package com.zensar.training.ui;

import com.training.bean.pack4.Tester;
import com.training.bean.pack5.NumberTester;

public class Main06 {

	public static void main(String[] args) {
		
		Tester<Double> t1;
		t1=(Double number)->{
			if(number>100)
				return true;
			return false;
		};
		
		System.out.println(t1.doTest(200.00));
		
		Tester<Integer> t2=NumberTester::doTest;
		System.out.println(t2.doTest(30));
		

	}

}
