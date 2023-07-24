package com.zensar.training.ui;

import com.training.bean.pack2.GoodBye;
import com.training.bean.pack2.Hello;
import com.training.bean.pack2.Welcome;

public class Main02 {

	public static void main(String[] args) {
		Hello hello;
		
		Welcome welcome=new Welcome();
		hello=welcome::sayWelcome;  // Method Reference for a method inside(of) object
		hello.doIt();
		
		GoodBye bye=new GoodBye();
		hello=bye::sayGoodBye;  // Method Reference for a method inside(of) object
		hello.doIt();
	}

}
