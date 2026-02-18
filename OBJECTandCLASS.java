
public class OBJECTandCLASS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// object-oriented programming involves programming using objects(stored i heap), 
		// which you can use to develop GUI and large-scale software systems.
		
		/* Object: An object has a unique identity, state, and behavior.
		 * 		The state of an object (also known as its properties or attributes) is represented by 
		 * 		data fields with their current values.
		 * 		Like the radius of a Circle object
		 * 
		 * 	The behavior of an object (also known as its actions) is defined by methods. 
		 * 	To invoke a method on an object is to ask the object to perform an action.
		 * 	Like define a method for the Circle object "getArea()"
		 */
		
		/* Class: Objects of the same type are defined using a common class.
		 * 		A class is a template, an object is an instance of a class.
		 * 		You can create many instances of a class. Creating an instance is referred to as instantiation.
		 * 		Object and instance are often interchangeable
		 * 		Relation of class and object like relation of apple pie recipe(class) and apple pies(objects)
		 */
		
		// Example ClassExampleCircle.java
		// It does not have a main(), so can't be run, only a definition for circle objects
		
		/* Constructor: a special type method of a class, known as constructors, 
		 * 				which are invoked to create a new object. 
		 * 		A constructor can perform any action, 
		 * 		but constructors are designed to perform initializing actions, 
		 * 		such as initializing the data fields of objects.
		 */
		
		// Unified Modeling Language(UML): or class diagram
		// UML.png and UMLexample.png
		
		// **************************************************************************
		// Defining classes for objects
		// Classes are definitions for objects and objects are created from classes.
		
		
		// Many ways to write classes
		// 1) separate these classes into different files  (recommended) eg.OBJECTandCLASS.java and ClassExampleCircle.java
		// 2) combine two classes into one file  eg. show here
		// 3) merge these classes into one  eg. ClassExampleCircle.java
		
		// ** You can put two classes "OBJECTandCLASS" and "ClassExampleCircle" into one file, 
		// **      Each class in the source code is compiled into a .class file.  "eachclasscompiledtoaclassfile.png"
		// ** only one class in the file can be a public class **
		// ** the public class must have the same name as the file name, which contains the main method **
		
		
		/* **A constructor is invoked to create an object using the new operator.**
		 * A constructor must have the same name as the class itself
		 * Constructors do not have a return type—not even void.
		 * Constructors are invoked using the new operator when an object is created.
		 * constructors can be overloaded
		 */
		
		// ** the new operator is used to create an object from the constructor eg, new ClassName(arguments);**
		// ** following three objects have different data but the same methods. **
		// ** accessed data and methods via the reference of the object **
		
		/* A class normally provides a  no-arg or no-argument constructor without arguments (e.g., ClassExampleCircle())
		 * default constructor: A class may be defined without constructors.
		 * 						a public no-arg constructor with an empty body is implicitly defined in the class.
		 * 						is provided automatically only if no constructors are explicitly defined in the class.
		 */
		// Create a circle with radius 1
		ClassExampleCircle circle1 = new ClassExampleCircle();
		System.out.println("The area of the circle of radius " + circle1.radius + " is " + circle1.getArea());

		// Create a circle with radius 25
		ClassExampleCircle circle2 = new ClassExampleCircle(25);
		System.out.println("The area of the circle of radius " + circle2.radius + " is " + circle2.getArea());

		// Create a circle with radius 125
		ClassExampleCircle circle3 = new ClassExampleCircle(125);
		System.out.println("The area of the circle of radius " + circle3.radius + " is " + circle3.getArea());

		// Modify circle radius
		circle2.radius = 100; // or circle2.setRadius(100)
		System.out.println("The area of the circle of radius " + circle2.radius + " is " + circle2.getArea());
		
		
		
		// **************************************************************************
		// demonstrate how to define classes and create objects
		// Many ways to write classes
		// 1) separate these classes into different files  (recommended) eg.OBJECTandCLASS.java and ClassExampleCircle.java
		// 2) combine two classes into one file  eg. show here
		// 3) merge these classes into one  eg. ClassExampleCircle.java
				
		// ** You can put two classes "OBJECTandCLASS" and "ClassExampleCircle" into one file, 
		// **      Each class in the source code is compiled into a .class file.  "eachclasscompiledtoaclassfile.png"
		// ** only one class in the file can be a public class **
		// ** the public class must have the same name as the file name, which contains the main method **
		
		// TV.png example
		
		
		
		// **************************************************************************
		// create objects using constructors
		/* **A constructor is invoked to create an object using the new operator.**
		 * A constructor must have the same name as the class itself
		 * Constructors do not have a return type—not even void.
		 * Constructors are invoked using the new operator when an object is created.
		 * constructors can be overloaded
		 */
		
		// ** the new operator is used to create an object from the constructor eg, new ClassName(arguments);**
		// ** following three objects have different data but the same methods. **
		// ** accessed data and methods via the reference of the object **
		
		/* A class normally provides a  no-arg or no-argument constructor without arguments (e.g., ClassExampleCircle())
		 * default constructor: A class may be defined without constructors.
		 * 						a public no-arg constructor with an empty body is implicitly defined in the class.
		 * 						is provided automatically only if no constructors are explicitly defined in the class.
		 */	
		
		
		
		
		
		// **************************************************************************
		// access objects via object reference variables
		/* An object’s data and methods can be accessed through the dot (.) operator via the object’s reference variable
		 * the object’s reference variables contain references to the objects
		 * ClassName objectRefVar;
		 */
		/* A class is essentially a programmer-defined type. 
		 * A class is a reference type, which means that a variable of the class type can reference an instance of the class
		 * 
		 */

		// declare
		ClassExampleCircle myCircle;
		// create an object and assigns its reference to myCircle
		myCircle = new ClassExampleCircle();

		/*
		 * Note
		 * Arrays are treated as objects in Java. Arrays are created using the new operator. 
		 * An array variable is actually a variable that contains a reference to an array
		 */

		
		
		
		// **************************************************************************
		//  access an object’s data and methods
		/* object member access operator (.)
		 * After an object is created, its data can be accessed and its methods can be invoked using the dot operator
		 * instance variable: objectRefVar.dataField references a data field in the object    
		 * 		eg, myCircle.radius;; radius is referred to as an instance variable
		 * instance method: objectRefVar.method(arguments) invokes a method on the object.  
		 * 		eg, calling object: myCircle.getArea();; getArea is referred to as an instance method 
		 */
		
		// anonymous object: an object does not need to be referenced later
		// you can create an object without explicitly assigning it to a variable
		System.out.println("Area is " + new ClassExampleCircle(5).getArea());
		
			
		
		// **************************************************************************
		//  define data fields of reference types and assign default values for an 	object’s data fields 
		// eg. ClassEcampleReferenceDataField.java
		
		
		
		
		
		
		// **************************************************************************
		// distinguish between object reference variables and primitive data type variables
		/* Every variable represents a memory location that holds a value.
		 * 
		 * primitive type variable: the value is of the primitive type.
		 * a reference type: the value is the reference to where an object is located.
		 * eg, PrimitiveandReference.png
		 */
		
		
		
		
		// **************************************************************************
		// use the Java library classes Date, Random, and Point2D 
			// eg, ClassExampleJavaLibrary.java
		
		
		
		
		// **************************************************************************
		// To distinguish between instance and static variables and methods .
		// A static/class variable is shared by all objects of the class, stores values for the variables in a common memory location. 
		// An instance member and call an instance method only through a reference to an instance.
		
		// A static method cannot access instance members of the class;
		// All instances of that class share the same copy of the class’s class variables.
		// 		access class variables either through an instance or through the class itself.
		 // eg, ClassExampleStaticandInstance.java
		
		/* Design tips:
		 * A variable or a method that is dependent on a specific instance of the class should be an instance variable or method
		 * A variable or a method that is not dependent on a specific instance of the class should be a static variable or method
		 */
		
		
		// **************************************************************************
		// To define private data fields with appropriate getter and setter methods
		// Visibility modifiers can be used to specify the visibility of a class and its members
		
		/* Packages can be used to organize classes.
		 * package packageName;
		 * If a class is defined without the package statement, it is said to be placed in the default package.
		 */
		
		// package-private or package-access: no visibility modifier is used
		// 		the classes, methods, and data fields are accessible by any class in the same package
		//      If a class is not defined as public, it can be accessed only within the same package.
		//      There is no restriction on accessing data fields and methods from inside the class. 
		
		
		// **********************************************************************
		/*
		 * modifier     class    package   subclass    world
		 * public       Y        Y         Y           Y
		 * protected    Y        Y         Y           N
		 * private      Y        N         N           N  // A private data field cannot be accessed by an object from outside the class
		 * no modifier  Y        Y         N           N
		 */
		
		/* The private modifier applies only to the members of a class. 
		 * The public modifier can apply to a class or members of a class
		 * 
		 * In most cases, the constructor should be public
		 * prohibit user from creating an instance of a class.
		 *  	For example, there is no reason to create an instance from the Math class, 
		 *  	because all of its data fields and methods are static. 
		 *  	To prevent the user from creating objects from the Math class, private Math(){ }
		 */
		
		// eg, package1, package2, A B C and Asub.java
		
		
		
		
		// **************************************************************************
		// To encapsulate data fields to make classes easy to maintain
		// Making data fields private protects data and makes the class easy to maintain
		// data field encapsulation: To prevent direct modifications of data fields declaring the data fields private
		// A private data field cannot be accessed by an object from outside the class 
		// What if the object needs to visit? Encapsulation: Getter() and Setter()
		
		// eg, ClassExamplePrivateDataFields.java
		
		
		// **************************************************************************
		// To develop methods with object arguments and differentiate between primitive-type arguments and object-type arguments
		// Passing an object to a method is to pass the reference of the object, pass-by-sharing.
		// passing an argument of a primitive data type, the value of the argument is passed, pass-by-value
		//		eg, n(5) passed to times, times is 5 now, if change to 6, times == 6, but n is till 5
		
		// eg, ClassExampleTestPassObject.java
		// **************************************************************************
		// To store and process objects in arrays
		// An array of objects is actually an array of reference variables
		// When an array of objects is created using "new", each element in the array is a reference variable with a default value of null.
		
		
		// eg, 
		ClassExamplePrivateDataFields[] circleArray = new ClassExamplePrivateDataFields[10];
		for (int i = 0; i < circleArray.length; i++) {
			 circleArray[i] = new ClassExamplePrivateDataFields();
			}
		//System.out.println(circleArray[0].name);
		CircleWithPrivateDataFields arg = new CircleWithPrivateDataFields();
		System.out.println(arg.i);
		circleArray[0].example(arg);
		System.out.println(arg.i);
		
		circleArray[0].example2(arg.i);
		
		
		// **************************************************************************
		// To create immutable objects from immutable classes to protect the contents of objects (String is immutable)
		// You can define immutable classes to create immutable objects. The contents of immutable objects cannot be changed. 
		// If a class is immutable, then all its data fields must be private and it cannot contain public setter methods for any data fields.
		// A class with all private data fields and no mutators is not necessarily immutable
		
		
		/* For a class to be immutable, it must meet the following requirements:
		 * ■ All data fields must be private.
		 * ■ There can’t be any mutator methods for data fields.
		 * ■ No accessory methods can return a reference to a data field that is mutable.
		 * 
		 */
		// eg, 
		
		// **************************************************************************
		// To determine the scope of variables in the context of a class
		// The scope of instance and static variables is the entire class, regardless of where the variables are declared.
		// exception: when a data field is initialized based on a reference to another data field, other data field must be declared first
		/* You can declare a class’s variable only once, 
		 * but you can declare the same variable name in a method many times in different nonnesting blocks.
		 * If a local variable has the same name as a class’s variable, the local variable takes precedence and the class’s variable with the same name is hidden. F
		 */
		
		// eg, 
		
		// **************************************************************************
		// To use the keyword this to refer to the calling object itself
		// The keyword this refers to the object itself
		// It can also be used inside a constructor to invoke another constructor of the same class.
		
		/* This keyword:
		 *  Using this to Reference Hidden Data Fields
		 *  Using this to Invoke a Constructor
		 */
		// eg, 
		
	}

}




