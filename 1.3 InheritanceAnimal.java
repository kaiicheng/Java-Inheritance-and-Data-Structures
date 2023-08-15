/*
 * InheritanceAnimal is the superclass
 * Dog is the subclass
 * Dog extends InheritanceAnimal
 */


public class InheritanceAnimal {

	public void greeting() {
		System.out.println("I am an animal!");
	}
}

public class Dog extends InheritanceAnimal{
	
	public static void main (String args[]) {
		
		InheritanceAnimal animal = new InheritanceAnimal();
		Dog dog = new Dog();
		
		// prints "I am an animal!"
		animal.greeting();
		
		// prints "I am an animal!"
		dog.greeting();
	}
}


