package io.javabrains.javabasics.inheritanceChaallenge;

public class Animal {
    private String name;
	private int age;

	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String makeSound() {
		return "The animal sound";
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
}
