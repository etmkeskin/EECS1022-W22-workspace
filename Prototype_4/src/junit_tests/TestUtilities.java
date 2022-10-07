package junit_tests;

import static org.junit.Assert.*;

import org.junit.Test;

import model.Utilities;

public class TestUtilities {

	@Test
	public void test_getSequence1a() {
		String result = Utilities.getSequence1a(6, 11, 4);
		assertEquals("<6, 17, 28, 39> has average 22.5", result);
	}
	
	@Test
	public void test_getSequence1b() {
		String result = Utilities.getSequence1a(6, 11, 4);
		assertEquals("<6, 17, 28, 39> has average 22.5", result);
	}

}
