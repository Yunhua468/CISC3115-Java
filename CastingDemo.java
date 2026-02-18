// Casting Object: One object reference can be typecast into another object reference.
// implicit casting: Object o = new Student(); an instance of Student is an instance of Object
/* Object o = new Student(); // Implicit casting
	m(o);
 * Student b = o;  cause error
 * Student b = (Student)o; // Explicit casting
 */
// explicit casting: clearly tell compiler that o is a Student object

/*
 * upcasting: It is always possible to cast an instance of a subclass to a variable of a superclass, 
 * because an instance of a subclass is always an instance of its superclass.
 * 
 * downcasting: casting an instance of a superclass to a variable of its subclass.
 * 		must explicit casting
 * 		you must make sure that the object to be cast is an instance of the subclass
 * 
 * ClassCastException: If the superclass object is not an instance of the subclass
 * 
 * instanceof operator:to ensure that the object is an instance of another object before attempting a casting.
 */
 // Object myObject = new Circle();
  // Some lines of code
  // Perform casting if myObject is an instance of Circle */
	//if (myObject instanceof Circle) {
	// System.out.println("The circle diameter is "+((Circle)myObject).getDiameter());
	// ...
	//}
 
/*
 * You may be wondering why casting is necessary. The variable myObject is declared Object. 
The declared type decides which method to match at compile time. 
Using myObject.getDiameter() would cause a compile error, because the Object class does not have the getDiameter method. 
The compiler cannot find a match for myObject.getDiameter(). 
Therefore, it is necessary to cast myObject into the Circle type to tell the compiler that myObject is also an instance of Circle.

Why not define myObject as a Circle type in the first place? 
To enable generic programming, it is a good practice to define a variable with a supertype, which can accept an object
of any subtype.
 */
public class CastingDemo {
	/** Main method */
	public static void main(String[] args) {
		// Create and initialize two objects
		Object object1 = new CircleFromSimpleGeometricObject(1);
		Object object2 = new RectangleFromSimpleGeometricObject(1, 1);
		
		// Display circle and rectangle
		displayObject(object1);
		displayObject(object2);
	}

	/** A method for displaying an object */
	public static void displayObject(Object object) {
		if (object instanceof CircleFromSimpleGeometricObject) {
			System.out.println("The circle area is "+((CircleFromSimpleGeometricObject)object).getArea());
			System.out.println("The circle diameter is "+((CircleFromSimpleGeometricObject)object).getDiameter());
		}
		else if (object instanceof RectangleFromSimpleGeometricObject) {
			System.out.println("The rectangle area is "+((RectangleFromSimpleGeometricObject)object).getArea());
		}
	}
}
