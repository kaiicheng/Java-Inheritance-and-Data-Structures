package animal;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DogTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void testEqualsObject() {
		
		//this assumes we've implemented the equals method in the dog class
		
		Dog dog1 = new Dog(4, "Pug");
		dog1.setName("Alice");
		
		Dog dog2 = new Dog(8, "Pug");
		dog2.setName("Alice");
		
		//compare the two dogs based on their name and breed
		//dogs should be equal
		assertEquals(dog1, dog2);
		
	}

}
