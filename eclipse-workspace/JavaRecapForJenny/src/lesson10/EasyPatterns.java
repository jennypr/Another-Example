package lesson10;

public class EasyPatterns {

	public static void main(String[] args) {
		
		for (int i=0; i<5; i++)
		{
			System.out.print("*");
		}
		//insert a new line
		System.out.println();

		for (int i=0; i<4; i++)
		{
			System.out.print("*");
		}
		System.out.println();
		
		for (int i=0; i<3; i++)
		{
			System.out.print("*");
		}
		System.out.println();

		for (int i=0; i<2; i++)
		{
			System.out.print("*");
		}
		System.out.println();

		for (int i=0; i<1; i++)
		{
			System.out.print("*");
		}
		// Repeating code is always impractical in programming 
		//So we use nested loops in such cases
		System.out.println();
		
		for(int row =5; row>0 ; row--) //5,4,3,2,1
		{
			for(int col=0; col <row; col++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
