
public class OverrideMethod {
	public void greeting() {
		System.out.println("I am an animal!");
	}
}

public class Dog extends InheritanceAnimal{
	
	// The @Override annotation informs the compiler (and those using code) that 
	// the element is meant to override an element declared in a superclass
	// It's not required, but helps to prevent errors
	@Override
	public void greeting() {
		System.out.println("I am a dog!");
	}
	
	public static void main (String args[]) {
		
		InheritanceAnimal animal = new InheritanceAnimal();
		Dog dog = new Dog();
		
		// prints "I am an animal!"
		animal.greeting();
		
		// prints "I am an animal!"
		dog.greeting();
	}
}
