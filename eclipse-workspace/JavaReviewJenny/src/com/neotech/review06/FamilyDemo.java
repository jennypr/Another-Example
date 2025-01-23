package com.neotech.review06;

public class FamilyDemo {

	public static void main(String[] args) {
		
		
		FamilyMember.lastName="Messi";
		
		FamilyMember.printFamilyName();
		
		System.out.println("-------");
		
		FamilyMember member1=new FamilyMember();
		member1.firstName="Lionel";
		member1.age=36;
		
		FamilyMember member2=new FamilyMember();
		member2.firstName="Antonella";
		member2.age=35;
		
		member1.printFullName();
		member2.printFullName();
		
		
		FamilyMember baby=new FamilyMember();
		baby.printFullName();
		

	}

}
