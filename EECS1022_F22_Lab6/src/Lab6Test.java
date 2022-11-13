import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Lab6Test {
	@Test
	void longestSeq1() {
		int[] a = {7,9,10,-3,-2,-1,12,20};
		assertEquals("Failed longestSeq1",3, Lab6.longestSeq(a));
	}
	@Test
	void longestSeq2() {
		int[] a = {};
		assertEquals("Failed longestSeq2",0, Lab6.longestSeq(a));
	}
	@Test
	void longestSeq3() {
		int[] a = {7,9,15,-3,-8,-5,12,20};
		assertEquals("Failed longestSeq3",1, Lab6.longestSeq(a));
	}
	@Test
	void getArrayStats1() {
		int [] a = {4,8,1,6,11};
		String expected = "Array: [4, 8, 1, 6, 11], Average: 6, Range: 10";
		assertEquals("Failed getArrayStats1",expected, Lab6.getArrayStats(a));
	}
	@Test
	void getArrayStats2() {
		int [] a = {8,-6,-11};
		String expected = "Array: [8, -6, -11], Average: -3, Range: 19";
		assertEquals("Failed getArrayStats2",expected, Lab6.getArrayStats(a));
	}
	@Test
	void getArrayStats3() {
		int [] a = {4,7};
		String expected = "Array: [4, 7], Average: 6, Range: 3";
		assertEquals("Failed getArrayStats3",expected, Lab6.getArrayStats(a));
	}
	@Test
	void countArray1() {
		int [] a = {2,10,10,98,3,146};
		String expected = "2: 1\n10: 2\n98: 1";
		assertEquals("Failed countArray1",expected, Lab6.countArray(a));
	}
	@Test
	void countArray2() {
		int [] a = {};
		String expected = "";
		assertEquals("Failed countArray2",expected, Lab6.countArray(a));
	}
	@Test
	void countArray3() {
		int [] a = {6,12,6,6,18,45};
		String expected = "6: 3\n12: 1\n18: 1";
		assertEquals("Failed countArray3",expected, Lab6.countArray(a));
	}
	@Test
	void swapElements1() {
		int [] a = {6,12,6,7,18,45};
		Lab6.swapElements(a);
		boolean expected = (a[0]==12 && a[1]==6 && a[2]==7 && a[3]==6 && a[4]==45 && a[5]==18);  
		assertEquals("Failed swapElements1",expected, true);
	}
	@Test
	void swapElements2() {
		int [] a = {6,12,6,7,18};
		Lab6.swapElements(a);
		boolean expected = (a[0]==18 && a[1]==7 && a[2]==6 && a[3]==12 && a[4]==6);  
		assertEquals("Failed swapElements2",expected, true);
	}
	@Test
	void validString1() {
		assertEquals("Failed validString1",true, Lab6.validString("heeaaalolo", "hello"));
	}
	@Test
	void validString2() {
		assertEquals("Failed validString2",false, Lab6.validString("hlelo", "hello"));
	}
	@Test
	void validString4() {
		assertEquals("Failed validString4",false, Lab6.validString("certeedinnnn", "certain"));
	}
}