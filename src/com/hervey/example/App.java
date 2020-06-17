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
		
		MrGreeter greetingLambda2 = () -> {return "Howdy and Hello" + name;};
		
		
		System.out.println(greetingLambda.greeting());
		
		System.out.println(greetingLambda2.greeting());

		User user = (n, age, isMale)	-> {
			return n + " is " + age + " and is male? " + isMale;
		};

		System.out.println(user.fetchUser("Tony", 44, true));
		
		ImplUser user2 = new ImplUser("Mary", 44, false);
		
		System.out.println(user2.toString());
		
		System.out.println(user2.age + " is age of user 2");
		
		ImplUser2 user3 = new ImplUser2("Fred", 88, true, true, 7);
		
		System.out.println(user3.toString());

	}



}
