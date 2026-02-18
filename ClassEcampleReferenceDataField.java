
public class ClassEcampleReferenceDataField {
	public static void main(String[] args) {
		//  displays the default values of the data fields for a Student object
		Student student = new Student();
		System.out.println("name? " + student.name);
		System.out.println("age? " + student.age);
		System.out.println("isScienceMajor? " + student.isScienceMajor);
		System.out.println("gender? " + student.gender);
		
		// ** Java assigns no default value to 	a local variable inside a method. **
		// The following code has a compile error, because the local variables x and y are not initialized:
		/*
		int x; // x has no default value
		String y; // y has no default value
		System.out.println("x is " + x);
		System.out.println("y is " + y);
		*/
		
		/* Caution
		 * NullPointerException is a common runtime error. 
		 * It occurs when you invoke a method on a reference variable with a null value. 
		 * Make sure you assign an object reference to the variable before invoking the method through the reference variable
		 * 
		 */
		
		// from previous class
		/*
		// **************************************************************************************
		// In Java, the keyword null is a special value that means \no object".
		String name = null;
		int[] combo = null;
		
		// If you try to use a variable that is null by invoking a method or accessing an element, 
		// Java throws a NullPointerException:
		
		System.out.println(name.length()); // NullPointerException
		System.out.println(combo[0]); // NullPointerException
		
		// On the other hand, it is perfectly one to pass a null reference as an argument to a method, 
		// or to receive one as a return value. In these situations, null is often used to represent a special condition or indicate an error.
		*/
	}
}


class Student {
	/* The data fields of a class can be of reference types. eg, String
	 * If a data field of a reference type does not reference any object, the data field holds a special Java value, null.
	 * 
	 * null is a literal for a reference type. 
	 */
	// 
	String name; // name has the default value null
	int age; // age has the default value 0
	boolean isScienceMajor; // isScienceMajor has default value false
	char gender; // gender has default value '\u0000'
}