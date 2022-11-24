package console_apps;

import model.Member;

public class MemberApp1 {

	public static void main(String[] args) {
		System.out.println("Before Creating two members...");
		Member member1 = new Member(); //default constructor
		System.out.println("After Creating member 1...");
		Member member2 = new Member();
		System.out.println("After Creating member 2...");
		System.out.println("Member 1 and Member 2 are the same objects: " + (member1 == member2));
		System.out.println("Member 1 and Member 2 are the distinct objects: " + (member1 != member2));

	}

}
