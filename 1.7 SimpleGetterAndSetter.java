
public class SimpleGetterAndSetter {

	// can't access outside of the class
	private int number = 5;
	
	// provide public access outside of the class
	public int getNumber() {
		
		// get private number
		return this.number;
	}
	
	// provide public access outside of the class 
	
	public void setNumber(int num) {
		
		// sets private number
		this.number = num;
	}
	
	public static void main(String[] args) {
		SimpleGetterAndSetter num = new SimpleGetterAndSetter();
		System.out.println(num.getNumber());
		num.setNumber(6);
		System.out.println(num.getNumber());
	}
}
