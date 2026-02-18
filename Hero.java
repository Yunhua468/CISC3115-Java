
public class Hero extends Person{   // inheritance Person class
	String power;
	Hero(String name, int age, String power) {
		super(name, age);   // super keyword refers to the super (parent) class Person

		this.power = power;
		
	}
	
	public String toString() {
		return super.toString() + this.power;
		
	}
}
