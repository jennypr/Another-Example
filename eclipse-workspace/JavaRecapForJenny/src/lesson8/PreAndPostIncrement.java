package lesson8;

public class PreAndPostIncrement {
public static void main(String[] args) {
	
	//++ increment ->add one to the variable
	//-- decrement->subtract one from the variable
	
	int x;
	int y=20;
	
	x=y++;
	System.out.println(x);
	System.out.println(y);
	
    int a;
    int b=20;
    
    a=++b;
    
    System.out.println(a);
    System.out.println(b);
    
    int c;
    int d=5;
    
    System.out.println(--d);
    //1.decrement-->d-1
    //2.do the operation-->display
    
    //at this point d=4
    c=--d; 
    System.out.println(c);
    System.out.println(d);
    
	
}
}
