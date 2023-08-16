package animal;

/**
 * Represents a generic Animal.
 * We will create subclasses (dog, cat, etc.) that will inherit from this class.
 * @author kai
 *
 */
public class Animal {
	
	//static variables
	
	/**
	 * Default age for animal.
	 */
	static int DEFAULT_AGE = 0;
	
	//instance variables
	
	/**
	 * Age of animal.
	 */
	int age;
	
	/**
	 * Weight of the animal.
	 */
	double weight;
	
	/**
	 * Name of animal.
	 */
	String name;

	//constructors
	
	/**
	 * Creates an animal with given age.
	 * @param age of animal
	 */
	public Animal(int age) {
		this.age = age;
	}

	/**
	 * Creates an animal with default age.
	 */
	public Animal() {
		//calls first constructor with default age value
		this(Animal.DEFAULT_AGE);
	}

	//getters/setters
	// getters and setters are conventional methods that are used for retrieving
	// and updating the value of a variable
	// Source->Generate Getters and Setters (Automatically generate comments)
	
	/**
	 * Gets the name of the animal.
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the name of the animal.
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	//other methods
	
	/**
	 * Animal speaks.
	 */
	public void speak() {
		System.out.println("Animal says hi.");
	}
	
	// Recall the toString() method is defined in Java's top-level Object class
	// It's almost always a good idea to override toString() in a class to return something "meaningful"
	/**
	 * Overrides toString in Object class.
	 * Returns the name of the animal for printing.
	 */
	@Override
	public String toString() {
		return this.name;
	}
	
}

