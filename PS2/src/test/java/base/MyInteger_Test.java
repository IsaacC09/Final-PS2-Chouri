package base;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyInteger_Test {
	// test Constructor and Getter
	@Test
	public void testGetterAndConstructor() {
		MyInteger MyInt = new MyInteger(6);
		assertEquals(MyInt.getiValue(), 6);
	} 
 
	// test even methods
	@Test
	public void even_true() {
		MyInteger MyInt = new MyInteger(4);
		assertEquals(MyInteger.isEven(MyInt), true);
	}

	@Test
	public void even_false() {
		MyInteger MyInt = new MyInteger(3);
		assertEquals(MyInteger.isEven(MyInt), false);
	}
 
	// test odd methods
	@Test
	public void odd_true() {
		MyInteger MyInt = new MyInteger(101);
		assertEquals(MyInteger.isOdd(MyInt), true);
	}

	@Test
	public void odd_false() {
		MyInteger MyInt = new MyInteger(100);
		assertEquals(MyInteger.isOdd(MyInt), false);
	}

	// test prime methods
	@Test
	public void prime_true() {
		MyInteger MyInt = new MyInteger(11);
		assertEquals(MyInteger.isPrime(MyInt), true);
	}

	@Test
	public void prime_false() {
		MyInteger MyInt = new MyInteger(6);
		assertEquals(MyInteger.isPrime(MyInt), false);
	}

	// test equal methods
	@Test
	public void equal_true() { 
		int x = 7;
		MyInteger MyInt = new MyInteger(7);
		assertEquals(MyInt.equals(x), true);
		assertEquals(MyInt.equals(MyInt), true);
	}

	@Test
	public void equal_false() {
		int x = 6;
		MyInteger MyInt = new MyInteger(7);
		assertEquals(MyInt.equals(x), false);

	}

}
