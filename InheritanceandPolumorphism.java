
public class InheritanceandPolumorphism {
	public static void main(String[] args) {
		// inheritance: Object-oriented programming allows you to define new classes from existing classes
		/* Inheritance enables you to define a general class (i.e., a superclass) 
		 * and later extend it to more specialized classes (i.e., subclasses).
		 * 
		 * superclass/parent class/bass class
		 * subclass/child class/extended class/derived class
		 * public class subclass extends superclass
		 */
		
		CircleFromSimpleGeometricObject circle = new CircleFromSimpleGeometricObject(1);
		System.out.println("A circle " + circle.toString());
		System.out.println("The color is " + circle.getColor());
		System.out.println("The radius is " + circle.getRadius());
		System.out.println("The area is " + circle.getArea());
		System.out.println("The diameter is " + circle.getDiameter());
		
		RectangleFromSimpleGeometricObject rectangle = 	new RectangleFromSimpleGeometricObject(2, 4);
		System.out.println("\nA rectangle " + rectangle.toString());
		System.out.println("The area is " + rectangle.getArea());
		System.out.println("The perimeter is " +
		rectangle.getPerimeter());
		
		/* a subclass usually contains more information and methods than its superclass
		 * Private data fields in a superclass are not accessible outside the class
		 * Not all is-a relationships should be modeled using inheritance.
		 * Inheritance is used to model the is-a relationship. 
		 * Do not blindly extend a class just for the sake of reusing methods. 
		 * A Java class may inherit directly from only one superclass. This restriction is known as single inheritance. 
		 * If you use the extends keyword to define a subclass, it allows only one parent class.
		 */
		
		
		
		
		
		
		// calling Super class constructor
		// super: The keyword super refers to the superclass and can be used to invoke the superclass’s methods and constructors.
		// the keyword this to reference the calling object
		
		
		//  super refers to the superclass of the class in which super appears.
		// To call a superclass constructor; To call a superclass method.
		
		/* A constructor is used to construct an instance of a class.
		 * Unlike properties and methods, the constructors of a superclass are not inherited by a subclass. 
		 * They can only be invoked from the constructors of the subclasses using the keyword super.
		 * super(), or super(parameters);
		 */
		
		/*
		 * The statement super() or super(arguments) must be the first statement of the subclass’s constructor; 
			this is the only way to explicitly invoke a superclass constructor. 
		 */
		
		/*
		 * constructor chaining
		 * A constructor may invoke an overloaded constructor or its superclass constructor. 
		 * If neither is invoked explicitly, the compiler automatically puts super() as the first statement in the constructor.
		 */
		
		
		
		// calling superclass methods
		/*
		 * super.method(parameters);
		 * 
		 * 
		 */
		
		
		// overriding(same signature+ return type): in different classes related by inheritance
		// overloading(same name + diff parameters)
		/*
		 * Overloading means to define multiple methods with the same name but different signatures. 
		 * Overriding means to provide a new implementation for a method in the subclass
		 */
		
		/*
		 * To override a method, 
		 * the method must be defined in the subclass 
		 * using the same signature and the same return type as in its superclass.
		 */
		
		/*
		 * An instance method can be overridden only if it is accessible.
		 * Thus a private method cannot be overridden, because it is not accessible outside its own class. If a method defined in a subclass is private in its superclass, the two methods are completely unrelated.
		 */
		
		/*
		 * Like an instance method, a static method can be inherited.
		 * a static method cannot be overridden. 
		 * If a static method defined in the superclass is redefined in a subclass, the method defined in the superclass is hidden. 
		 * The hidden static methods can be invoked using the syntax SuperClassName.staticMethodName.
		 */
		
		// override annotation: @Override
		
		
		
		/* Every class in Java is descended from the java.lang.Object class.
		 * loan.toString() ->  Loan@15037e5
		 */

		/* Methods in java.lang.Object
		 * equals()
		 * toString()
		 * @Override
		 */
		
		
		/* The Object Class and its toString() Method
		 * Every class in Java is descended from the java.lang.Object class.
		 * If no inheritance is specified when a class is defined, the superclass of the class is Object
		 * eg,. Classes such as String, Loan, and GeometricObject are subclasses of Object
		 */
		
		/*
		 * toString() in Object class: public String toString();
		 * Invoking toString() on an object returns a string that describes the object.
		 * 
		 * returns classname@ object’s memory address
		 * Usually you should override the toString method so that 
		 * it returns a descriptive string representation of the object.
		 */
		
		
		
		
		
		
		/* Class visibility
		 * Your class can be used in two ways: 
		 * (1) for creating instances of the class  
		 * (2) for defining subclasses by extending the class. 
		 * Make the members private if they are not intended for use from outside the class. 
		 * Make the members public if they are intended for the users of the class. 
		 * Make the fields or methods protected if they are intended for the extenders of the class but not for the users of the class.
		 * 
		 */
		
		
		
		/* Preventing Etenting and Overriding: final modifier
		 * use final: indicate that a class is final and cannot be a parent class
		 * A final data field is a constant: Neither a final class nor a final method can be extended.
		 * 
		 * example final class
		 * public final class A {
		 * 		Data fields, constructors, and methods omitted
		 * }
		 * 
		 * define a method to be final:  cannot be overridden by its subclasses
		 * example
		 * public final void m() {
		 * 		Do something
		 * }
		 * 
		 * 
		 * 
		 * The modifiers public, protected, private, static, abstract, and final 
		 * are used on classes and class members (data and methods), 
		 * except that the final modifier can also be used on local variables in a method. 
		 * A final local variable is a constant inside a method.
		 */
		
		
		
		// CircleFromSimpleGeometricObject[] test = {new CircleFromSimpleGeometricObject(1),
		//											 new CircleFromSimpleGeometricObject(2)};
		// the size is fixed;
		/* ArrayList class: import java.util.ArrayList, for storing objects, unlimited member;
		 * An ArrayList object can be used to store a list of objects. 
		 * 
		 * ArrayList<AConcreteType> list = new ArrayList<AConcreteType>();
		 * type inference: The compiler is able to infer the type from the variable declaration
		 * ArrayList<AConcreteType> list = new ArrayList<>();
		 * examples:
		 * ArrayList<String> cities = new ArrayList<String>();
		 * ArrayList<java.util.Date> dates = new ArrayList<java.util.Date> ();
		 */
		
		/* sort an array using java.util.Arrays.sort(array)
		 * sort an array list, use the java.util.Collections.sort(arraylist)
		 * 
		 * the elements stored in an ArrayList must be of an object type
		 *ArrayList<int> list = new ArrayList<>();
		 *ArrayList<Integer> list = new ArrayList<>();
		 *
		 *traverse the elements
		 *for (elementType element: arrayList) {
		 *		work
		 *}
		 */
		
		/* Java provides the methods for creating a list from an array, 
		 * for sorting a list, 
		 * finding maximum and minimum element in a list,
		 * for shuffling a list.
		 * 
		 * Often you need to create an array list from an array of objects or vice versa. 
		 * You can write the code using a loop to accomplish this, 
		 * but an easy way is to use the methods in the Java API.
		 * 
		 * an example to create an array list from an array:
		 * import java.util.Arrays;
		 * String[] array = {"red", "green", "blue"}; 
		 * ArrayList<String> list = new ArrayList<>(Arrays.asList(array));
		 * 
		 * Conversely, you can use the following code to create an array of objects from an array list.
		 * String[] array1 = new String[list.size()];
		 * list.toArray(array1); copies the contents from list to array1.
		 * 
		 * 
		 * use static method sort() in java.util.Collections class
		 * If the elements in a list are comparable such as integers, double, or strings
		 * 
		 * example:
		 * Integer[] array = {3, 5, 95, 4, 15, 34, 3, 6, 5}; 
		 * ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array)); 
		 * java.util.Collections.sort(list); 
		 * System.out.println(list);
		 * 
		 * 
		 * max and min in the java.util.Collections
		 * example:
		 * Integer[] array = {3, 5, 95, 4, 15, 34, 3, 6, 5};
		 * ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
		 * System.out.println(java.util.Collections.max(list));
		 * System.out.println(java.util.Collections.min(list));
		 * 
		 * shuffle
		 * Integer[] array = {3, 5, 95, 4, 15, 34, 3, 6, 5};
		 * ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
		 * java.util.Collections.shuffle(list);
		 * System.out.println(list);
		 * 
		 */
		
	}
}





