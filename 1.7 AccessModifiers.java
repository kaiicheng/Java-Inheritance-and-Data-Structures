package people;

public class Person {  // public class accessible anywhere
	
	//public variable accessible anywhere
	public String name;

	// protected variable accssible anywhere in this package (people)
	// or in sub-classes in other packages
	protected char gender;
	
	// default variable accessible anywhere in this package (people)
	int age;
	
	// private variable only accessible within this class
	private String phone;	

	// public method accessible anywhere
	public String getPhone() {
		
		// getting private variable
		return this.phone; 
	}
	
	// public method accessible anywhere
	public void setPhone(String phone) {
		
		// setting private variable
		this.phone = phone;
	}
}
