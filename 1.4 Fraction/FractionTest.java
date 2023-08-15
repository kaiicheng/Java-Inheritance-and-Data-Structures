/*
 * Recall the JUnit method assertEquals (expected, actual) will use the equals method to compare objects.
 */

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FractionTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void testEqualsObject() {
		Fraction fraction1 = new Fraction(2, 3);
		Fraction fraction2 = new Fraction(2, 3);
		
		assertEquals(fraction1, fraction2);
		
		fraction1 = new Fraction(3, 5);
		fraction2 = new Fraction(4, 6);
		
		assertNotEquals(fraction1, fraction2);
	}

}
