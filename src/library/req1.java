package library;

import static org.junit.Assert.*;

import org.junit.Test;

public class req1 {

	@Test
	public void test_count() {
		empty obj = new empty();
		int actual = obj.count(0);
		int exp = 0;
		assertTrue(exp == actual );
		
	}
	@Test
	public void test_price() {
		empty obj = new empty();
		int actual = obj.price(0,0);
		int exp = 0;
		assertTrue(exp == actual);
	}

}
