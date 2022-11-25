package model;

/*
 * A template for member object.
 */
public class Member {
	
	//
	/*
	 * Attributes (class - level variables, all methods can access them)
	 */
	//
	
	//private variable are only accessible within the current class.
	//for other classes to access these private variables, call a public accessor methods.(encapsulation)

	private int id; //123456 
	private char type; // 's' for silver, 'b' bronze(10% discount rate on facilities), 'g' golden(15%)
	private double balance;
	private String name;
	private double weight;
	private double height;
	
	/*
	 * Single-valued, reference-typed attributes.
	 */
	private Trainer trainer; //stores a single Trainer type object's address.
	
	/*
	 * Multi-valued, reference-typed attributes.
	 */
	private final int MAX_NUMBER_OF_FACILITIES = 6; //Assumption is each member can book up to 6 facilities. Constant.
	private Facility[] facilities;  //stores an array of Facility objects' addresses.
	private int nof;  //# of facilities. There are two purposes of 'nof' attribute:
	
	/*
	 * 1. Records how many facility object addresses have been stored in facilities array so far.
	 * 2. Indicates the index into facilities array for storing the next facility object's address.
	 */
	
	//
	/*
	 * CONSTRUCTOR (create instances of the current class)
	 */
	//
	//Without declaring any constructor explicitly, a default constructor is available.
	//In principle all constructors are public.
	
	public Member() {//an explicitly-declared default constructor.
		//default action
		this.facilities = new Facility[MAX_NUMBER_OF_FACILITIES];
		this.nof = 0;
	}
	
	public Member(String name) {
		this(); //*** Calling the constructor that performs default action.
		this.name = name;
	}
	
	//As soon as a customized constructor is declared, default constructor is disappear.
	public Member(int id, char type, double balance) {
		this(); //*** Calling the constructor that performs default action.
		this.id = id; // this.id denotes the attribute 'id', whereas RHS 'id' denotes the input parameter.
		this.type = type;
		this.balance = balance;
	}
	
	//You can only call one helper constructor as the first line. Not more than 1.
	public Member(String name, int id, char type, double balance) {
		//this(); //*** Calling the constructor that performs default action.
		/*
		 * Calling the helper constructor below will also in turn call the other helper constructor.
		 * this(id, type, balance) helper call will perform the constructor above.
		 * And the constructor in line 61 will be calling default action with this();
		 */
		this(id, type, balance); //Calling another constructor Member(int, char, double).
		this.name = name;
	}
	
	//weights is in kg and height is in cm
	public Member(double weight, double height) {
		this(); //*** Calling the constructor that performs default action.
		this.weight = weight;
		this.height = height;
	}
	
	
	//
	/*
	 * ACCESSOR Method (returning some useful info)
	 */
	//
	
	public double getWeight() {
		return this.weight;
	}
	
	public double getHeight() {
		return this.height;
	}
	
	public String getBMIReport() {
		String result = "";
		
		double heightInMeters = this.height / 100;
		double bmi = this.weight / (heightInMeters * heightInMeters);
		if(bmi < 18.5) {
			result = "Underweight";
		}
		else if(bmi < 25.0) {
			result = "Normal";
		}
		else if(bmi < 30.0) {
			result = "Overweight";
		}
		else {
			result = "Obese";
		}
		
		return result + " (" + String.format("%.1f", bmi) + ")";
	}
	
	public Trainer getTrainer() { //return the address of some Trainer type object.
		return this.trainer;
	}
	
	public int getNumOfFacilities() {
		return this.nof;
	}
	
	public double getPaymentDue() {
		double result = 0.0;
		for(int i = 0; i < this.nof; i++) {
			result += this.facilities[i].getPaymentDue();
		}
		
		return result;
	}
	
	public int getFacilityUnits(String name) {//Assume facility names are unique.
		int result = -1;
		Facility f = null;
		boolean hasFound = false;
		for(int i = 0; !hasFound && i < this.nof; i++) {
			if(this.facilities[i].getName().equals(name)) {
				f = this.facilities[i];
				hasFound = true;
			}
		}
		if(f != null) {
			result = f.getUnits();
		}
		return result;
	}
	
	
	
	//
	/*
	 * MUTATOR method (VOID, not returning anything; modifying attributes)
	 * we can also add conditionals here as well.
	 */
	//
	
	public void changeWeightBy(double units) {
		this.weight += units;
	}
	
	//Version where there is no class between parameter 't' and attribute 'trainer', this keyword is not necessary.
	public void registerTrainer(Trainer t) {
		trainer = t;
	}
	
	/*
	 * Refer input member 'm' trainer to the context object.
	 */
	public void referTrainer(Member m) {
		this.trainer = m.getTrainer();
		
	}
	
	//Exercise: swap the trainers of two members
	public void swapTrainer(Member m) {
		this.trainer = m.getTrainer();
	}
	
	//Add a new facility object to the end of the 'facilities' array.
	public void addFacility(Facility f) {
		this.facilities[this.nof] = f;
		this.nof ++;
	}
	
	/*
	 * Overloaded methods are with the same names.
	 * But distinguished by their list of parameter types.
	 */
	
	public void addFacility(String name, double price, int units) {
		Facility f = new Facility(name, price, units);
		this.addFacility(f);
//		this.facilities[this.nof] = f;
//		this.nof ++;
	}
	
	public void extendFacilityUnits(String name, int howMany) {
		int result = -1;
		Facility f = null;
		boolean hasFound = false;
		for(int i = 0; !hasFound && i < this.nof; i++) {
			if(this.facilities[i].getName().equals(name)) {
				f = this.facilities[i];
				hasFound = true;
			}
		}
		if(f != null) {//hasFound == true
			f.setUnits(f.getUnits() + howMany);
		}
		else {//f == null
			//input name denotes some facility not being added, then do nothing.
		}
	}
	
	
	
	
	
}
