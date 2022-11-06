package junit_tests;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import model.Lab5;

class Lab5Test {

	@Test
	void printStars2() {
		String expected = "**\n-*";
		assertEquals("Failed printStars2",expected, Lab5.printStars(2));
	}
	@Test
	void printStars3() {
		String expected = "***\n-**\n--*";
		assertEquals("Failed printStars3",expected, Lab5.printStars(3));
	}
	@Test
	void expand2() {
		String expected = "4*1000 + 6*100 + 6*10 + 5";
		assertEquals("Failed expand2", expected, Lab5.expand(4665, 4));
	}
	@Test
	void expand3() {
		String expected = "Invalid";
		assertEquals("Failed expand3", expected, Lab5.expand(-665, 3));
	}
	
	@Test
	void getSeqStat1() {
		String expected = "{[<10>: 10, 10]; [<10, 15>: 25, 150]}";
		assertEquals("Failed getSeqStat1", expected, Lab5.getSeqStat(10, 5, 2));
	}
	@Test
	void getSeqStat2() {
		String expected = "{[<4>: 4, 4]; [<4, 10>: 14, 40]; [<4, 10, 16>: 30, 640];"
				+ " [<4, 10, 16, 22>: 52, 14080]; [<4, 10, 16, 22, 28>: 80, 394240]}";
		assertEquals("Failed getSeqStat2", expected, Lab5.getSeqStat(4, 6, 5));
	}
	@Test
	void seqInterleaving1() {
		String expected = "<1, 10, 3, 20, 30, 40>";
		assertEquals("Failed getSeqStat2", expected, Lab5.seqInterleaving(1, 2, 2, 10, 10, 4));
	}
	@Test
	void seqInterleaving2() {
		String expected = "<3, 9, 4, -1>";
		assertEquals("Failed getSeqStat2", expected, Lab5.seqInterleaving(3, 5, 1, 9, -5, 3));
	}
}
