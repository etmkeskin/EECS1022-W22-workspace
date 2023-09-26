import java.util.ArrayList;

public class Lab8 {
	
	public static void switchPairs(ArrayList<String> list) {
		
		if(list.size() % 2 == 0) {
			for(int i = 1; i < list.size(); i += 2) {
				list.add(i - 1, list.get(i));
				list.remove(i + 1);
			}
		}
		else {
			for(int i = 1; i < list.size() - 1; i += 2) {
				list.add(i - 1, list.get(i));
				list.remove(i + 1);
			}
		}
	}
	
	
	public static String acronym(ArrayList<String> words) {
		String result = "";
		for(int i = 0; i < words.size(); i++) {
			String word = words.get(i);
			char firstChar = word.charAt(0);
			result += Character.toUpperCase(firstChar);
		}
	    return result;
	}
}


class Patient {
	private String name;
	private int ssn;
	private int age;
	private char gender;
	private String address;
	
	
	public Patient() {
		//default constructor
	}
	
	public Patient(String name, int ssn, int age, char gender, String address) {
		this.name = name;
		this.ssn = ssn;
		this.age = age;
		this.gender = gender;
		this.address = address;
	}
	
	public String getName() {
		return name;
	}
	
	public int getSsn() {
		return ssn;
	}
	
	public int getAge() {
		return age;
	}
	
	public char getGender() {
		return gender;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setSsn(int ssn) {
		this.ssn = ssn;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "Patient Name: " + name + "\t SSN: " + ssn + "\t Age: " + age + 
				"\t Gender: " + gender + "\t Address:re " + address;
	}
	
}


class Physician {
	private String name;
	private String phone;
	private ArrayList<Patient> patients;
	private int pCount = 0;
	
	
	public Physician() {
		//default constructor
	}
	
	public Physician(String name, String phone) {
		this.name = name;
		this.phone = phone;
		this.patients = new ArrayList<Patient>();
	}
	
	public String getName() {
		return name;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public ArrayList<Patient> getPatients(){
		return patients;
	}
	
	public int getPcount() {
		return pCount;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public void setPatients(ArrayList<Patient> patients) {
		this.patients = patients;
	}
	
	public void admitPatient(Patient patient) {
		if(patients.size() == 0) {
			patients.add(patient);
			pCount++;
		}
		else {
			if(isPatientExist(patient) == false) {
				patients.add(patient);
				pCount++;
			}
		}
	}
	
	public boolean isPatientExist(Patient patient) {
		boolean result = true;
		for(int i = 0; i < patients.size(); i++) {
			if(patients.get(i).getSsn() == patient.getSsn()) {
				result = true;
			}
			else {
				result = false;
			}
		}
		return result;
	}
	
	public void releasePatient(Patient patient) {
		for(int i = 0; i < patients.size(); i++) {
			int ssn = patients.get(i).getSsn();
			if(ssn == patient.getSsn()) {
				patients.remove(i);
				pCount--;
				break;
			}
		}
	}
	
	public String reportPatients() {
		String result = "[";
		if(patients.size() == 0) {
			return result + "]";
		}
		else {
			for(int i = 0; i < patients.size(); i++) {
				if(i < patients.size() - 1) {
					result += patients.get(i) + ", ";
				}
				else {
					result += patients.get(i);
				}
			}
			return result.toString() + "]";
		}
	}
	
	
}