package model;

public class Sequence {
	
	/*
	 * first version of methods called by SequenceApp1
	 */
	public static String getSequence1(int ft, int d) {
		String result = "";
		
		int term1 = ft;
		int term2 = ft + d;
		int term3 = ft + 2 * d;
		int term4 = ft + 3 * d;
		int term5 = ft + 4 * d;
		
		result = "<" + term1 + ", " + term2 + ", " + term3 + ", " + term4 + ", " + term5 + ">";
		
		return result;
	}
	
	
	public static int getSum1(int ft, int d) {
		int sum = 0;
		
		int term1 = ft;
		int term2 = ft + d;
		int term3 = ft + 2 * d;
		int term4 = ft + 3 * d;
		int term5 = ft + 4 * d;
		
		sum = term1 + term2 + term3 + term4 + term5;
		
		return sum;
	}
	
	/*
	 * second version of methods called by SequenceApp2
	 */
	public static String getSequence2(int ft, int d) {
		String result = "";
		
		String seq = "<" + ft + ", " + (ft + d) + ", " + (ft + d * 2) + ", " + (ft + d * 3) + ", " + (ft + d * 4) + ">";
		
		result = seq;
		
		return result;
	}
	
	public static int getSum2(int ft, int d) {
		int result = 0;
		
		int sum = 5 * ft + (1 + 2 + 3 + 4) * d;
		result = sum;
		
		return result;
	}
	
	
}
