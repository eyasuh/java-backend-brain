package io.javabrains.javabasics.inheritanceChaallenge;

/*

1.  Create an `Animal` class with member variables for the name and age of the animal and a constructor method that initializes the member variables.
2.  Create a `Dog` class that extends the `Animal` class and has a member variable for the breed of the dog and a constructor method that initializes the member variables.
3.  Override the `makeSound` method in the `Dog` class to print "The dog barks".
4.  Create a `Cat` class that extends the `Animal` class and has a member variable for the number of lives of the cat and a constructor method that initializes the member variables.
5.  Override the `makeSound` method in the `Cat` class to print "The cat meows".
6.  In the `main` method of this class, create an array of `Animal` objects and initialize it with a `Lion`, a `Dog`, a `Cat`, and another `Animal` of your choice.
7.  Loop through the array of `Animal` objects and print the name, age, and sound of each animal.
 */


public class InheritanceChallenge {

    public static void main(String[] args) {
        Animal [] animalsArr = new Animal[4];
        animalsArr[0] = new Animal("Lion", 12);
        animalsArr[1] = new Animal("Dog", 5);
        animalsArr[2] = new Animal("Cat", 3);
        animalsArr[3] = new Animal("Bird", 1);

        for (Animal animal : animalsArr) {
            System.out.println(animal.getName() + " " + animal.getAge() + " " + animal.makeSound());
        }
    }
}
