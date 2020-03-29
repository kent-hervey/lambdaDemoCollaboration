package com.hervey.example;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String name = "Kent";
		
		NameGreeter nameGreeter = new NameGreeter();
		String nameGreeting = nameGreeter.greetUser("Tony");
		String guestGreeting = nameGreeter.greeting();

		System.out.println(nameGreeting);
		System.out.println(guestGreeting);

		MrGreeter greetingLambda = () -> {return "Hello " + name;};
		
		
		System.out.println(greetingLambda.greeting());
		
		
		

	}



}
