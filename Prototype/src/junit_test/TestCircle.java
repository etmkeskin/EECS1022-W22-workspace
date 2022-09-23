package junit_test;

import static org.junit.Assert.*;

import org.junit.Test;

import model.Circle;

public class TestCircle {
	
	/*
	 * Each test method corresponds to a ***manual***
	 * launch and interaction with the Circle2.
	 */

	@Test
	public void test() {
		assertEquals(314.0, Circle.getArea(10.0), 1);
		/*
		 * 314(expected), second(actual value that calculates from our utility method)
		 * 0.01 means, difference between expected and actual cannot be more than 0.01
		 */
		}
	
	@Test
	public void test2() {
		assertEquals(20.0 * 20.0 * 3.1415926, Circle.getArea(20.0), 1);
		/*
		 * 314(expected), second(actual value that calculates from our utility method)
		 * 0.01 means, difference between expected and actual cannot be more than 0.01
		 */
		}

}
