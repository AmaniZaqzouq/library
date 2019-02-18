package library;

import static org.junit.Assert.*;

import org.junit.Test;

public class req3 {

	@Test
	public void test_count() {
		empty obj = new empty();
		int actual = obj.count(2);
		int exp = 2;
		assertTrue(exp == actual );
		
	}
	
	@Test
	public void test_price() {
		empty obj = new empty();
		int actual = obj.price(127,100);
		int exp = 227;
		assertTrue(exp == actual);
	}

}
