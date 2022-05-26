import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class calculatorTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	public void testAdd() {	
		// ARRANGE
		int a = 4321;
		int b = 1234;
		Calculator cal = new Calculator();
		
		// ACT
		int actual = cal.add(a, b);
		
		// ASSERT (check if it meets the requirements)
		int expected = 5555;
		assertEquals(expected, actual);
	}
	
	@Test
	public void testSubtract() {
		
		// ARRANGE
		int a = 4;
		int b = 1;
		Calculator cal = new Calculator();
		
		// ACT
		int actual = cal.subtract(a, b);
		
		// ASSERT
		int expected = 3;
		assertEquals(expected, actual);
	}
	
	@Test
	public void testMultiply() {
		
		// ARRANGE
		int a = 4;
		int b = 2;
		Calculator cal = new Calculator();
		
		
		// ACT
		int actual = cal.multiply(a, b);
		
		// ASSERT
		int expected = 8;
		
		assertEquals(expected,actual);
	}
	
	@Test
	public void testDivide() {
		
		// ARRANGE
		int a = 10;
		int b = 2;
		Calculator cal = new Calculator();
		
		// ACT
		int actual = cal.divide(a,b);
		
		// ASSERT
		int expected = 5;
		
		assertEquals(expected, actual);
		
	}
	
	

}
