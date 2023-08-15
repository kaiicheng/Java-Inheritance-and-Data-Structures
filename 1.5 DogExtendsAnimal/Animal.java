/**
 * Superclass representing an Animal.
 * To be extended by specific types of animals.
 * @author kai
 *
 */
public class Animal {

	// the class that inherits from another class is known as the subclass (or extended class, or child class)
	public void greeting() {
		System.out.println("I am an animal.");
	}
	
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.greeting();
	}
}
