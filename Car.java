
public class Car {
	
	String make = "BMW";
	String model = "Standard";
	String color = "black";
	int year = 2016;
	
	public String toString() {
		String myString = make + "\n" + model + "\n" + color + "\n" + year;
		
		return myString;
	}
	
	void drive() {
		System.out.println("You drive the car");
	}
	
	void brake() {
		System.out.println("You stop the car");
	}
	
	
	String name;
	Car(String name) {
		this.name = name;
	}
	

}
