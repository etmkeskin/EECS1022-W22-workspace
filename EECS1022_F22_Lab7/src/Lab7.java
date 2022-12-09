
public class Lab7 {
	
	public static String arrayResult(int[][] array) {
		String result = "";
		int evenSum = 0;
		int oddProduct = 1;
		
		if(array.length == 0) {
			return result;
		}
		else {
			if(array.length == 1) {
				oddProduct = 0;
			}
			for(int i = 0; i < array.length; i++) {
				for(int j = 0; j < array[i].length; j++) {
					if((i + j) % 2 == 0) {
						evenSum += array[i][j]; 
					}
					else if((i + j) % 2 == 1) {
						oddProduct *= array[i][j];
					}
				}
			}
		}
		result = "Sum:" + evenSum + ", Product:" + oddProduct;
		
		return result;
	}
	
	
	public static boolean magicSquare(int[][] array) {
		boolean result = false;
		int[] rowSum = new int[array.length];
		int[] columnSum = new int[array.length];
		int diagonalSum1 = 0;
		int diagonalSum2 = 0;
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array.length; j++) {
				rowSum[i] += array[i][j]; 
			}
		}
		for(int j = 0; j < array.length; j++) {
			for(int i = 0; i < array.length; i++) {
				columnSum[j] += array[i][j]; 
			}
		}
		for(int i = 0; i < array.length; i++) {
			diagonalSum1 += array[i][i];
		}
		for(int i = array.length - 1; i >= 0;) {
			for(int j = 0; j < array.length; j++) {
				diagonalSum2 += array[i][j];
				i--;
			}
		}
		if(diagonalSum1 == diagonalSum2) {
			for(int i = 0; i < array.length; i++) {
				if(rowSum[i] == columnSum[i]) {
					result = true;
				}
				else {
					return result;
				}
			}
		}
		else {
			return result;
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
		//default constructor;
	}
	
	public Patient(String name, int ssn, int age, char gender, String address) {
		this.name = name;
		this.ssn = ssn;
		this.age = age;
		this.gender = gender;
		this.address = address;
	}
	
	//Accessor methods
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
	
	//Mutator methods
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
		return "Patient Name: " + name + "\t" + "SSN: " + ssn + "\t" + "Age: " + age + "\t" + 
	"Gender: " + gender + "\t" + "Address: " + address;
	}
	
}

class Physician {
	private String name;
	private String phone;
	private int MAX_PATIENT = 3;
	private int pCount = 0;
	private Patient[] patients;
	
	public Physician() {
		//default constructor
	}
	
	public Physician(String name, String phone) {
		this.name = name;
		this.phone = phone;
		this.patients = new Patient[MAX_PATIENT];
	}
	
	//Accessor Methods
	public String getName() {
		return name;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public int getPcount() {
		return pCount;
	}
	
	public Patient[] getPatients() {
		return patients;
	}
	
	//Mutator Methods
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public void setPatients(Patient[] patients) {
		this.patients = patients;
	}
	
	public void admitPatient(Patient patient) {
		for(int i = pCount; i < patients.length; pCount++) {
			if(patients.length < 3) {
				patients[i] = patient;
			}
			else {
			}
		}
	}
	
	public void increaseLength(Patient[] patients) {
		if(pCount >= 3) {
			MAX_PATIENT++;
			patients = new Patient[MAX_PATIENT];
		}
	}
	
	
	
	
	
	
	
	
	
}