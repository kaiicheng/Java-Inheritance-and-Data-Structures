
public class OverridingEquals {

	public static void main(String[] args) {
		
		// this is true if the 2 Strings have the same value
		String string1 = "thisString";
		String string2 = "thisString";
		System.out.println(string1.equals(string2));  // true
		
		// this is true only if the 2 arrays are the same object
		int [] array1 = {1, 2, 3};
		int [] array2 = {1, 2, 3};
		System.out.println(array1.equals(array2));  // false
	}
}
