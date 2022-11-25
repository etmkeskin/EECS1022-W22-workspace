import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Lab7Test {
	@Test
	void arrayResult1() {
		int[][] a = {{8,1,6},{3,5,7},{4,9,2}};
		assertEquals("Failed arrayResult1","Sum:25, Product:189", Lab7.arrayResult(a));
	}
	@Test
	void arrayResult2() {
		int[][] a = {{1}};
		assertEquals("Failed arrayResult2","Sum:1, Product:0", Lab7.arrayResult(a));
	}
	@Test
	void arrayResult3() {
		int[][] a = {};
		assertEquals("Failed arrayResult3","", Lab7.arrayResult(a));
	}
	@Test
	void magicSquare1() {
		int[][] a = { {8, 1, 6},
					  {3, 5, 7},
					  {4, 9, 2} };
		assertEquals("Failed magicSquare1",true, Lab7.magicSquare(a));
	}
	@Test
	void magicSquare2() {
		int[][] a = { {8, 10, 6},
					  {3, 5, 4},
					  {4, 9, 2} };
		assertEquals("Failed magicSquare2",false, Lab7.magicSquare(a));
	}
	@Test
	void magicSquare3() {
		int[][] a = {{1}};
		assertEquals("Failed magicSquare3",true, Lab7.magicSquare(a));
	}
	@Test
	void magicSquare4() {
		int[][] a = { {3, 16, 2, 13},
					  {6,  9, 7, 12},
					  {10, 5, 11, 8},
					  {15, 4, 14, 1} };
		assertEquals("Failed magicSquare4",false, Lab7.magicSquare(a));
	}
	@Test
	void magicSquare5() {
		int[][] a = { {7, 12, 1, 14},
					  {2, 13, 8, 11},
					  {16, 3, 10, 5},
					  {9,  6, 15, 4} };
		assertEquals("Failed magicSquare4",true, Lab7.magicSquare(a));
	}
	@Test
	void Patient1(){
		Patient p = new Patient("Jack", 123123, 20, 'M', "1 York st.");
		String name = p.getName();
		int ssn = p.getSsn();
		int age = p.getAge();
		char gender = p.getGender();
		String address = p.getAddress();
		String info = p.toString();
		
		assertEquals("Jack", name);
		assertEquals(123123, ssn);
		assertEquals(20, age);
		assertEquals('M', gender);
		assertEquals("1 York st.", address);
		assertEquals("Patient Name: Jack\t SSN: 123123\t Age: 20\t Gender: M\t Address: 1 York st.", info);
		
		p.setName("Jonathan");
		p.setAge(24);
		p.setAddress("2 Pond st.");
		
		assertEquals("Jonathan", p.getName());
		assertEquals(24, p.getAge());
		assertEquals("2 Pond st.", p.getAddress());
		assertEquals("Patient Name: Jonathan\t SSN: 123123\t Age: 24\t Gender: M\t Address: 2 Pond st.", p.toString());
	}
	@Test
	void Physician1(){
		Physician p = new Physician("Mary", "647-111-1111");
		String name = p.getName();
		String phone = p.getPhone();
		int len = p.getPatients().length;
		
		assertEquals("Mary", name);
		assertEquals("647-111-1111", phone);
		assertEquals(3, len);
		
		p.setName("Sara");
		p.setPhone("647-222-2222");
		
		assertEquals("Sara", p.getName());
		assertEquals("647-222-2222", p.getPhone());
		assertEquals(p.reportPatients(), "");
	}
	
	@Test
	void Physician2() {
		Physician mary = new Physician("Mary", "647-111-1111");
		Patient p1 = new Patient("Jack", 123123, 20, 'M', "1 York st.");
				
		mary.admitPatient(p1);
		assertEquals(mary.getPcount(), 1);
		assertEquals(mary.getPatients()[0].toString(), "Patient Name: Jack\t SSN: 123123\t Age: 20\t Gender: M\t Address: 1 York st.");
		
	}
	@Test
	void Physician3() {
		Physician mary = new Physician("Mary", "647-111-1111");
		Patient p1 = new Patient("Jack", 123123, 20, 'M', "1 York st.");
		Patient p2 = new Patient("Sam", 123124, 18, 'M', "2 York st.");
		Patient p3 = new Patient("Bill", 123125, 34, 'M', "3 York st.");
		Patient p4 = new Patient("Mona", 123126, 28, 'F', "4 York st.");
		
		mary.admitPatient(p1);
		assertEquals(mary.getPcount(), 1);
		assertEquals(mary.getPatients()[0].toString(), "Patient Name: Jack\t SSN: 123123\t Age: 20\t Gender: M\t Address: 1 York st.");
	    
		mary.admitPatient(p2);
		mary.admitPatient(p3);
		mary.admitPatient(p4);
		assertEquals(mary.getPcount(), 4);
		assertEquals(mary.getPatients().length, 6);
		
		String report = mary.reportPatients();
		assertEquals(report, "Patient Name: Jack\t SSN: 123123\t Age: 20\t Gender: M\t Address: 1 York st.\n"+
							 "Patient Name: Sam\t SSN: 123124\t Age: 18\t Gender: M\t Address: 2 York st.\n"+
							 "Patient Name: Bill\t SSN: 123125\t Age: 34\t Gender: M\t Address: 3 York st.\n"+
							 "Patient Name: Mona\t SSN: 123126\t Age: 28\t Gender: F\t Address: 4 York st.\n");
	}
	@Test
	void Physician4() {
		Physician mary = new Physician("Mary", "647-111-1111");
		Patient p1 = new Patient("Jack", 123123, 20, 'M', "1 York st.");
		Patient p2 = new Patient("Sam", 123124, 18, 'M', "2 York st.");
		Patient p3 = new Patient("Bill", 123125, 34, 'M', "3 York st.");
		Patient p4 = new Patient("Mona", 123126, 28, 'F', "4 York st.");
		
		mary.admitPatient(p1);
		mary.releasePatient(p2);
		assertEquals(mary.getPcount(), 1);
		
		mary.admitPatient(p2);
		mary.admitPatient(p3);
		mary.admitPatient(p4);
		assertEquals(mary.getPcount(), 4);
		assertEquals(mary.getPatients().length, 6);
		
		mary.releasePatient(p3);
		assertEquals(mary.getPcount(), 3);
		assertEquals(mary.getPatients().length, 6);
		
		String report = mary.reportPatients();
		assertEquals(report, "Patient Name: Jack\t SSN: 123123\t Age: 20\t Gender: M\t Address: 1 York st.\n"+
							 "Patient Name: Sam\t SSN: 123124\t Age: 18\t Gender: M\t Address: 2 York st.\n"+
							 "Patient Name: Mona\t SSN: 123126\t Age: 28\t Gender: F\t Address: 4 York st.\n");
	}
}
