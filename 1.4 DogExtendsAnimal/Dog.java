/**
 * Represents a Dog.
 * @author kai
 *
 */
public class Dog extends Animal {

	String name = "Bob";
	
	@Override
	public void greeting() {
		System.out.println("I am a dog.");
		super.greeting(); //call greeting method in superclass Animal
	}
	
	
	// To override the public String toString() method in the Dog class
	@Override
	public String toString() {
		return this.name;
	}
}
