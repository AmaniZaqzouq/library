package library;

import static org.junit.Assert.*;

import org.junit.Test;

public class req2 {

	@Test
	public void test_count() {
		empty obj = new empty();
		int actual = obj.count(1);
		int exp = 1;
		assertTrue(exp == actual );
		
	}
	
	@Test
	public void test_price() {
		empty obj = new empty();
		int actual = obj.price(127,0);
		int exp = 127;
		assertTrue(exp == actual);
	}
		

}
