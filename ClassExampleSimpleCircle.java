public class ClassExampleSimpleCircle {
	// Since the combined class has a main method, it can be executed by the Java interpreter.
	// you can test a class by 	simply adding a main method in the same class
	
	
	/** Main method */
	public static void main(String[] args) {
		// Create a circle with radius 1
		ClassExampleSimpleCircle circle1 = new ClassExampleSimpleCircle();
		System.out.println("The area of the circle of radius "+ circle1.radius + " is " + circle1.getArea());

		// Create a circle with radius 25
			ClassExampleSimpleCircle circle2 = new ClassExampleSimpleCircle(25);
				System.out.println("The area of the circle of radius "+ circle2.radius + " is " + circle2.getArea());

		// Create a circle with radius 125
		ClassExampleSimpleCircle circle3 = new ClassExampleSimpleCircle(125);
		System.out.println("The area of the circle of radius "+ circle3.radius + " is " + circle3.getArea());

		// Modify circle radius
		circle2.radius = 100;
		System.out.println("The area of the circle of radius "+ circle2.radius + " is " + circle2.getArea());
	}

	double radius;

	/** Construct a circle with radius 1 */
	ClassExampleSimpleCircle() {
		radius = 1;
	}

	/** Construct a circle with a specified radius */
	ClassExampleSimpleCircle(double newRadius) {
		radius = newRadius;
	}

	/** Return the area of this circle */
	double getArea() {
		return radius * radius * Math.PI;
	}

	/** Return the perimeter of this circle */
	double getPerimeter() {
		return 2 * radius * Math.PI;
	}

	/** Set a new radius for this circle */
	void setRadius(double newRadius) {
		radius = newRadius;
	}
}




