/**
 * Superclass representing an Animal.
 * To be extended by specific types of animals.
 * @author kai
 *
 */
public class Animal {

	String name = "Bob";
	
	public void greeting() {
		System.out.println("I am an animal.");
	}
	
	@Override
	public boolean equals(Object o) {
		
		// cast o to Animal
		Animal otherAnimal = (Animal) o;
		
		// compare this.name to name of the animal passed in
		return this.name.equals(otherAnimal.name);
	}
	
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.greeting();
		
		// override toString() in a class and to return something "meaningful"
		// originally: Dog@4517d9a3
		System.out.println(dog);	
	
		System.out.println(dog.equals(dog));
	}
}
