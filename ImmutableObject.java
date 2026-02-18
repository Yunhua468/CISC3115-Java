import java.math.BigInteger;
public class ImmutableObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
				// primitive type
		/*
				int number = -2;
				char symbol = '!';
				boolean rain = true;
					
				// Objects and arrays are usually created with the new keyword, which allocates
				// memory for them. For convenience, you don't have to use new to create strings

				int[] numbers = new int[3];	
				char[] myArray = {'c', 'a', 't'};
				
				numbers[0] = 1;
				numbers[1] = 2;
				numbers[2] = 3;
				//System.out.println(numbers[0]);
				
				
				// reference type: starts with the upper case, like String
				
				String word1 = new String("dog"); // creates a string object
				String word2 = "dog"; // implicitly creates a string object
				
				String myString = new String("dog");
				
				int x1 = 12;
				int x2 = 12;
				//System.out.println(x1==x2);
		*/		
				// The equals method traverses the String objects and tests whether they contain the same characters.
				
				/*
				 * To test whether two integers or other primitive types are equal, you can simply use the == operator. 
				 * But two String objects with the same characters would not be considered equal in the == sense. 
				 * The == operator, when applied to string variables, tests only whether they refer to the same object.
				 */
				
				//System.out.println(word1);
				//System.out.println(word2);
				//System.out.println(word1 == word2);
				//System.out.println(word1.equals(word2));
				
				// create two arrays a1, a2, int, 4 elements, assign values 1, 2, 3,4
				// try if the 1st elements of these two arrays are equal
				// if the two arrays are equal
			
				
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
				
				
				// **************************************************************************************
		/*
				// strings are immutable
				String name = "Alan Turing";
				String upperName = name.toUpperCase();
				
				System.out.println(name);
				System.out.println(upperName);
				
				// if you want to change the name to upper case, you need to assign the return value:
				String aname = "Alan Turing";
				aname = aname.toUpperCase(); // references the new string
				System.out.println(aname);
				
				String text = "Computer Science is fun!";
				//System.out.println(text);
				
				String newtext = new String();
				newtext = text.replace("Computer Science", "CS");
				System.out.println(text);
				System.out.println(newtext);
		*/
		
		
		// ************************************************************************************************
        //String num = new String("123");
        //num = num.toUpperCase();
        //System.out.println(num);
		
		// wrapper class = provides a way to use primitive data types as reference data types
		//     			   reference data types contain useful methods
		// 				   can be used with collections (ex. ArrayList)
		//                 reference data type is slower than primitive data type
		
		
		// primitive   wrapper
		// boolean     Boolean
		// char        Character
		// int         Integer
		// double      Double
		
		// autoboxing  = the automatic conversion that the Java compiler makes between the primitive type and the reference type
		// unboxing = the reverse of autoboxing
		/*
		Boolean a = true;
		Character b = '#';
		Integer c = 23;
		Double d = 3.1415;
		
		
		if (a==true) {
			System.out.println("this is true");
		}
		
		if (b=='#') {
			System.out.println("this is true");
		}
		*/
		//System.out.println(c==23);
		//System.out.println(d == 3.1415);
		//System.out.println(e=="Yunhua");
		//System.out.println();
		//System.out.println(e.equals("Yunhua"));
		//String e = "Yunhua";
		//String f = "Yunhua";
		//String g = new String("Yunhua");
		
		//System.out.println(e==f);
		//System.out.println();
		//System.out.println(e.equals(f));
		//System.out.println(e==g);
		//System.out.println(e.equals(g));
			
		/*	
		Integer x = new Integer(123);
		Integer y = new Integer(123);
		
		if (x == y) { // false
		System.out.println("x and y are the same object");
		}
		
		if (x.equals(y)) { // true
		System.out.println("x and y have the same value");
		}	
		*/
		// define two wrapper classes for char named c1 and c2, assign 'c' to c1 and c2, 
		// then printout the result of c1==c2 and c1.equals(c2)
		
		
		
		
	
		// Wrapper classes also provide methods for converting strings to and from primitive types.
		//String str = "12345.123";
		
		//double d_num = Double.parseDouble(str);
		//System.out.println(d_num);
		
		//int num = Integer.parseInt(str);

		//System.out.println(num);
		
		
		// *******************************************************************
		
		// array: store multiple values in a single variable
		// 
		//String[] cars = {"Camaro", "Ferrari", "Lambo"};   // same data type
		
		//cars[0] = "BMW";
		
		//System.out.println(cars[0]);
		//System.out.println(cars[1]);
		
		//System.out.println(cars[3]);   // 3 is out of the index range
		/*
		// another way to define an array
		String[] car_brands = new String[3];
		car_brands[0] = "BMW";
		car_brands[1] = "Ferrari";
		car_brands[2] = "Lambo";
		
		System.out.println(car_brands);  // print the address of variable car_brands
		
		for (int i=0; i<car_brands.length; i++) {
			System.out.println(car_brands[i]);
		}
		*/
		/*
		// 2D array: an array of arrays
		String[][] stars = new String[2][2];
		stars[0][0] = "Saturn";
		stars[0][1] = "Earth";
		stars[1][0] = "Mars";
		stars[1][1] = "Jupyter";
		
		//System.out.println(stars);
		//System.out.println(stars[0]);
		//System.out.println(stars[0][0]);
		
		
		
		for (int i=0; i<stars.length; i++) {
			System.out.println();
			for (int j=0; j<stars[i].length; j++) {
				System.out.print(stars[i][j]+" ");
			}
		}
		*/
		
		/*
		
		String[][] fruits = {
				{"apple", "orange", "banana"},
				{"grape", "dragon fruit", "strawberry"}
		};
		
		for (int i=0; i<fruits.length; i++) {
			System.out.println();
			for (int j=0; j<fruits[i].length; j++) {
				System.out.print(fruits[i][j]+" ");
			}
		}
		*/
		
		
		
		/*
		// Arithmetic big values
		// BigInteger (not primitive): when  integers that exceed Long.MAX_VALUE 
		// import java.math.BigInteger   float: java.math.BigDecimal
		
		long x = 17;
		BigInteger big = BigInteger.valueOf(x);    // converts a long to a BigInteger
		
		String s = "12345678901234567890";
		BigInteger bigger = new BigInteger(s);  // new BigInteger to convert strings
 
		// not primitive type, so could not use math operators, use methods   
		
		
		BigInteger a = BigInteger.valueOf(17);
		BigInteger b = BigInteger.valueOf(1700000000);
		BigInteger c = a.add(b);
		System.out.println(c);
		
		System.out.println(a.pow(0));
		*/
		
		/*
		// **********************************************************************
		// object = an instance of a class that may contain attributes and methods
		 // object-oriented: A way of organizing code and data into objects, rather than independent methods.
		// example: (phone, desk, computer, coffee cup)
		
		Car car = new Car();
		//System.out.println(car.model);
		car.drive();
		
		Car myCar = new Car();
		myCar.brake();
		*/
		
		// **********************************************************************
		// design process: encapsulation and generalization
		
		//for (int i = 1; i <= 6; i++) {
			// printf = an optional method to control, format and display text to the console window, two arguments = format string + (object/variable/value)
			//System.out.printf("%4d", 2 * i);  
		//}
			//System.out.println();

		
		//printRow();
		//printRow(5);
		/*
		 * 
		static void printRow(int n) {
			for (int i = 1; i <= 6; i++) {
				System.out.printf("%4d", n * i); // generalized n
			}
			System.out.println();
		}
		 */
		
		 //for (int i = 1; i <= 6; i++) {
				//printRow(i);
			//}
			
			//printTable(6);
			 
			 //printRow(3, 5);
			 //printTable(6);
		 
		// **********************************************************************
		
		
		/*
		// **********************************************************************
		// Command-Line Arguments: explain the args parameter of the main method
		 * run ClassExampleMax.java via cli prompt
		 
		// Argument Validation: ClassExampleisCapitalized 
		 * 
		 * 
		 
		*/
		 
		
	}
	
	static void printRow(int n) {
		for (int i = 1; i <= 6; i++) {
		System.out.printf("%4d", n * i); // generalized n
		}
		System.out.println();
	}
	
	// encapsulate
	static void printRow() {
		for (int i = 1; i <= 6; i++) {
			System.out.printf("%4d", 2 * i);
		}
		System.out.println();
	}

	
	
	static void printTable(int rows) {
		for (int i = 1; i <= rows; i++) { // generalized rows
			printRow(i, i);
		}
	}
	
	static void printRow(int n, int cols) {
		for (int i = 1; i <= cols; i++) { // generalized cols
			System.out.printf("%4d", n * i);
		}
		System.out.println();
	}




}
