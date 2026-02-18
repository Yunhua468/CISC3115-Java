import java.awt.Point;
import java.awt.Rectangle;

public class MutableObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Mutable Objects: Point and Rectangle
		// import java.awt.Point;   reference       import java.awt.Rectangle;
		//Point blank ;                 // declares that blank has type Point
		//blank = new Point(3, 4);     // creates the new Point with the coordinates x = 3 and y = 4
		//System.out.println(blank);
		
		//System.out.println();
        //blank.x = 20;
        //blank.y = 40;
        //System.out.println(blank);
        		
		
		// attributes: Variables that belong to an object
		// dot notation: To access an attribute or a method of an object
		//System.out.println(blank.x);
		//System.out.println(blank.x * blank.x + blank.y * blank.y);
		
		// objects as parameter
		
		
		//Point p1 = new Point(0, 0);
		//Point p2 = new Point(3, 4);
		//double dist = p1.distance(p2); // dist is 5.0
		//System.out.println(dist);


		/*
		Point p1 = new Point(2,1);
		Point p2 = new Point(3,4);
		printPoint(blank);
		double dist;
		dist = distance(p1, p2);
		System.out.println(dist);
		*/
		
		
		//Rectangle box = new Rectangle(0, 0, 100, 200); // four attributes: x, y, width, and height
		
		//System.out.println(box);
		
		//System.out.println(findCenter(box));
		
		
		
		//Point and Rectangles Are Mutable
		//Point blank ;                 // declares that blank has type Point
		//blank = new Point(3, 4);     // creates the new Point with the coordinates x = 3 and y = 4
		//blank.x = 4;
		
		//Rectangle box = new Rectangle(0, 0, 100, 200);
		//box.x = box.x + 50;
		//box.y = box.y + 100;
		

		
		// Question: how to encapsulate this code?
		//moveRect();
		
		// box.translate(50, 100);   // same as the moveRect for Point
		
		// Aliasing(multiple names): assign an object to a variable e, you are assigning a reference to an object. 
		// It is possible to have multiple variables that refer to the same object.
		/*Rectangle box1 = new Rectangle(0, 0, 100, 200);
		Rectangle box2 = box1;
		
		box1.grow(50, 50); // grow box1 (alias)
		System.out.println(box1);
		System.out.println(box2);
		
		// recall the String equals
		//strings are specified at compile time, the compiler can tell that they are equivalent.
				// different with reference: attention!!!!!!
				stringequal();
		
		// garbage collection
		Point blank = new Point(3, 4);
		blank = null;    // blacnk reference to nothing, but the memory has assigned
*/
		/*
		 * As your program runs, the system automatically looks for stranded objects
			and deletes them; then the space can be reused for new objects. This process
			is called garbage collection
		 */
		
		
		
		
		
		
		
		
		
		
		
		// **********************************************************************
		
		//String Method
		
		// String = a reference data type that can store one or more characters
		// reference data types have access to useful methods
		/*
		String name = new String("Yunhua");
		String name1 = new String("Yunhua");
		//System.out.println(name == name1);
		
		System.out.println(name.equals(name1));
		*/
		//String name = "Yunhua";
		/*
		boolean result = name.equals("Yunhua");
		System.out.println(result);
		
		boolean result1 = name.equals("yunhua");
		System.out.println(result1);
		
		boolean result2 = name.equalsIgnoreCase("yunhua");
		System.out.println(result2);
		
		int result3 = name.length();
		System.out.println(result3);
		
		char result4 = name.charAt(0);
		System.out.println(result4);
		
		int result5 = name.indexOf("Y");
		System.out.println(result5);
		
		boolean result6 = name.isEmpty();
		System.out.println(result6);
		
		String result7 = name.toUpperCase();
		System.out.println(result7);
		
		String result8 = name.toLowerCase();
		System.out.println(result8);
		
		String name = "Yunhua   ";
		String result9 = name.trim();
		System.out.println(result9);
		*/
		/*
		String name = "Yunhua   ";
		String result10 = name.replace('a', 'o');
		System.out.println(name);
		System.out.println(result10);
		*/
		
		
		//*****************************************************************************************************************
		
				/*
				// toString() = special method that all objects inherit,
				//              that returns a string that "textually represents" an object.
				//              can be used both implicitly and explicitly
				
				Car car = new Car();
				//System.out.println(car.make);
				//System.out.println(car.model);
				//System.out.println(car.color);
				//System.out.println(car.year);
					
				System.out.println(car);   //address of the car object
				System.out.println(car.toString());   //address of the car object    // usually overriding the toString method, see the Car class
				System.out.println(car); 
				*/
				
				// Two classes to change the string in place, String s = s.toUpper();
				// StringBuilder: single task only
				// StringBuffer: safe for multi-tasking
				
				// 3 ways to create StringBuilder object
				// StringBuilder()    empty StringBuilder
				// StringBuilder(int capacity)    capacity is the start not limit
				// StringBuilder(String s)
		/*
				StringBuilder s = new StringBuilder("abcdefghij");
				s.append("klmn");
				System.out.println(s);
				
				s.delete(2, 6);
				System.out.println(s);
				
				s.insert(2, "new");
				System.out.println(s);
				
				s.insert(0, 17*4);
				System.out.println(s);
				
				s.replace(4, 7, "*replaced*");
				System.out.println(s);
				
				s.setCharAt(0, 'M');
				System.out.println(s);
			*/	

	}
	
	static void printPoint(Point p) {
		System.out.println("(" + p.x + ", " + p.y + ")");
	}
	
	static double distance(Point p1, Point p2) {
		int dx = p2.x - p1.x;
		int dy = p2.y - p1.y;
		return Math.sqrt(dx * dx + dy * dy);
	}
	
	// takes a Rectangle as an argument and returns a Point with the coordinates of the center of the rectangle
	static Point findCenter(Rectangle box) {
		int x = box.x + box.width / 2;
		int y = box.y + box.height / 2;
		return new Point(x, y);
	}
	
	static void moveRect(Rectangle box, int dx, int dy) {
		box.x = box.x + dx;
		box.y = box.y + dy;
	}
	
	static void stringequal() {
		String s1 = "Hi, Mom!";
		String s2 = "Hi, " + "Mom!";
		if (s1 == s2) { // true!
		System.out.println("s1 and s2 are the same");
		}
	}
		



}
