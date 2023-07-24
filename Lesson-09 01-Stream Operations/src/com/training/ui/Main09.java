package com.training.ui;

import java.util.stream.Stream;

public class Main09 {
	
	

	public static void main(String[] args) {
		Stream<String> stringStream=Stream.of(
				"Monday",
				"Tuesday",
				"Wednesgay",
				"Thursday",
				"Friday",
				"Saturday",
				"Sunday"
		);
		
		stringStream.filter((wd)-> wd.startsWith("T")).forEach((fd)-> System.out.println(fd));
	}

}
