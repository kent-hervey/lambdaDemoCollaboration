package com.hervey.example;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String name = "Kent";
		
		MrGreeter greetingLambda = () -> {return "Hello " + name;};
		
		
		System.out.println(greetingLambda.greeting());
		
		
		

	}

}
