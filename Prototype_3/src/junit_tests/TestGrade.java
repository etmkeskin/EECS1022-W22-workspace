package junit_tests;

import static org.junit.Assert.*;

import org.junit.Test;

import model.Grade;

public class TestGrade {

	@Test
	public void test() {
		String result = Grade.getLetterGrade1(63);
		assertEquals("C", result);
	}

}
