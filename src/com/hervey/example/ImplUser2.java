package com.hervey.example;

public class ImplUser2 implements User {
	
	String name;
	int age=0;
	boolean isMale=true;
	boolean isTall=true;
	int numberFriends=1;
	
	public ImplUser2(String name, int age, boolean isMale, boolean isTall, int numberFriends) {
		this.name=name;
		this.age=age;
		this.isMale=isMale;
		this.isTall=isTall;
		this.numberFriends=numberFriends;
	}

	@Override
	public String fetchUser(String name, int age, boolean isMale) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public String toString() {
		return "ImplUser2 [name=" + name + ", age=" + age + ", isMale=" + isMale + ", isTall=" + isTall
				+ ", numberFriends=" + numberFriends + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isMale() {
		return isMale;
	}

	public void setMale(boolean isMale) {
		this.isMale = isMale;
	}

	public boolean isTall() {
		return isTall;
	}

	public void setTall(boolean isTall) {
		this.isTall = isTall;
	}

	public int getNumberFriends() {
		return numberFriends;
	}

	public void setNumberFriends(int numberFriends) {
		this.numberFriends = numberFriends;
	}


	
	
	

}
