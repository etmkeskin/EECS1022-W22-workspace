package console_apps;
import java.util.Scanner;

import model.Lab5;

public class Lab5Console {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
		
		//test printStars()
		System.out.println(Lab5.printStars(3));
		
		//test expand()
		System.out.println(Lab5.expand(237,3));	
		
		//test getSeqStat()
		System.out.println(Lab5.getSeqStat(10,5,2));	
		
		//test seqInterleaving()
		System.out.println(Lab5.seqInterleaving(1,2,2,10,10,4));
		
		
		scan.close();
	}	
}
