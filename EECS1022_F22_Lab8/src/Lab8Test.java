import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

class Lab8Test {
	
	@Test
	@Order(1)
	void switchPairs1() {
		ArrayList <String> list = new ArrayList<String>();
		list.add("to");
		list.add("be");
		list.add("or");
		list.add("not");
		list.add("to");
		list.add("be");
		list.add("hamlet");
		Lab8.switchPairs(list);
		assertEquals(list.toString(), "[be, to, not, or, be, to, hamlet]");
		
	}
	@Test
	@Order(2)
	void switchPairs2() {
		ArrayList <String> list = new ArrayList<String>();
		list.add("Yes");
		list.add("No");
		
		Lab8.switchPairs(list);
		assertEquals(list.toString(), "[No, Yes]");
		
	}
	@Test
	@Order(3)
	void acronym1() {
		ArrayList <String> list = new ArrayList<String>();
		list.add("see");
		list.add("You");
		list.add("later");
	
		assertEquals("SYL", Lab8.acronym(list));
	}
	@Test
	@Order(4)
	void acronym2() {
		ArrayList <String> list = new ArrayList<String>();
		list.add("laughing");
		list.add("out");
		list.add("loud");
	
		assertEquals("LOL", Lab8.acronym(list));
	}
	@Test
	@Order(5)
	void acronym3() {
		ArrayList <String> list = new ArrayList<String>();
		list.add("Talk");
		list.add("to");
		list.add("you");
		list.add("later");
		assertEquals("TTYL", Lab8.acronym(list));
	}
	
//	@Test
//	@Order(6)
//	void Patient1(){
//		Patient p = new Patient("Jack", 123123, 20, 'M', "1 York st.");
//		String name = p.getName();
//		int ssn = p.getSsn();
//		int age = p.getAge();
//		char gender = p.getGender();
//		String address = p.getAddress();
//		String info = p.toString();
//		
//		assertEquals("Jack", name);
//		assertEquals(123123, ssn);
//		assertEquals(20, age);
//		assertEquals('M', gender);
//		assertEquals("1 York st.", address);
//		assertEquals("Patient Name: Jack\t SSN: 123123\t Age: 20\t Gender: M\t Address: 1 York st.", info);
//		
//		p.setName("Jonathan");
//		p.setAge(24);
//		p.setAddress("2 Pond st.");
//		
//		assertEquals("Jonathan", p.getName());
//		assertEquals(24, p.getAge());
//		assertEquals("2 Pond st.", p.getAddress());
//		assertEquals("Patient Name: Jonathan\t SSN: 123123\t Age: 24\t Gender: M\t Address: 2 Pond st.", p.toString());
//	}
//	@Test
//	@Order(7)
//	void Physician1(){
//		Physician p = new Physician("Mary", "647-111-1111");
//		String name = p.getName();
//		String phone = p.getPhone();
//		int len = p.getPatients().size();
//		
//		assertEquals("Mary", name);
//		assertEquals("647-111-1111", phone);
//		assertEquals(0, len);
//		
//		p.setName("Sara");
//		p.setPhone("647-222-2222");
//		
//		assertEquals("Sara", p.getName());
//		assertEquals("647-222-2222", p.getPhone());
//		assertEquals(p.reportPatients(), "[]");
//	}
//	
//	@Test
//	@Order(8)
//	void Physician2() {
//		Physician mary = new Physician("Mary", "647-111-1111");
//		Patient p1 = new Patient("Jane", 123123, 20, 'M', "1 York st.");
//				
//		mary.admitPatient(p1);
//		assertEquals(mary.getPatients().size(), 1);
//		assertEquals(mary.getPatients().get(0).toString(), "Patient Name: Jane\t SSN: 123123\t Age: 20\t Gender: M\t Address: 1 York st.");
//		
//	}
//	@Test
//	@Order(9)
//	void Physician3() {
//		Physician mary = new Physician("Mary", "647-111-1111");
//		Patient p1 = new Patient("Jack", 123123, 20, 'M', "1 York st.");
//		Patient p2 = new Patient("Sam", 123124, 18, 'M', "2 York st.");
//		Patient p3 = new Patient("Bill", 123125, 34, 'M', "3 York st.");
//		Patient p4 = new Patient("Mona", 123126, 28, 'F', "4 York st.");
//		
//		mary.admitPatient(p1);
//		mary.admitPatient(p2);
//		mary.admitPatient(p3);
//		mary.admitPatient(p4);
//		assertEquals(mary.getPatients().size(), 4);
//		
//		String report = mary.reportPatients();
//		assertEquals(report, "[Patient Name: Jack\t SSN: 123123\t Age: 20\t Gender: M\t Address: 1 York st., "+
//							 "Patient Name: Sam\t SSN: 123124\t Age: 18\t Gender: M\t Address: 2 York st., "+
//							 "Patient Name: Bill\t SSN: 123125\t Age: 34\t Gender: M\t Address: 3 York st., "+
//							 "Patient Name: Mona\t SSN: 123126\t Age: 28\t Gender: F\t Address: 4 York st.]");
//	}
//	
//	@Test
//	@Order(10)
//	void Physician4() {
//		Physician mary = new Physician("Mary", "647-111-1111");
//		Patient p1 = new Patient("Jack", 123123, 20, 'M', "1 York st.");
//		Patient p2 = new Patient("Sam", 123124, 18, 'M', "2 York st.");
//		Patient p3 = new Patient("Bill", 123125, 34, 'M', "3 York st.");
//		Patient p4 = new Patient("Mona", 123126, 28, 'F', "4 York st.");
//		
//		mary.admitPatient(p1);
//		mary.releasePatient(p2);
//		assertEquals(mary.getPatients().size(), 1);
//		
//		mary.admitPatient(p2);
//		mary.admitPatient(p3);
//		mary.admitPatient(p4);
//		mary.admitPatient(p4);
//		assertEquals(mary.getPatients().size(), 4);
//				
//		mary.releasePatient(p3);
//		assertEquals(mary.getPatients().size(), 3);
//		
//		String report = mary.reportPatients();
//		assertEquals(report, "[Patient Name: Jack\t SSN: 123123\t Age: 20\t Gender: M\t Address: 1 York st., "+
//							 "Patient Name: Sam\t SSN: 123124\t Age: 18\t Gender: M\t Address: 2 York st., "+
//							 "Patient Name: Mona\t SSN: 123126\t Age: 28\t Gender: F\t Address: 4 York st.]");
//	}

}