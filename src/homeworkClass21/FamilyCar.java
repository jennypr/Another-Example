package homeworkClass21;

public class FamilyCar extends Car {

	String airbags;
	int seats;
	boolean safe;
	
	public void familyCarfeatures() {
		System.out.println("See family car features below: ");
		System.out.println("Airbags; "+ airbags +"\nseats: "+seats);
		System.out.println("Is the car safe? "+safe);
	}

}
