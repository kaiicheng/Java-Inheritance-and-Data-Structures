
public class DeclaringAbstractClasses {

	public abstract class Shape{
		// abstract class
		
		public abstract void draw (int size);
		// abstract method WITHOUT body
	}

	// incorrect
	Shape shape = new Shape();
}
