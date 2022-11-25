package model;


//gym facility: tennis, spinning class, group power class
public class Facility {
	private String name;
	private double price; //unit price
	private int units;
	
	public Facility(String name, double price, int units) {
		this.name = name;
		this.price = price;
		this.units = units;
	}
	
	/*
	 * accessor method for Facility class
	 */
	public double getPaymentDue() {
		return this.price * this.units;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getUnits() {
		return this.units;
	}
	
	
	/*
	 * Mutator Methods
	 */
	
	public void setUnits(int units) {
		this.units = units;
	}

}
