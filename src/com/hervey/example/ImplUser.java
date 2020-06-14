package com.hervey.example;

public class ImplUser implements User {
	
	String name;
	int age=0;
	boolean isMale=true;
	
	public ImplUser(String name, int age, boolean isMale) {
		this.name=name;
		this.age=age;
		this.isMale=isMale;
	}

	@Override
	public String fetchUser(String name, int age, boolean isMale) {
		// TODO Auto-generated method stub
		return null;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + (isMale ? 1231 : 1237);
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ImplUser other = (ImplUser) obj;
		if (age != other.age)
			return false;
		if (isMale != other.isMale)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ImplUser [name=" + name + ", age=" + age + ", isMale=" + isMale + "]";
	}
	
	
	

}
