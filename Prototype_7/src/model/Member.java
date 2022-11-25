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
	private Facility[] facilities;  //stores an array of Facility objects' addresses.
	private int nof;  //# of facilities
	
	//
	/*
	 * CONSTRUCTOR (create instances of the current class)
	 */
	//
	//Without declaring any constructor explicitly, a default constructor is available.
	//In principle all constructors are public.
	
	public Member() {//an explicitly-declared default constructor.
		//do nothing
	}
	
	public Member(String name) {
		this.name = name;
	}
	
	//As soon as a customized constructor is declared, default constructor is disappear.
	public Member(int id, char type, double balance) {
		this.id = id; // this.id denotes the attribute 'id', whereas RHS 'id' denotes the input parameter.
		this.type = type;
		this.balance = balance;
	}
	
	public Member(String name, int id, char type, double balance) {
		this(id, type, balance); //Calling another constructor Member(int, char, double).
		this.name = name;
	}
	
	//weights is in kg and height is in cm
	public Member(double weight, double height) {
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
	
	
	
	
	
}
