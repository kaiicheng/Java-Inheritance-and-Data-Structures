
/*
 * This class cannot be instantiated because it's abstract.
 */

public abstract class Pet {  // abstract class
	
	protected double weight;
	
	// abstract method WITHOUT body
	public abstract String makeSound();
	
	// non abstract (concrete) method WITH body
	public void eat(Food food) {
		this.weight += (food.getCalories() / 100);
	}	
}
