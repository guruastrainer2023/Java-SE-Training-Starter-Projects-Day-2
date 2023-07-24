package com.training.bean;

public class FactorialCalculator {
	
	private long number;

	public FactorialCalculator(long number) {
		super();
		this.number = number;
	}
	
	public long getFactorial() {
		long result=1;
		for(int i=1; i<=number; i++) {
			result=result*i;
		}
		return result;
	}

	@Override
	public String toString() {
		return "FactorialCalculator [number=" + number + ", getFactorial()=" + getFactorial() + "]";
	}
	
	

}
