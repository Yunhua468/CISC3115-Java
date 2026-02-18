
public class Dog extends Animal{  // inheritance anything that the Animal class has
	
	@Override   // let other developers know this is overriding, not must but good to put
	void speak() {
		System.out.println("Dog barks");   // method overriding from parent class Animal
	}
}
