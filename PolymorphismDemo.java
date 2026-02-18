
// 3 pillars of OOP
// encapsulation, inheritance, Polymorphism
		

// Polymorphism
// means that a variable of a supertype can refer to a subtype object.

/*
 * inheritance relationship enables a subclass to inherit features 
 * 		from its superclass with additional new features.
 * A subclass is a specialization of its superclass; 
 * every instance of a subclass is also an instance of its superclass, but not vice versa.
 *  
 */

/* subtype and supertype
 * A class defines a type
 * A type defined by a subclass is called a subtype
 * A type defined by its superclass is called supertype
 * 
 * example:  you can say that Circle is a subtype of GeometricObject 
 * 			 and GeometricObject is a supertype for Circle.
 * 
 *  * you can always pass an instance of a subclass to a parameter of its superclass type
 * An object of a subclass can be used wherever its superclass object is used. 
 * means that a variable of a supertype can refer to a subtype object
 */
		
public class PolymorphismDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//  passing any instance of GeometricObject
		displayObject(new CircleFromSimpleGeometricObject (1, "red", false));
		displayObject(new RectangleFromSimpleGeometricObject(1, 1, "black", true));
	}
	
	/** Display geometric object properties:  takes a parameter of the GeometricObject type */
	public static void displayObject(SimpleGeometricObject object) {
		System.out.println("Created on "+object.getDateCreated()+". Color is "+object.getColor());
	}
}
