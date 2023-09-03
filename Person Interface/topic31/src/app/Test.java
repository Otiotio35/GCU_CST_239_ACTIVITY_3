package app;

import java.util.Arrays;

/**
 * A test class for demonstrating and testing the functionalities of the Person
 * class.
 * 
 * @version 08/26/2023 ID: 21024608
 * @author toafik otiotio
 */
public class Test {
	/**
	 * Default constructor for the Test class.
	 */
	public Test() {
		// No additional initialization logic for now.
	}

	/**
	 * The entry point of the Test application.
	 *
	 * 
	 * @param args Command line arguments.
	 */

	public static void main(String[] args) {

		// Create new Person Objects
		Person person1 = new Person("Justine", "Reha", 25);
		Person person2 = new Person("Brianna", "Reha", 38);
		Person person3 = new Person(person1);

		// Test Object equality using ==
		if (person1 == person2) {
			System.out.println("These persons are identical using ==");
		} else {
			System.out.println("These persons are not identical using ==");
		}

		// Test Object equality using equals()
		if (person1.equals(person2)) {
			System.out.println("These persons are identical using equals()");
		} else {
			System.out.println("These persons are not identical using equals()");
		}

		// Test Copy Constructor
		if (person1.equals(person3)) {
			System.out.println("These copied person is identical using equals()");
		} else {
			System.out.println("These copied person is not identical using equals()");
		}

		// Make person1 walk and run
		person1.walk();
		System.out.println("Person 1 is walking.");

		person1.run();
		System.out.println("Person 1 is running: " + person1.isRunning());

		person1.walk();
		System.out.println("Person 1 is running: " + person1.isRunning());
/*
		// Print the Objects
		System.out.println(person1);
		System.out.println(person2.toString());
		System.out.println(person3);
*/
		// Create a bunch of Persons and compare them so they are sorted on Last Name
		Person[] persons = new Person[4];
		persons[0] = new Person("Justine", "Reha", 25);
		persons[1] = new Person("Brianna", "Reha", 38);
		persons[2] = new Person("Mary", "Reha", 32);
		persons[3] = new Person("Mark", "Reha", 22);

		// Sort the persons array based on the compareTo method
		Arrays.sort(persons);

		// Print sorted persons
		for (int x = 0; x < 4; ++x) {
			System.out.println(persons[x]);
		}

	}

}
