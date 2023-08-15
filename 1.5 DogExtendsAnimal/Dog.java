/**
 * Represents a Dog.
 * @author kai 
 *
 */
public class Dog extends Animal {

	// inform Java that I'm overriding a method in the superclass
	@Override
	public void greeting() {
		
		// print out first 
		System.out.println("I am a dog.");
		
		// print out next
		super.greeting(); //call greeting method in superclass Animal
	}
}
