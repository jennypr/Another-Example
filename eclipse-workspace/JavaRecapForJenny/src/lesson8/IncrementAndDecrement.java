package lesson8;

public class IncrementAndDecrement {

	public static void main(String[] args) {
		
		int x=5;
		
		x= x+1; // update the value of x by adding 1 to it
		System.out.println(x);
		x+=1 ;// short hand operation
		System.out.println(x);
		
		//post-increment
		x++; //post-increment process
		System.out.println(x);
		
		//let's check decrement
		int y=10;
		System.out.println(y);
		System.out.println(y--);
		System.out.println(y);
		
		int z=10;
		int w=z++ ; // The order (1) take the value of (z=10 and assign to w
		            //           (2) After that increment z by one
		
		System.out.println(z);
		System.out.println(w);

		int var1=5;
		int var2;
		
		System.out.println(var1);
		
		var2= var1--;
		//This is equivalent to the following:
		//1.var2=var1
		//2.var1=var1 - 1;
		
		System.out.println(var1);
		System.out.println(var2);
		
		

	}

}
