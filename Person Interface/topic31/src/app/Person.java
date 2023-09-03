package app;

/**
 * Represents a person with a first and last name.
 * 
 * @version 09/03/2023 ID: 21024608
 * @author toafik otiotio
 */
public class Person implements PersonInterface, Comparable<Person> {

	// Private class member variables
	private String firstName = "Mark";
	private String lastName = "Reha";
	private int age;
	private boolean running = false;

	/**
	 * Non-default constructor to initialize the firstName and lastName.
	 * 
	 * @param firstName the first name of the person
	 * @param lastName  the last name of the person
	 * @param age       the age of the person
	 */
	public Person(String firstName, String lastName, int age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;

	}

	/**
	 * Copy constructor to initialize the firstName and lastName from another Person
	 * object.
	 *
	 * @param person the person object to be copied
	 */
	public Person(Person person) {
		this.firstName = person.firstName;
		this.lastName = person.lastName;
	}

	/**
	 * Getter for firstName.
	 *
	 * @return the first name of the person
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * Getter for lastName.
	 *
	 * @return the last name of the person
	 */
	public String getLastName() {
		return lastName;

	}

	/**
	 * Getter for the age property.
	 *
	 * @return the age of the person
	 */
	public int getAge() {
		return age;
	}

	@Override
	public boolean equals(Object other) {
		if (this == other) {
			System.out.println("I am here in other == this");
			return true;
		}

		if (other == null) {
			System.out.println("I am here in other == null");
			return false;
		}

		if (getClass() != other.getClass()) {
			System.out.println("I am here in getClass() != other.getClass()");
			return false;
		}

		Person person = (Person) other;
		return (this.firstName == person.firstName && this.lastName == person.lastName);
	}

	@Override
	public String toString() {
		return "My class is " + getClass().getSimpleName() + " " + firstName + " " + lastName + ", Age: " + age;
	}

	@Override
	public void walk() {
		System.out.println("I am walking.");
		running = false;

	}

	@Override
	public void run() {
		System.out.println("I am running.");
		running = true;

	}

	@Override
	public boolean isRunning() {
		return running;
	}

	/**
	 * Compares this person with the specified person for order based on age.
	 *
	 * @param p the person to be compared
	 * @return a negative integer, zero, or a positive integer as this person is
	 *         less than, equal to, or greater than the specified person.
	 */
	@Override
	public int compareTo(Person p) {
		int value = this.lastName.compareTo(p.lastName);
		if (value == 0) {
			return this.firstName.compareTo(p.firstName);
		} else {
			return value;
		}
	}
	/**
	 * Compares this person with the specified person for order. 
	 * @param p the person to be compared.
	 * @return a negative integer, zero, or a positive integer as this person is less than, equal to, or greater than the specified person.
	 */
	
	public int compareTo1(Person p) {
		return Integer.compare(this.age, p.age); // Now comparing based on age
	}
}
