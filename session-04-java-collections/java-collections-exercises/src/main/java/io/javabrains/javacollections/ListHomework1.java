package io.javabrains.javacollections;

/*
Create a Java program that allows a user to perform various Operations on an ArrayList of integers.
The program should display a menu of options, and the user should be able to select one of the following Operations:

1. Add an element to the list
2. Remove an element from the list
3. Find the minimum element in the list
4. Find the maximum element in the list
5. Print the contents of the list
6. Quit the program

The program should continue to display the menu and allow the user to perform Operations until they choose to quit.
*/
import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Function;

public class ListHomework1 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println(
				"""
				Select an option:
				
				1. Add an element to the list
				2. Remove an element from the list
				3. Find the minimum element in the list
				4. Find the maximum element in the list
				5. Print the contents of the list
				6. Quit the program
				"""
		);
		String input;
		ArrayList<Integer> list = new ArrayList<>();

		Function<Integer, Boolean> addElement = list::add;
		Function<Integer, Boolean> removeElement = list::remove;

		do {
			input = scanner.nextLine();
			switch (input) {
				case "1":
					System.out.println("1. Add an element to the list");
					addElement.apply(scanner.nextInt());
					scanner.nextLine();
					break;
				case "2":
					System.out.println("2. Remove an element from the list");
					removeElement.apply(scanner.nextInt());
					scanner.nextLine();
					break;
				case "3":
					System.out.println(list.stream().min(Integer::compareTo).get());
					break;
				case "4":
					System.out.println(list.stream().max(Integer::compareTo).get());
					break;
				case "5":
					System.out.println(list);
					break;
				case "6":
					System.out.println("Thanks for using the program");
					break;
				default:
					System.out.println("Invalid option");
			}
			System.out.println("Select an option: ");

		} while (!input.equals("6"));

	}

}