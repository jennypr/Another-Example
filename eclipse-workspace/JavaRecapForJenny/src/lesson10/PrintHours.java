package lesson10;

public class PrintHours {

	public static void main(String[] args) {
		// print the whole combination of hours in a digital clock
		
		//00:01
		//00:02
		//..
		//01:00
		//..
		//12:00
		//..
		//23.59
		
		for(int hour=0; hour<24; hour++) 
		{
			for(int min=0; min <60; min++) {
				//System.out.println(hour+":"+min);
			if(hour<10 && min <10) {
				System.out.println("0"+hour+":0"+min);
			}
			else if(hour<10 && min>=10) {
				System.out.println("0"+hour+":"+min);
				
			}
			else if(hour>10 && min<10) {
				System.out.println(hour+":0"+min);
			}
			
			}
		}
		
	}

}
