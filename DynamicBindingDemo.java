// A method can be implemented in several classes along the inheritance chain. 
// The JVM decides which method is invoked at runtime.
public class DynamicBindingDemo {

	public static void main(String[] args) {
		// Which toString() method is invoked by o? 
		// o’s declared type is Object.
		// The instance may be created using the constructor of the declared type or its subtype, here subtype
		// actual type of the variable is the actual class for the object referenced by the variable. 
		// Here o’s actual type is GeometricObject, b
		Object o = new SimpleGeometricObject();  
		// toString() method is invoked by o is determined by o’s actual type. This is known as dynamic binding.
		System.out.println(o.toString());
		
		/*
		 * declared type and actual type
		 * 
		 *  variable’s declared type: A variable must be declared a type, the variable is called ...
		 *  
		 * A variable of a reference type can hold a null value 
		 * 		or a reference to an instance of the declared type. 
		 * 		The instance may be created using the constructor of the declared type or its subtype.
		 * 
		 * actual type: of the variable is the actual class for the object referenced by the variable. 

		 */
		
		
		/* Dynamic binding: method is invoked by the variable's actual type
		 * 
		 */
		
		m(new GraduateStudent());
		m(new Student());
		m(new Person());
		m(new Object());
		/*
		 * Matching a method signature and binding a method implementation are two separate issues.
		 * compile time: matching a method signature, decided by declared type of the reference
		 * 		 declared type of the reference variable decides which method to match at compile time. 
		 *		 The compiler finds a matching method according to the parameter type, number of parameters, and order of the parameters at compile time. 
		 * run time: binding a method implementation, decided by the actual type of the variable
		 * 		A method may be implemented in several classes along the inheritance chain. 
		 * 		The JVM dynamically binds the implementation of the method at runtime, decided by the actual type of the variable
		 */

	}

	public static void m(Object x) {
		System.out.println(x.toString());
	}
}

class GraduateStudent extends Student {
}

class Student extends Person {
	@Override
	public String toString() {  
		return "Student" ;
	}
}

class Person extends Object {
	@Override
	public String toString() {
		return "Person" ;
	}
} 
