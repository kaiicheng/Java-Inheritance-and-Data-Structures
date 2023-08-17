
public class Dog extends Pet{
	
	// implementation of abstract method
	@Override
	public String makeSound() {
		return "Bark!";
	}
}

Dog myDog = new Dog();

// print "Bark!"
System.out.println(myDog.makeSound());
