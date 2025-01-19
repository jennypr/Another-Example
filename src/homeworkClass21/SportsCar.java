package homeworkClass21;

public class SportsCar extends Car {
	
	String engine;
	int maxSpeed;
	boolean fuelEfficency;
	
	public void SportsCarFeautures() {
		System.out.println("See Sports car feautures below");
		System.out.println("Max speed: "+maxSpeed+"\nengine: "+engine+"\nIs it fuel efficient? "+fuelEfficency);
	}

}
