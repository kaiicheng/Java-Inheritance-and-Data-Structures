/**
 * Superclass representing an Animal.
 * To be extended by specific types of animals.
 * @author kai
 *
 */
public class Animal {

	public void greeting() {
		System.out.println("I am an animal.");
	}
	
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.greeting();
		
		// override toString() in a class and to return something "meaningful"
		// originally: Dog@4517d9a3
		System.out.println(dog);
	}

}
