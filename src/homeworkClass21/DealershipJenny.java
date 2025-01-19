package homeworkClass21;

public class DealershipJenny {

	public static void main(String[] args) {
		
		FamilyCar car1=new FamilyCar();
		car1.brand="Toyota";
		car1.model="Highlander";
		car1.make=2024;
		car1.color="White";
		car1.transmission="Automatic";
		car1.airbags="Front,side and rear";
		car1.seats=6;
		car1.safe=true;
		
		car1.features();
		car1.familyCarfeatures();
		
		System.out.println("--------");
		
		SportsCar car2=new SportsCar();
		car2.brand="Maserati";
		car2.model="Gran Turismo";
		car2.make=2020;
		car2.color="Black";
		car2.transmission="Manual";
		car2.engine="V6";
		car2.maxSpeed=303;
		car2.fuelEfficency=false;
		
		car2.features();
		car2.SportsCarFeautures();
		
		System.out.println("-----------");
		
		
		LuxuriusCar car3=new LuxuriusCar();
		car3.brand="Mercedes-Maybach";
		car3.model="Sedan";
		car3.make=2025;
		car3.color="Gold and Black";
		car3.transmission="Automatic";
		car3.engine="Bi-turbo V8";
		car3.maxSpeed=250;
		car3.fuelEfficency=false;
		car3.champagneChiller="Yes";
		car3.heatedCupholders="Yes";
		car3.mullinerHamper="Yes";
		car3.panel="Wood";
		car3.interior="Leather";
		
		car3.SportsCarFeautures();
		car3.luxuriusCarFeatures();
		
		
		

	}

}
