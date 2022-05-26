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
		// Arrange
		int a = 4321;
		int b = 1234;
		Calculator cal = new Calculator();
		
		// Act
		int actual = cal.add(a, b);
		
		// Assert (check if it meets the requirements)
		int expected = 5555;
		assertEquals(expected, actual);
	}
	
	@Test
	public void testSubtract() {
		
		int a = 4;
		int b = 1;
		Calculator cal = new Calculator();
		
		int actual = cal.subtract(a, b);
		
		int expected = 3;
		assertEquals(expected, actual);
	}
	
	@Test
	public void testMultiply() {
		
		int a = 4;
		int b = 2;
		
		Calculator cal = new Calculator();
		
		int actual = cal.multiply(a, b);
		int expected = 8;
		
		assertEquals(expected,actual);
	}
	
	@Test
	public void testDivide() {
		
		int a = 10;
		int b = 2;
		
		Calculator cal = new Calculator();
		
		int actual = cal.divide(a,b);
		int expected = 5;
		
		assertEquals(expected, actual);
		
	}
	
	

}
