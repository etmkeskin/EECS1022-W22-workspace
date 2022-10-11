package junit_tests;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import model.Lab4;

class Lab4Test {
	@Test
	void testisPerfect6() {
		assertEquals("Failed isPerfect for int 6",true, Lab4.isPerfect(6));
	}
	@Test
	void testisPerfect10() {
		assertEquals("Failed isPerfect for int 10",false, Lab4.isPerfect(10));
	}
	@Test
	void testisPerfect100() {
		assertEquals("Failed isPerfect for int 100",false, Lab4.isPerfect(100));
	}
	@Test
	void testisPerfect496() {
		assertEquals("Failed isPerfect for int 496",true, Lab4.isPerfect(496));
	}
	@Test
	void testgetVowels1() {
		assertEquals("Failed getVowels: Hello", 2, Lab4.getVowels("Hello"));
	}
	@Test
	void testgetVowels2() {
		assertEquals("Failed getVowels: I love JAVA", 5, Lab4.getVowels("I Love JAVA"));
	}
	@Test
	void testgetVowels4() {
		assertEquals("Failed getVowels: this PHRASE has 6 voweLS", 6, Lab4.getVowels("this PHRASE has 6 voweLS"));
	}

	@Test
	void testswitchLetterCase2() {
		assertEquals("Failed switchLetterCase: I Love JAVA", "i lOVE java", Lab4.switchLetterCase("I Love JAVA"));
	}
	@Test
	void testswitchLetterCase3() {
		assertEquals("Failed switchLetterCase: AbCdEfGh", "aBcDeFgH", Lab4.switchLetterCase("AbCdEfGh"));
	}

	@Test
	void testdigitSum1234() {
		assertEquals("Failed digitsum for 1234", 10, Lab4.digitSum(1234));
	}

	@Test
	void testdigitSum78321() {
		assertEquals("Failed digitsum for 78321", 21, Lab4.digitSum(78321));
	}

	@Test
	void testprintFactors24() {
		assertEquals("Failed printFactors for 24", "1-2-3-4-6-8-12-24", Lab4.printFactors(24));
	}
	@Test
	void testprintFactors11() {
		assertEquals("Failed printFactors for 11", "1-11", Lab4.printFactors(11));
	}

	@Test
	void testprintFactors44() {
		assertEquals("Failed printFactors for 44", "1-2-4-11-22-44", Lab4.printFactors(44));
	}

}
