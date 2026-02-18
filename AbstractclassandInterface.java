import java.math.BigInteger;
import java.util.*; 
public class AbstractclassandInterface {

	public static void main(String[] args) {
		//A superclass defines common behavior for related subclasses. 
		
		/*
		 * An abstract class cannot be used to create objects. 
		 * An abstract class can contain abstract methods, which are implemented in concrete subclasses. 
		 * 
		 * subclasses                   superclasses(common featueres)
		 * -----------------------------------------
		 * specific and concrete      more general and less concrete
		 *                                   an abstract class:
		 *                            abstract enough and cannot be used to create any specific instance
		 *                                   abstract methods
		 *                      eg,. getArea() can not be implemented in GeometricObject class,
		 *                           since it depends on the specific type of geometric object
		 */
		
		
		/*
		 * Abstract classes are like regular classes, 
		 * but you cannot create instances of abstract classes using the new operator.
		 * 
		 * An abstract method is defined without implementation. 
		 * Its implementation is provided by the subclasses
		 * 
		 * A class that contains abstract methods must be defined as abstract. 
		 * 
		 * The constructor in the abstract class is defined as protected, 
		 * because it is used only by subclasses.
		 * When you create an instance of a concrete subclass, 
		 * its superclass’s constructor is invoked to initialize data fields defined in the superclass.
		 * 
		 */
		
		/*
		 * Why abstract Methods? TestAbstracttGeometricObject.java
		 */
		
		/* Notes:
		 *1) An abstract method cannot be contained in a nonabstract class. 
		 *  If a subclass of an abstract superclass does not implement all the abstract methods, 
		 *  the subclass must be defined as abstract. 
		 *  In other words, in a nonabstract subclass extended from an abstract class, 
		 *  all the abstract methods must be implemented. 
		 *2) Also note that abstract methods are nonstatic.
		 *3) An abstract class cannot be instantiated using the new operator, 
		 *	but you can still define its constructors, 
		 *	which are invoked in the constructors of its subclasses. 
		 *	For instance, the constructors of GeometricObject are invoked in the Circle class.
		 *4) A class that contains abstract methods must be abstract. 
		 *	However, it is possible to define an abstract class that doesn’t contain any abstract methods. 
		 *  In this case, you cannot create instances of the class using the new operator. 
		 *  This class is used as a base class for defining subclasses.
		 *5) A subclass can override a method from its superclass to define it as abstract. 
		 *  This is very unusual, but it is useful when the implementation of the method 
		 *  in the superclass becomes invalid in the subclass. 
		 *  In this case, the subclass must be defined as abstract.
		 *6) A subclass can be abstract even if its superclass is concrete. 
		 *	For example, the Object class is concrete, but its subclasses, 
		 *	such as GeometricObject, may be abstract.
		 *7) You cannot create an instance from an abstract class using the new operator, 
		 *	but an abstract class can be used as a data type. 
		 *	Therefore, the following statement, 
		 *	which creates an array whose elements are of the GeometricObject type, is correct.
		 *  GeometricObject[] objects = new GeometricObject[10];
		 *  objects[0] = new Circle();
		 */
		
		// the Abstract Number Class
		/* Number is an abstract superclass for numeric wrapper classes, BigInteger, and BigDecimal.
		 * LargestNumbers.java
		 */
		
		
		
		
		
		
		

		//An interface can be used to define common behavior for classes (including unrelated classes).
		/* An interface is a class-like construct that contains only constants and abstract methods. 
		 * It is used to provide total abstraction.
		 * 
		 * an interface is similar to an abstract class, 
		 * but its intent is to specify common behavior 
		 * for objects of related classes or unrelated classes
		 * 
		 * 1)An interface is treated like a special class in Java.
		 * 2)Each interface is compiled into a separate bytecode file, just like a regular class
		 * 3)You can use an interface more or less the same way you use an abstract class:
		 * 		use an interface as a data type for a reference, as the result of casting and so on
		 * 		cannot create an instance from an interface using the new operator.
		 *  4) all data fields are "public static final" and 
		 *  5) all methods are "public abstract" in an interface, 
		 *  	Java allows these modifiers to be omitted (interface_modifier_omit.png)
		 *  6) A class that implements an interface must 
		 *  	implement all the methods declared in the interface
		 * 	7) java does not support multiple inheritances in the case of class, 
		 * 		by using an interface it can achieve multiple inheritances.
		 *  8) Any class can extend only 1 class but can any class implement an infinite number of interface.
		 *  	interface_class_inheritance.png
		 *  9) Interfaces are used to implement abstraction
		 *  
		 *  
		 * Syntax:
		 * modifier interface InterfaceName {
		 * 			//Constant declarations 
		 * 			//Abstract method signatures }
		 * Example:
		 * public interface Edible {
		 * 				// Describe how to eat 
		 * 				public abstract String howToEat();
		 * }
		 * 
		 * You can use the Edible interface to specify whether an object is edible 
		 * by letting the class for the object implement this interface using the implements keyword
		 * Example(go deeper for this example: interface_edible.png): TestEdible.java
		 * 
		 * 
		 */
		
		
		// The Comparable interface
		/* The Comparable interface defines the compareTo method for comparing objects.
		 * 
		 * Why? 
		 * design a generic method to find the larger of two objects, the two objects must be comparable
		 * Java provides the Comparable interface for this purpose
		 * 
		 * // Interface for comparing objects, defined in java.lang
		 * package java.lang;
		 *                  // Comparable:generic interface
		 *                  // generic type E: replaced by concrete type when implementing this interface
		 * public interface Comparable<E> {
		 * 		public int compareTo(E o);
		 * }
		 * 
		 * Many classes in the Java library implement Comparable to define a natural order for objects
		 *classes Byte,Short,Integer,Long,Float,Double,Character,BigInteger,BigDecimal,Calendar,String,Date
		 * Example: interface_comparable_example.png
		 * 
		 */
		System.out.println(new Integer(3).compareTo(new Integer(5)));
		System.out.println("ABC".compareTo("ABE"));
		java.util.Date date1 = new java.util.Date(2013, 1, 1);
		java.util.Date date2 = new java.util.Date(2012, 1, 1);
		System.out.println(date1.compareTo(date2));
		
		/*
		 * all Comparable objects have the compareTo method, 
		 * the java.util.Arrays.sort(Object[]) method in the Java API 
		 * 			uses the compareTo method to compare and
		 * 			sorts the objects in an array, 
		 * 			provided that the objects are instances of the Comparable interface.
		 */
		String[] cities = {"Savannah", "Boston", "Atlanta", "Tampa"};
		java.util.Arrays.sort(cities);
		for (String city: cities)
			System.out.print(city + " ");
		System.out.println();

		BigInteger[] hugeNumbers = {new BigInteger("2323231092923992"),	
									new BigInteger("432232323239292"), 
									new BigInteger("54623239292")};
		java.util.Arrays.sort(hugeNumbers);
		for (BigInteger number: hugeNumbers)
			System.out.print(number + " ");

		// Example: SortRectangles.java, interface_comparableRectangle.png
		
		/* The Cloneable Interface: create a copy of an object
		 * The Cloneable interface specifies that an object can be cloned
		 * 
		 * package java.lang;
		 * public interface Cloneable {
		 * }
		 * 
		 * This interface is empty. 
		 * 
		 * marker interface: An interface with an empty body is referred to as a marker interface.
		 * 		A marker interface does not contain constants or methods.
		 * It is used to denote that a class possesses certain desirable properties
		 * 
		 * A class that implements the Cloneable interface is marked cloneable, 
		 * 		and its objects can be cloned using the clone()  method defined in the Object class
		 * 
		 * 
		 * (e.g., Date, Calendar, and ArrayList)
		 */
		
		Calendar calendar = new GregorianCalendar(2013, 2, 1);
		Calendar calendar1 = calendar;
		Calendar calendar2 = (Calendar)calendar.clone();
		System.out.println("calendar == calendar1 is " + (calendar == calendar1));  // t
		// calendar2 and calendar are different objects with the same contents. 
		System.out.println("calendar == calendar2 is " + (calendar == calendar2));  // f
		System.out.println("calendar.equals(calendar2) is " + calendar.equals(calendar2)); // t
		
		ArrayList<Double> list1 = new ArrayList<>();
		list1.add(1.5);
		list1.add(2.5);
		list1.add(3.5);   // [1.5, 2.5, 3.5]
		ArrayList<Double> list2 = (ArrayList<Double>)list1.clone();
		ArrayList<Double> list3 = list1;
		list2.add(4.5);
		list3.remove(1.5);
		System.out.println("list1 is " + list1); // [2.5, 3.5]
		System.out.println("list2 is " + list2); // [1.5, 2.5, 3.5, 4.5]
		System.out.println("list3 is " + list3); // [2.5, 3.5]
		
		// a class named House that implements Cloneable and Comparable
		// Interface_house.java
		
		
		/* Interfaces vs. Abstract Classes
		 * A class can implement multiple interfaces, but it can only extend one superclass
		 * interfaces can actually inherit from multiple interfaces
		 */
		/**
		 Final Variables: 
		 	Variables declared in a Java interface are by default final. 
		 	An abstract class can contain non-final variables.
		 Type of variables: 
		 	Abstract class can have final, non-final, static and non-static variables. 
		 	The interface has only static and final variables.
		Implementation: 
			Abstract class can provide the implementation of the interface. 
			Interface can’t provide the implementation of an abstract class.
		Inheritance vs Abstraction:
		 A Java interface can be implemented using the keyword “implements” and 
		 an abstract class can be extended using the keyword “extends”.
		Multiple implementations: 
			An interface can extend one or more Java interfaces; 
			an abstract class can extend another Java class and implement multiple Java interfaces.
		Multiple Inheritance:  
			Multiple inheritance can be partially achieved by the use of interfaces, 
			
			whereas the same can’t be done by the use of abstract classes. 
			Because in Java, one class can implement multiple Interfaces, 
			but one class cannot extend from multiple other classes 
			because that’s just not possible in java as that would lead to the diamond problem. 
			
		Accessibility of Data Members: 
			Members(variables) of a Java interface are final by default. 
			A Java abstract class can have class members like private, protected, etc.
		Constructors:
			 classes Constructors are invoked by subclasses through constructor chaining. 
			 An abstract class cannot be instantiated using the new operator.
			 
			 interface No constructors. An interface cannot be instantiated using the new operator.
		Methods:
			 classes No restrictions. 
			 interface All methods must be public abstract instance methods
		Roots:
			 All classes share a single root, the Object class, 
			 but there is no single root for interfaces. 
		Type:
			 Like a class, an interface also defines a type.
			 A variable of an interface type can reference any instance of the class that 
			 		implements the interface. 
			 If a class implements an interface, the interface is like a superclass for the class. 
		Names:
			 Class names are nouns. Interface names may be adjectives or nouns.
			 
			 
		
		// A class implementing NewInterface must implement the abstract methods defined in interfaces
		public class NewClass extends BaseClass
			implements Interface1, ..., InterfaceN {
 				...
		}
		
		// An interface can extend other interfaces but not classes
		public interface NewInterface extends Interface1, ... , InterfaceN {
			// constants and abstract methods
		}
		 */
		
		/** Case study: The Rational Class 
		 * A rational number: a/b (e a is the numerator and  b the denominator)
		 * Number is the root class for numeric wrapper classes, it is appropriate Rational as a subclass of Number.
		 * the Rational class implements the Comparable interface: rational_number_UML.png
		 * 
		 */
		
		/**
		 * Class Design Guidelines
		 * 
		 * 1. Cohesion: 
		 * 	1) A class should describe a single entity, and all the class operations should logically 
		 * 		fit together to support a coherent purpose. eg,. student and stuff
		 * 	2) A single entity with many responsibilities can be broken into several classes 
		 * 		to separate the responsibilities. eg,. String, StringBuilder, StringBuffer
		 * 2. Consistency: Follow standard Java programming style and naming conventions. 
		 * 	1) Choose informative names for classes, data fields, and methods
		 * 	2) place the data declaration before the constructor and place constructors before methods.
		 * 	3)  consistently provide a public no-arg constructor, if no doc the reason
		 * 		if no explicitly constructors, a public default no-arg constructor with an empty body is assumed
		 * 		prevent users from creating an object for a class, declare a private constructor
		 * 3. Encapsulation: private modifier to hide its data, getter and setter to make it available
		 * 4. Clarity: 1-3 are good guidelines for achieving design clarity; 
		 * 			   Additionally, a class should have a clear contract that is easy to explain and easy to understand.
		 * 		
		 * 		should design a class that imposes no restrictions on how or when the user can use it
		 * 		example: Loan class(loanAmount, numberOfYears, annualInterestRate:  values of these properties can be set in any order)
		 * 
		 * 		Methods should be defined intuitively without causing confusion.
		 * 		example: substring(int beginIndex, int endIndex) method in the String class is somewhat confusing,
		 * 				The method returns a substring from beginIndex to endIndex – 1, rather than to endIndex
		 * 		
		 * 		should not declare a data field that can be derived from other data fields
		 * 		example: birthDate and age
		 * 5. Completeness: a class should provide a variety of ways for customization through properties and methods
		 * 		in order to be useful in a wide range of applications.
		 * 6. Instance vs. Static: example numberOfObjects and getNumberOfObjects() need to be static
		 * 		Always reference static variables and methods from a class name to improve readability and avoid errors
		 * 		Do not pass a parameter from a constructor to initialize a static data field, use setter(static_data_init.png)
		 * 		A constructor is always instance, because it is used to create a specific instance.
		 * 		A static variable or method can be invoked from an instance method, opposite not.
		 * 7. Inheritance vs. Aggregation: 
		 * The difference between inheritance and aggregation is the difference between an is-a and a has-a relationship.
		 * Example:  an apple is a fruit -> use inheritance
		 * 			 A person has a name -> use aggregation(Chapter 10)
		 * 8. Interfaces vs. Abstract Classes
		 * 
		 * 
		 */
	}
		 

}

