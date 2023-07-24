package com.training.ui;

import com.training.bean.fi.Acceptor;

public class Main1 {

	public static void main(String[] args) {
		Acceptor<Integer> acceptor1;
		acceptor1=(Integer i)->{
			System.out.println("Accepting integer");
			System.out.println("Printing the integer");
			System.out.println(i);
			System.out.println("Processing Completed");
		};
		
		acceptor1.doAccept(165);
		 
		//More Code here

	}

}
