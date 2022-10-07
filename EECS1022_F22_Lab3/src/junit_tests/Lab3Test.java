package junit_tests;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import model.Lab3;

class Lab3Test {

	@Test
	void testgetCalories1() {
		double calories = Lab3.getCalories(1, 25, 70.0, 170.0, false);
		assertEquals("Failed getCalories 1",1642.5,calories,0.0001);
	}
	@Test
	void testgetCalories2() {
		double calories = Lab3.getCalories(2, 35,60.0, 160.0, false);
		assertEquals("Failed getCalories 2",1264.0,calories,0.0001);
	}
	@Test
	void testgetCalories3() {
		double calories = Lab3.getCalories(1, 25, 70.0, 170.0, true);
		assertEquals("Failed getCalories 3",1971.0,calories,0.0001);
	}
	@Test
	void testgetCalories4() {
		double calories = Lab3.getCalories(2, 35,-52.6, 145.3, true);
		assertEquals("Failed getCalories 4",-1,calories,0.0001);
	}

	@Test
	void computeTax1() {
		double tax = Lab3.computeTax(50000.0);
		assertEquals("Failed computeTax 1",9237.5,tax,0.0001);
	}
	@Test
	void computeTax2() {
		double tax = Lab3.computeTax(6000.0);
		assertEquals("Failed computeTax 2",600.0, tax,0.0001);
	}
	@Test
	void computeTax3() {
		double tax = Lab3.computeTax(120000.0);
		assertEquals("Failed computeTax 3", 28227.0,tax,0.0001);
	}
	@Test
	void computeTax4() {
		double tax = Lab3.computeTax(-15000.0);
		assertEquals("Failed computeTax 4",-1.0,tax,0.0001);
	}

	@Test
	void validDate1() {
		boolean valid = Lab3.validDate(31, 2, 2022);
		assertEquals("Failed validDate 1", false, valid);
	}
	@Test
	void validDate2() {
		boolean valid = Lab3.validDate(31, 3, 1765);
		assertEquals("Failed validDate 2", true, valid);
	}
	@Test
	void validDate3() {
		boolean valid = Lab3.validDate(29, 2, 1600);
		assertEquals("Failed validDate 3", true, valid);
	}
	@Test
	void validDate4() {
		boolean valid = Lab3.validDate(29, 2, 2022);
		assertEquals("Failed validDate 4", false, valid);
	}
	@Test
	void validDate5() {
		boolean valid = Lab3.validDate(0, 2, 2022);
		assertEquals("Failed validDate 5", false, valid);
	}

}
