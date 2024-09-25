package io.javabrains.javabasics;

/*
Create a class `Animal2` with an abstract method `makeSound`.
Create an anonymous inner class implementation of `Animal2` and then call the `makeSound` method
 */

public class AnonymousInnerClasses {
    public static void main(String[] args) {
          Animal2 animal = new Animal2() {
              @Override
              public void makeSound() {
                  System.out.println("MakeSound");
              }
          };
        animal.makeSound();
    }
}

public abstract class Animal2 {
    abstract public void makeSound();
}