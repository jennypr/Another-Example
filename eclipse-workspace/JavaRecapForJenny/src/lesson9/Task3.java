package lesson9;

public class Task3 {

	public static void main(String[] args) {
		
		for (int i = 1 ; i<=100; i++) {
			System.out.print(i+" ");
		}
		
		System.out.println();
		
		for(int i=100; i>=1; i--) {
			System.out.print(i+" ");
		}
		
		System.out.println();
		
		//1st way
		for(int i=20; i>=1; i-=2) {
			System.out.print(i+" ");
			
		}
		
		System.out.println();
		
		//2nd way
		for(int i=20; i>=1; i--) {
			if(i%2==0) {
				System.out.print(i+" ");
			}
		}
		
		System.out.println();
		//1st way
		for(int i=21; i<=50; i+=2) {
			System.out.print(i+" ");
			
		//2nd way
			
			
		}
		

	}

}
