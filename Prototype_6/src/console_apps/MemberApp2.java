package console_apps;

import model.Member;

public class MemberApp2 {

	public static void main(String[] args) {
		System.out.println("Before Creating two members...");
		Member suyeon = new Member(12345, 's', 100.0); //customized constructor
		System.out.println("After Creating member 1...");
		Member yuna = new Member(23867, 'b', 200.0 );
		System.out.println("After Creating member 2...");
		System.out.println("Member 1 and Member 2 are the same objects: " + (suyeon == yuna));
		System.out.println("Member 1 and Member 2 are the distinct objects: " + (suyeon != yuna));
		
		Member jihye = new Member("Jihye", 123589, 'g', 300.0);

	}

}
