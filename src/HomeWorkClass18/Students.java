package HomeWorkClass18;

public class Students {
	
	/*Create a Class called Students 
	▪ Create three variables studentName, studentID and numberOfStudents (should be a static variable)
	▪ Create three objects of the Students Class
	▪ Set the value for studentName, studentID and increment
	the numberOfStudents for each object
	▪ Print out total the number of students */
	
	String studentName;
	int studentID;
	static int numberOfStudents =0;
	
	public static void main(String[] args) {
		
		Students stu1=new Students();
		stu1.studentName="Jenny";
		stu1.studentID=2;
		numberOfStudents ++;
		
		Students stu2=new Students ();
		stu2.studentName="Maria";
		stu2.studentID=4;
		Students.numberOfStudents ++;
		
		Students stu3=new Students();
		stu3.studentName="Christo";
		stu3.studentID=6;
		numberOfStudents++;
		
		System.out.println("Total number of the students is: "+ numberOfStudents++);
		
		
		//Side note:
		 //Can we create an array of type Students?Yes!
		
		Students[] st=new Students[3];
		
		//What are we missing?
		//Object instantiation
		
		st[0]=new Students();
		st[0].studentName="Ahmet";
		st[0].studentID=5;
		
		st[1]=new Students();
		st[1].studentName="May";
		st[1].studentID=7;
		
		st[2]=new Students();
		st[2].studentName="Jenny";
		st[2].studentID=2;
		
		for(int i=0; i<st.length; i++) 
		{
			
			System.out.println("Student name: "+st[i].studentName+" Student ID: "+st[i].studentID);
		}
		
		
		
		
		
		
		
	}

}
