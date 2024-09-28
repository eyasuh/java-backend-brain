package io.javabrains.javabasics.inheritanceChaallenge;

public class Dog extends Animal{
	private String breed;

	public Dog(String name, int age, String breed) {
		super(name, age);
		this.breed = breed;
	}

	@Override
	public String makeSound() {
		return "The dog barks";
	}

}
