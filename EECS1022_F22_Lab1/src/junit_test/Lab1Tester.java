package junit_test;

import static org.junit.Assert.*;

import org.junit.Test;

import model.Lab1;

public class Lab1Tester {

	@Test
	public void testInverse1() {
		double inverse = Lab1.inverseSquare(1); 
		assertEquals("Failed inverseSquare of 1",1.0,inverse,0);
	}
	@Test
	public void testInverse2() {
		double inverse = Lab1.inverseSquare(2); 
		assertEquals("Failed inverseSquare of 2",0.25,inverse,0);
	}
	@Test
	public void testInverse4() {
		double inverse = Lab1.inverseSquare(4); 
		assertEquals("Failed inverseSquare of 4",0.0625,inverse,0);
	}
	@Test
	public void testInverse10() {
		double inverse = Lab1.inverseSquare(10); 
		assertEquals("Failed inverseSquare of 10",0.01,inverse,0);
	}
	@Test
	public void testInverse100() {
		double inverse = Lab1.inverseSquare(100); 
		assertEquals("Failed inverseSquare of 100",0.0001,inverse,0);
	}
	@Test
	public void testInverse1000() {
		double inverse = Lab1.inverseSquare(1000); 
		assertEquals("Failed inverseSquare of 1000",0.000001,inverse,0);
	}
	
	@Test
	public void testTimeToHawaii1() {
		int time = Lab1.timeToHawaii(0, 0, 0); 
		assertEquals("Failed TimeToHawaii(0, 0, 0)",0,time,0);
	}
	@Test
	public void testTimeToHawaii2() {
		int time = Lab1.timeToHawaii(1, 1, 1); 
		assertEquals("Failed TimeToHawaii(1, 1, 1)",3661,time,0);
	}
	@Test
	public void testTimeToHawaii3() {
		int time = Lab1.timeToHawaii(1, 0, 30); 
		assertEquals("Failed TimeToHawaii(1, 0, 30)",3630,time,0);
	}
	@Test
	public void testTimeToHawaii4() {
		int time = Lab1.timeToHawaii(5, 60, 0); 
		assertEquals("Failed TimeToHawaii(5, 60, 0",21600,time,0);
	}
	@Test
	public void testTimeToHawaii5() {
		int time = Lab1.timeToHawaii(3, 15, 25); 
		assertEquals("Failed TimeToHawaii(3, 15, 25)",11725,time,0);
	}
	
	@Test
	public void testPaintMyRoom1() {
		double gallons = Lab1.paintMyRoom(0, 0, 0); 
		assertEquals("Failed PaintMyRoom (0,0,0)",0,gallons,0);
	}
	@Test
	public void testPaintMyRoom2() {
		double gallons = Lab1.paintMyRoom(1, 1, 1); 
		assertEquals("Failed PaintMyRoom(1, 1, 1)",0.01142,gallons,0.001);
	}
	@Test
	public void testPaintMyRoom3() {
		double gallons = Lab1.paintMyRoom(10, 12, 5); 
		assertEquals("Failed PaintMyRoom(10, 12, 5)",0.6285,gallons,0.001);
	}
	@Test
	public void testPaintMyRoom4() {
		double gallons = Lab1.paintMyRoom(100, 200, 20); 
		assertEquals("Failed PaintMyRoom(100, 200, 20)",34.2857,gallons,0.001);
	}
	@Test
	public void testPaintMyRoom5() {
		double gallons = Lab1.paintMyRoom(54, 27, 12); 
		assertEquals("Failed PaintMyRoom(54, 27, 12)",5.5542,gallons,0.001);
	}
	
	@Test
	public void testBaseConvert2() {
		String number = Lab1.baseConvert(2,15); 
		assertEquals("Failed BaseConvert(2,15)","1111",number);
	}
	@Test
	public void testBaseConvert22() {
		String number = Lab1.baseConvert(2,7); 
		assertEquals("Failed BaseConvert(2,7)","0111",number);
	}
	@Test
	public void testBaseConvert3() {
		String number = Lab1.baseConvert(3,80); 
		assertEquals("Failed BaseConvert(3,80)","2222",number);
	}
	@Test
	public void testBaseConvert33() {
		String number = Lab1.baseConvert(3,15); 
		assertEquals("Failed BaseConvert(2,15)","0120",number);
	}
	@Test
	public void testBaseConvert4() {
		String number = Lab1.baseConvert(4,255); 
		assertEquals("Failed BaseConvert(4,255)","3333",number);
	}
	@Test
	public void testBaseConvert44() {
		String number = Lab1.baseConvert(4,125); 
		assertEquals("Failed BaseConvert(4,125)","1331",number);
	}
	@Test
	public void testBaseConvert5() {
		String number = Lab1.baseConvert(5,624); 
		assertEquals("Failed BaseConvert(5,624)","4444",number);
	}
	@Test
	public void testBaseConvert55() {
		String number = Lab1.baseConvert(5,37); 
		assertEquals("Failed BaseConvert((5,37)","0122",number);
	}
	@Test
	public void testBaseConvert6() {
		String number = Lab1.baseConvert(6,1295); 
		assertEquals("Failed BaseConvert(6,1295)","5555",number);
	}
	@Test
	public void testBaseConvert66() {
		String number = Lab1.baseConvert(6,678); 
		assertEquals("Failed BaseConvert(6,678)","3050",number);
	}
	@Test
	public void testBaseConvert7() {
		String number = Lab1.baseConvert(7,2400); 
		assertEquals("Failed BaseConvert(7,2400)","6666",number);
	}
	@Test
	public void testBaseConvert77() {
		String number = Lab1.baseConvert(7,678); 
		assertEquals("Failed BaseConvert(7,678)","1656",number);
	}
	@Test
	public void testBaseConvert8() {
		String number = Lab1.baseConvert(8,4095); 
		assertEquals("Failed BaseConvert(2,15)","7777",number);
	}
	@Test
	public void testBaseConvert88() {
		String number = Lab1.baseConvert(8,1568); 
		assertEquals("Failed BaseConvert(8,1568)","3040",number);
	}
	@Test
	public void testBaseConvert9() {
		String number = Lab1.baseConvert(9,6560); 
		assertEquals("Failed BaseConvert(9,6560)","8888",number);
	}
	@Test
	public void testBaseConvert99() {
		String number = Lab1.baseConvert(9,6488); 
		assertEquals("Failed BaseConvert(9,6488)","8808",number);
	}

}
