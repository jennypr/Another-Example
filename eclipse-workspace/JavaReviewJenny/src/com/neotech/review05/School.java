package com.neotech.review05;

public class School {

	public static void main(String[] args) {
		
		Student s1=new Student();
		
		s1.name="Jenny";
		s1.studentNr=2;
		s1.gradeLevel=4;
		
		s1.study();
		s1.sleep();
		
		Student s2=new Student();
		
		s2.name="Fiton";
		s2.studentNr=4;
		s2.gradeLevel=4;
		
		s2.study();
		s2.sleep();
		
		Teacher t1= new Teacher();
		t1.name="Elion";
		t1.salary=200000;
		t1.subject="Java";
		
		t1.teach();
		t1.yellAtStudents();
		
		

	}

}
