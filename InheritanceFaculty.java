
/*
 *  (1) Performs Person's tasks
	(2) Invoke Employee's overloaded constructor
	(3) Performs Employee's tasks
	(4) Performs Faculty's tasks
 */
class Person {
	public Person() {
		System.out.println("(1) Performs Person's tasks");
	}
}

public class InheritanceFaculty extends Employee{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new InheritanceFaculty();
	}
	 public InheritanceFaculty() {
		 System.out.println("(4) Performs Faculty's tasks");
	}
		
}

class Employee extends Person {
	public Employee() {
		this("(2) Invoke Employee's overloaded constructor");
		System.out.println("(3) Performs Employee's tasks ");
	}

	public Employee(String s) {
		System.out.println(s);
	}
}






/* If a class is designed to be extended, 
 * it is better to provide a no-arg constructor to avoid programming errors.
 */
class Fruits {
	public Fruits(String name) {
		System.out.println("Fruit's constructor is invoked");
	}
	public Fruits() {
		System.out.println("Fruit's constructor is invoked");
	}
}


class Apples extends Fruits {
	public Apples() {
		System.out.println("apple");
	}
}










