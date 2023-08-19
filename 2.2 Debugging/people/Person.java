package people;

import java.util.ArrayList;

/**
 * Represents a person.
 * @author kai
 *
 */
public class Person {

	//instance variable
	
	/**
	 * Name of person.
	 */
	private String name;
	
	// Since name is private, set up simple getter and setter for the variable
	/**
	 * Get name of person.
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Set name of person.
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		
		//create list for people
		ArrayList<Person> people = new ArrayList<Person>();
		
		//create and add person to list
		Person person = new Person();
		people.add(person);
		
		//give person a name
		person.setName("Alice");
		
		//get first person's name
		String firstName = people.get(0).getName();

		//get length of first person's name
		int firstNameLength = firstName.length();
		
		//print first name and length
		System.out.println(firstName + " has a length of " + firstNameLength);
	}
}
