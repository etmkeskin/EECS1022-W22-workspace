package junit_tests;

import static org.junit.Assert.*;

import org.junit.Test;

import model.Facility;
import model.Member;

public class TestMember {

	@Test
	public void test_1a() {
		Facility f1 = new Facility("Spinning Class", 2.5, 1);
		Facility f2 = new Facility("Gym", 2.0, 2);
		Facility f3 = new Facility("Locker", 1.5, 3);
		
		Member heeyeon = new Member("Heeyeon");
		assertEquals(0, heeyeon.getNumOfFacilities());
		heeyeon.addFacility(f1);
		assertEquals(1, heeyeon.getNumOfFacilities());
		heeyeon.addFacility(f2);
		assertEquals(2, heeyeon.getNumOfFacilities());
		heeyeon.addFacility(f3);
		assertEquals(3, heeyeon.getNumOfFacilities());
	}
	
	@Test
	public void test_1b() {//anonymous objects
//		Facility f1 = new Facility("Spinning Class", 2.5, 1);
//		Facility f2 = new Facility("Gym", 2.0, 2);
//		Facility f3 = new Facility("Locker", 1.5, 3);
		
		Member heeyeon = new Member("Heeyeon");
		assertEquals(0, heeyeon.getNumOfFacilities());
		
		/*
		 * Passing the address of an object being created on the fly.
		 * Without storing its address in a variable f1.
		 */
		
		heeyeon.addFacility(new Facility("Spinning Class", 2.5, 1)); 
		assertEquals(1, heeyeon.getNumOfFacilities());
		heeyeon.addFacility(new Facility("Gym", 2.0, 2));
		assertEquals(2, heeyeon.getNumOfFacilities());
		heeyeon.addFacility(new Facility("Locker", 1.5, 3));
		assertEquals(3, heeyeon.getNumOfFacilities());
		
		/*
		 * But we cannot use variables such as 'f1 ... f3' to refer to particular objects.
		 * instead we need to access to the PRIVATE facilities array.
		 * It is not useful and safe way to make attributes public. 
		 * Instead we need to write a getter method for the array.
		 */
	}
	
	@Test
	public void test_1c() {
//		Facility f1 = new Facility("Spinning Class", 2.5, 1);
//		Facility f2 = new Facility("Gym", 2.0, 2);
//		Facility f3 = new Facility("Locker", 1.5, 3);
		
		Member heeyeon = new Member("Heeyeon");
		assertEquals(0, heeyeon.getNumOfFacilities());
		heeyeon.addFacility("Spinning Class", 2.5, 1); //Overloaded version 
		assertEquals(1, heeyeon.getNumOfFacilities());
		heeyeon.addFacility("Gym", 2.0, 2);
		assertEquals(2, heeyeon.getNumOfFacilities());
		heeyeon.addFacility("Locker", 1.5, 3);
		assertEquals(3, heeyeon.getNumOfFacilities());
	}
	
	@Test
	public void test_2() {
		Facility f1 = new Facility("Spinning Class", 2.5, 1);
		Facility f2 = new Facility("Gym", 2.0, 2);
		Facility f3 = new Facility("Locker", 1.5, 3);
		
		Member heeyeon = new Member("Heeyeon");
		heeyeon.addFacility(f1);
		heeyeon.addFacility(f2);
		heeyeon.addFacility(f3);
		
		assertEquals(2.5 * 1 + 2.0 * 2 + 1.5 * 3, heeyeon.getPaymentDue(), 0.01);
	
	}
	
	@Test
	public void test_3() {
		Facility f1 = new Facility("Spinning Class", 2.5, 1);
		Facility f2 = new Facility("Gym", 2.0, 2);
		Facility f3 = new Facility("Locker", 1.5, 3);
		
		Member heeyeon = new Member("Heeyeon");
		heeyeon.addFacility(f1);
		heeyeon.addFacility(f2);
		heeyeon.addFacility(f3);
		
		int units = heeyeon.getFacilityUnits("Gym");
		assertEquals(2, units);
		
		heeyeon.extendFacilityUnits("Gym", 2);
		assertEquals(4, heeyeon.getFacilityUnits("Gym"));
		assertEquals(2.5 * 1 + 2.0 * 4 + 1.5 * 3, heeyeon.getPaymentDue(), 0.01);

	
	}

}
