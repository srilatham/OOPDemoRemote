package com.msl.objandclass;

public class Dog {
	
	String name;
	String breed;
	int age;
	String color;
	
	
	public Dog() {
		
	}

	public Dog(String breed) {
		
		this.breed = breed;
	}



	public Dog(String name, String breed, int age) {
		
		this.name = name;
		this.breed = breed;
		this.age = age;
	}



	public Dog(String name, String breed, int age, String color) {
		
		this.name = name;
		this.breed = breed;
		this.age = age;
		this.color = color;
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	

	@Override
	public String toString() {
		return "Dog [name=" + name + ", breed=" + breed + ", age=" + age + ", color=" + color + "]";
	}

	public static void main(String[] args) {
		Dog scott = new Dog("Scott","labrador",2,"brown");
		
		System.out.println(scott.toString());

	}

}
