import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAdd() {
		//fail("Not yet implemented");
		int a = 1234;
		int b = 8765;
		
		Calculator cal = new Calculator();
		int actual = cal.add(a,b);
		int expected = 9999;
		assertEquals (expected,actual); // Normal checking for result of addition
		assertNotEquals(expected,20); // Error checking for wrong result
		assertTrue(a>=0&&a<=9999); // Checking boundary of a input value
		assertTrue(b>=0&&b<=9999); // Checking boundary of b input value
	}
	
	@Test
	public void testSubtract() {
		int a = 4321;
		int b = 1234;
		
		Calculator cal = new Calculator();
		int actual = cal.substract(a, b);
		
		int expected = 3087;
		assertEquals (expected, actual);
		assertNotEquals(expected, 20);
		assertTrue(a>=0&&a<=9999); // Checking boundary of a input value
		assertTrue(b>=0&&b<=9999); // Checking boundary of input 
	}
	
	@Test
	public void testMultiply() {
		int a = 5;
		int b = 3;
		
		Calculator cal = new Calculator();
		
		int actual = cal.multiply(a, b);
		int expected = 15;
		
		assertEquals (expected,actual);
		assertNotEquals(expected,20);
		assertTrue(a>=0&&a<=9999);
		assertTrue(b>=0&&b<=9999); // Checking boundary of input 

		
	}
	
	@Test
	public void testDivide() {
		int a = 15;
		int b = 3;
		
		Calculator cal = new Calculator();
		int actual = cal.divide(a, b);
		int expected = 5;
		
		assertEquals(expected, actual);
		assertNotEquals(expected,20);
		assertTrue(a>=0&&a<=9999);
		assertTrue(b>0&&b<=9999); // Checking boundary of input 

	}

}
