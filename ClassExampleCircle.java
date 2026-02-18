
public class ClassExampleCircle {
	/** data field */
	double radius = 1;
	
	/* **A constructor is invoked to create an object using the new operator.**
	 * A constructor must have the same name as  its defining class itself
	 * Constructors do not have a return type—not even void.
	 * Constructors are invoked using the new operator when an object is created.
	 * constructors can be overloaded
	 */
	/* Constructor: Construct a circle object with radius 1*/
	ClassExampleCircle() {
		radius = 1;
	}
	
	/* Constructor: Construct a circle object with a specified radius*/
	ClassExampleCircle(double newRadius) {
		radius = newRadius;
	}
	
	/*
	// This is a method, not a constructor. 
	public void ClassExampleCircle() {
	}
	*/
	
	// Following are methods
	/** Return the area of this circle */
	double getArea() {
		return radius * radius * Math.PI;
	}
	/** Return the perimeter of this circle */
	double getPerimeter() {
		return 2 * radius * Math.PI;
	}
	/** Set new radius for this circle */
	double setRadius(double newRadius) {
		radius = newRadius;
		return radius;
	}
}
