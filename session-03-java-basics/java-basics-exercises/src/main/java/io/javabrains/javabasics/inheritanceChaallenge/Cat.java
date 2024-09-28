package io.javabrains.javabasics.inheritanceChaallenge;

public class Cat extends Animal{
	private int lives;
	public Cat(String name, int age, int lives) {
		super(name, age);
		this.lives = lives;
	}

	@Override
	public String makeSound() {
		return "The cat meows";
	}
}
