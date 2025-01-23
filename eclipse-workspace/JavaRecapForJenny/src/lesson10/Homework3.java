package lesson10;

public class Homework3 {

	public static void main(String[] args) {
		// 3. Print numbers from 1 to 50 except those that are divisible by 3.
		
		int num=1;
		while(num<=50) 
		{   
			//update step
			if (num%3==0)
			{
				num++; //update step
				continue;
			}
			
			else {
				System.out.println(num+ " ");
				num++;
			}
		}

	}

}
