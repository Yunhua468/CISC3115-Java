import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;
import java.io.IOException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.FileReader;
//import javax.swing.JOptionPane;
//import java.util.Random;
public class Main {

	public static void main(String[] args) {
		/*
		// TODO Auto-generated method stub, remember the semicolon
		// System.out.print("today");
		// System.out.println("today"); 
		// System.out.print("today\n");
		// System.out.println("\t today");
		//System.out.print(""today"");
		// System.out.println("\"today\"");
		// System.out.println("\\today\\");
		// System.out.println("sysout: ctrl+space");
		
		/* TODO 
		 * Auto-generated method stub
		 */
		
		// System.out.       println("today");
		
		// System.out.print("ctrl and + zoom out; ctrl and - zoom in\n");
		
		// System.out.print("window->show view:package explore and console");
		
		/* Create a variable
		 declaration + assignment = initialization
		 */
		//declaration + assignment
		// int x;
		// x = 123;
		// initialization
		// int y = 123;
		
		// System.out.println(x);
		// System.out.println("x");
		// System.out.println("x = "+x);
		// System.out.println(y);
		
		//int z = 57382967266786749676748;
		// long z = 573829458;
		// System.out.println(z);
		
		//int x = 123.34
		// float a = 3.14f;
		// System.out.println(a);
		
		// double b = 3.14;
		// System.out.println(b);
		
		// boolean t = true;
		// System.out.println(t);
		
		// char symbol = '@';
		// System.out.println(symbol);
		
		// reference data type begins with capital letter
		// String s_name = "Yunhua";
		// System.out.println("hello " + s_name);
		
		
		
		//Swap two variables
		// String s1 = "class1";
		// String s2 = "class2";
		// String temp;   // or String temp = Null;
		
		// temp = s1;
		// s1 = s2;
		// s2 = temp;
		// System.out.println(s1);
		// System.out.println(s2);
		
		
		
		/*
				
		//Scanner to accept input
		Scanner scanner = new Scanner(System.in);
		
		String name = scanner.nextLine();
		System.out.println("name: " + name);
		
		//scanner.nextLine();
		
		String hobby = scanner.nextLine();
		System.out.println("hobby: " + hobby);
		
		int age = scanner.nextInt();
		System.out.println("age: " + age);
		
		int salary = scanner.nextInt();
		System.out.println("salary: " + salary);
		
		scanner.nextLine();
		
		String food = scanner.nextLine();
		System.out.println("food: " + food);
		
		int phd = scanner.nextInt();
		System.out.println("phd: " + phd);
		*/
		
		
		/*
		// expressions = operands & operators
		// operands: value, variable, number, quantity
		// operators: + - * / %
		int apples = 20;
		
		apples = apples + 1;
		
		apples--;
		
		double oranges = 30;
		oranges = oranges/3;
		apples = 5;
		
		System.out.println(oranges);
		System.out.println(apples);
		*/
		
		
		
		
		// GUI and parse input to int or double
		/*
		String name = JOptionPane.showInputDialog("What is your name?");
		JOptionPane.showMessageDialog(null, "My name is "+name);
		
		int age = Integer.parseInt(JOptionPane.showInputDialog("How old are you?"));
		JOptionPane.showMessageDialog(null, age);
		
		double height = Double.parseDouble(JOptionPane.showInputDialog("How tall are you?"));
		JOptionPane.showMessageDialog(null, height);
		*/
		
		
		/*
		// Math
		int i = -10;
		double pi = 3.14;
		
		System.out.println(Math.abs(i));
		System.out.println(Math.sqrt(Math.abs(i)));
		System.out.println(Math.round(pi));
		System.out.println(Math.floor(pi));
		System.out.println(Math.ceil(pi));
		
		
		Scanner scanner = new Scanner(System.in);
		//JOptionPane.showInputDialog("input the l, w");
		System.out.println("input l:");
		double l = scanner.nextLong();
		System.out.println("input w:");
		double w = scanner.nextLong();
		
		
		double h = Math.sqrt(Math.pow(l, 2)+w*w);
		System.out.println("output h:" + h);
		System.out.println(l);
		System.out.println(w);
		System.out.println(h);
		*/
		
		/*
		// Random numbers
		Random random = new Random();
		int x = random.nextInt(6) + 1;
		System.out.println(x);
		*/
		
		
		/*
		// if else
		Random random = new Random();
		int num = random.nextInt(100) + 1;   // generate random num between 1 to 100
		
		if (num>=80) {
			System.out.println("bigger than 80");
		}
		else if (num>=60) {
			System.out.println("bigger than 60 and smaller than 80"); 
		}
		else {
			System.out.println("less than 60");
		}
		*/
		
		
		/*
		// switch, break will stop switch, otherwise run all the codes after matching
		
		String day = "Friday";
		switch(day){
			case "Sunday": System.out.println("Sunday");
			break;
			case "Monday": System.out.println("Monday");
			break;
			case "Saturday": System.out.println("Saturday");
			break;
			case "Thursday": System.out.println("Thursday");
			break;
			case "Friday": System.out.println("Friday");
			break;
			default: System.out.println("no such day");
		}
		*/
	
		
		
		/*
		
		// logical operators  &&, ||, !
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("press q or Q to quit the game");
		
		String responce = scanner.next();
		
		if (responce.equals("q") || responce.equals("Q")) {
			System.out.println("You quit the game");
		}
		else {
			System.out.println("continue the game");
		}
		*/
		
		
		
		
		// while loop
		// Scanner scanner = new Scanner(System.in);
		
		// String name = "Bro";
		/*
		while(name.isBlank()) {
			System.out.println("Enter your name:");
			name = scanner.nextLine();
		}
		*/
		
		/*
		do {
			System.out.println("Enter your name:");
			name = scanner.nextLine();
		} while(name.isBlank());
		
		System.out.println("Hello " + name);
			
		*/
		
		// for loop
		/*
		for (int i = 10; i>=0; i--) {
			System.out.println(i);
		}
		System.out.println("Happy New Year!");
		*/
		/*
		for (int i = 0; i<=10; ) {
			System.out.println(i);
			i++;
		}
		*/
		
		/*
		// nested loops
		Scanner scanner = new Scanner(System.in);
		int row;
		int col;
		String symbol = "";
		
		System.out.println("Enter # of rows: ");
		row = scanner.nextInt();
		System.out.println("Enter # of columns: ");
		col = scanner.nextInt();
		System.out.println("Enter symbol to use: ");
		symbol = scanner.next();
		
		for (int i=1; i<=row; i++) {
			System.out.println();
			for (int j=1; j<=col; j++) {
				System.out.print(symbol);
			}
		}
		*/
		
		
		/*
		// array: store multiple values in a single variable
		String[] cars = {"Camaro", "Ferrari", "Lambo"};   // same data type
		
		cars[0] = "BMW";
		
		System.out.println(cars[0]);
		System.out.println(cars[1]);
		
		//System.out.println(cars[3]);   // 3 is out of the index range
		
		// another way to define an array
		String[] car_brands = new String[3];
		car_brands[0] = "BMW";
		car_brands[1] = "Ferrari";
		car_brands[2] = "Lambo";
		
		System.out.println(car_brands);  // print the address of variable car_brands
		for (int i=0; i<car_brands.length; i++) {
			System.out.println(car_brands[i]);
		}
		
		// 2D array: an array of arrays
		String[][] stars = new String[2][2];
		stars[0][0] = "Saturn";
		stars[0][1] = "Earth";
		stars[1][0] = "Mars";
		stars[1][1] = "Jupyter";
		
		for (int i=0; i<stars.length; i++) {
			System.out.println();
			for (int j=0; j<stars[i].length; j++) {
				System.out.print(stars[i][j]+" ");
			}
		}
		
		
		
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
		//String Method
		
		// String = a reference data type that can store one or more characters
		// reference data types have access to useful methods
		
		String name = "Yunhua   ";
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
		
		String result9 = name.trim();
		System.out.println(result9);
		
		String result10 = name.replace('a', 'o');
		System.out.println(result10);
		*/
		
		
		
		
		
		
		
		
		
		/*
		
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
		
		Boolean a = true;
		Character b = '#';
		Integer c = 23;
		Double d = 3.1415;
		String e = "Yunhua";
		
		if (a==true) {
			System.out.println("this is true");
		}
		
		if (b=='#') {
			System.out.println("this is true");
		}
		System.out.println(c==23);
		System.out.println(d == 3.1415);
		System.out.println(e=="Yunhua");
		System.out.println();
		System.out.println(e.equals("Yunhua"));
		*/
		
		/*
		// Arraylist = a resizable array
		//             Elements can be added and removed after compilation phase
		//             store reference data types (primitive type needs to be wrapper way, like ArrayList<Integer>)
		
		
		ArrayList<String> food = new ArrayList<String>();
		food.add("pizza");
		food.add("pizza");
		food.add("pizza");
		
		food.set(0, "sushi");
		food.remove(2);
		
		for (int i = 0; i<food.size(); i++) {
			System.out.println(food.get(i));
		}
		
		food.clear();
		for (int i = 0; i<food.size(); i++) {
			System.out.println(food.get(i));
		}
		*/
		
		
		/*
		// 2D ArrayList = a dynamic list of lists
		// You can change the size of these lists during runtime
		
		ArrayList<String> food = new ArrayList();
		food.add("pasta");
		food.add("bread");
		food.add("donuts");
		
		System.out.println(food);
		System.out.println(food.get(0));
		
		ArrayList<String> fruit = new ArrayList();
		fruit.add("apple");
		fruit.add("banana");
		fruit.add("orange");
		
		System.out.println(fruit);
		System.out.println(fruit.get(0));
		
		ArrayList<String> drink = new ArrayList();
		drink.add("soda");
		drink.add("combacha");
		drink.add("milk");
		
		System.out.println(drink);
		System.out.println(drink.get(0));
		
		
		// convert food, fruit and drink to one 2D ArrayList
		ArrayList<ArrayList<String>> grocery = new ArrayList();
		grocery.add(food);
		grocery.add(drink);
		grocery.add(fruit);
		grocery.add(food);
		System.out.println(grocery);
		
		System.out.println(grocery.get(0));
		System.out.println(grocery.get(0).get(1));
		System.out.println(grocery.get(2).get(1));
		*/
		
		
		/*
		// for-each loop = traversing technique to iterate through the elements in an array/collection
		//                 less steps, more readable
		//                 less flexible
		
		String[] animals = {"cat", "dog"};
		// for (type index: variable)
		for (String i: animals) {
			System.out.println(i);
		}
		
		ArrayList<String> fruit = new ArrayList<>();
		fruit.add("apple");
		fruit.add("banana");
		fruit.add(0, "banana");
		
		// for (type index: variable)
		for (String i: fruit) {
			System.out.println(i);
		}
		*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		// Method = a block of code that is executed whenever it is called upon
		/*
		String name = "Yunhua";
		int age = 20;
		greet(name, age);	
		greet(name, age);
		
		int x = 3;
		int y = 4;
		
		int z = addition(x, y);
		System.out.println(z);
		*/
		
		/*
		// overloaded methods =  methods that share the same name but have different parameters
		//                       method name + parameter = method signature
		int x = addition(1,2,3);
		System.out.println(x);
		
		System.out.println(addition(1,2,3,4));
		System.out.println(addition(1,2));
		System.out.println(addition(1.1,2.2));
		*/
		
		
		/*
		
		// key word modifier static = A single copy of a variable/method is created and shared.
		//                            The class "owns" the static member, shared by all the members of this class
		
		System.out.println(Friend.num);
		
		// create a Friend object
		Friend friend1 = new Friend("Yunhua");
		Friend friend2 = new Friend("Anna");
		System.out.println(Friend.num);   // num is static which is shared by all the Friend object, so use class name Friend to access
		
		
		System.out.println(friend1.num2);   // num2 is not static, it is not shared by other class object(like friend2), so use friend1 to access
		System.out.println(friend2.num2);
		
		//System.out.println(Friend.num2);
		
		Friend.displayFriends(); // static method, also use the class name to access which is recommended
		//friend1.displayFriends();
		*/
		
		/*
		System.out.println((double)(2/j+4/j+6/j+8/j));
		System.out.println((2/j));
		
		System.out.println((double)(2/j));
		
		System.out.println((4/j));
		System.out.println((6/j));
		System.out.println((8/j));
		
		
		
		System.out.println(!(k==5 && j!=k && j==3));
		System.out.println(!(k==5 && j!=k));
		System.out.println(!(j==3));
		
		
		// String text="freddy-mac";
		
		//text.substring(text.indexOf("red")-1, text.length()-3)+text.charAt(1);
		System.out.println(text.indexOf("red")-1);  //0
		System.out.println(text.length()-3);
		System.out.println(text.substring(text.indexOf("red")-1, text.length()-3));  // freddy-
		System.out.println(text.charAt(1));    // r
		System.out.println(text.substring(text.indexOf("red")-1, text.length()-3)+text.charAt(1));
		*/
		/*
		int j=4;
		int k=5;
		boolean t1=true;
		boolean t2=false;
		String text="freddy-mac";
		int[] a= {3,2,9,14,0,1};
		System.out.println(a[3] - a[1] * a.length);  //14 - 2 * 6 = 2
		
		System.out.println(m1(a));
		
		double[] b = {1.1, 3.4, 1.2, 100.0};
		System.out.println(m2(b));
		
		
		double[] c = {1.1, 3.4, 1.2, 100.0, 1.1, 1.1, 1.2};
		System.out.println(m3(c, 1.1));
		*/
		
		
		
		
		
		
		
		
		// printf = an optional method to control, format and display text to the console window
		// two arguments = format string + (object/variable/value)
		// % [flags] [precision] [width] [conversion-character]		
		//System.out.printf(" This is a format string %d", 123); // integer
		
		//boolean myBoolean = true;
		//char myChar = '@';
		//String myString = "Yunhua";
		//int myInt = 50;
		//double myDouble = 1000;
		
		// [conversion-character]]
		//System.out.printf("  %b", myBoolean);
		//System.out.printf("  %c", myChar);
		//System.out.printf("  %d", myInt);
		//System.out.printf("  %f", myDouble);
		//System.out.printf("  %s", myString);
		
		// [width]: min number of characters to be written as output, -:left-justify
		//System.out.printf("hello %10s", myString);
		//System.out.printf("hello %-10s", myString);
		
		// [precision]: set number of digits of precision when outputting float-point values
		//System.out.printf("%.2f", myDouble);
		
		// [flags] adds an effect to output based on the flag added to format specifier
		// -:left-justify
		// +:output a plus(+) or minus(-) sign for a numeric value
		// 0:numeric values are zero-padded
		// ,:comma grouping separator if numbers > 1000
		//System.out.printf("%,+020f", myDouble);
		
		
		
		// final key word: can not be changed or update
		//final double PI = 3.1415926;
		//System.out.println(PI);
		
		
		/*
		// **********************************************************************
		// object = an instance of a class that may contain attributes and methods
		// example: (phone, desk, computer, coffee cup)
		
		Car car = new Car();
		System.out.println(car.model);
		car.drive();
		
		Car myCar = new Car();
		myCar.brake();
		
		// **********************************************************************
		*/
		
		/*
		// above all the cars have the same attribute when we create, how to create new car with different attibutes? Constructor
		// **********************************************************************
		// constructor = special method that is called when an object is instantiated (created)
		
		Human human = new Human("Bro", 50, 100);
		System.out.println(human.name);
		
		Human human1 = new Human("Ana", 56, 200);
		System.out.println(human1.name);
		human1.eat(); 
		// **********************************************************************
		*/
		
		// **********************************************************************
		// variable scope
		// local = declared inside a method
		//         visible only that method
		
		//global = declared outside a method, but within a class
		//         visible to all parts of a class
		//DiceRoller diceroll = new DiceRoller();
		// **********************************************************************
		
		/*
		// **********************************************************************
		// overloaded constructors = multiple constructors within a class with the same name, but different parameters
		// name + parameters = signature
		Pizza pizza = new Pizza("thick crust", "tomato", "mozzerella", "pepperoni");
		System.out.println(pizza.bread);
		
		Pizza pizza1 = new Pizza("thick crust", "tomato", "mozzerella");
		System.out.println(pizza1.bread);
		System.out.println(pizza1.topping);
		*/
		
		// **********************************************************************
		
		
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
		/*
		// Two classes to change the string in place, String s = s.toUpper();
		// StringBuilder: single task only
		// StringBuffer: safe for multi-tasking
		
		// 3 ways to create StringBuilder object
		// StringBuilder()    empty StringBuilder
		// StringBuilder(int capacity)    capacity is the start not limit
		// StringBuilder(String s)
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
		
		
		/*
		// **********************************************************************
		// array of objects
		int[] numbers = new int[3];
		char[] characters = new char[4];
		String[] strings = new String[5];
		
		Car[] cars = new Car[3];
		
		Car car1 = new Car("BMW1");
		Car car2 = new Car("BMW2");
		System.out.println(car1.name);
		System.out.println(car2.name);
		
		cars[0] = car1;
		cars[1] = car2;
		// or Car[] cars = {car1, car2};
		System.out.println(cars[0].name);
		System.out.println(cars[1].name);
		// **********************************************************************
		*/
		
		/*
		// **********************************************************************
		// object passing: how to pass object to a argument
		Garage garage = new Garage();
		Car car1 = new Car("BMW");
		Car car2 = new Car("Tesla");
		garage.park(car1);
		garage.park(car2);
		*/
		
		
		/*
		// **********************************************************************
		// inheritance = the process where one class acquires the attributes and methods of another
		
		// example, I want the Bicycle and Car classes inheritance everything from Vehicle class
		
		Bicycle bike = new Bicycle();
		bike.stop();  //Bicycle is empty but inheritance from Vehicle
		bike.go();
		System.out.println(bike.speed);  //speed is inheritance from Vehicle
		System.out.println(bike.pedals);  // Bicycle also could has its own attributes or methods
		*/
		
		
		
		/*
		// **********************************************************************
		// method overriding = Declaring a method in a sub class, which is already present in parent class.
		//                     done so that a child class can give its own implementation
		
		Animal animal = new Animal();
		Dog dog = new Dog();
		
		dog.speak();
		animal.speak();
		*/
		
		/*
		// **********************************************************************
		// super = keyword refers to the superclass (parent) of an object very similar to the "this" keyword
		Hero hero1 = new Hero("Batman", 42, "$$$$");
		//Hero hero2 = new Hero();
		
		//System.out.println(hero2.toString());
		System.out.println(hero1.name);
		System.out.println(hero1.age);
		System.out.println(hero1.power);
		
		System.out.println(hero1.toString());
		*/
		
		/*
		// **********************************************************************
		// abstract = abstract classes can't be instantiated, but they can have subclass
		//            abstract methods are declared without an implementation
		// Fruit fruit = new Fruit();
		
		Apple apple =  new Apple();
		apple.type();
		*/
		
		
		// **********************************************************************
		/*
		 * modifier     class    package   subclass    world
		 * public       Y        Y         Y           Y
		 * protected    Y        Y         Y           N
		 * private      Y        N         N           N
		 * no modifier  Y        Y         N           N
		 */
		// classes code A B C Asub within package 1 and package 2
		
		/*
		// **********************************************************************
		// Encapsulation = attributes of a class will be hidden or private,
		//                 can be accessed only through methods (getters & setters)
		//                 you should male attributes private if you do't have a reason to make them public/protected
		CarEncapsulation carencapsulation= new CarEncapsulation("Chevrolet", "Camaro", 2023);
		
		// methods 1   getter
		System.out.println(carencapsulation.getMake());
		System.out.println(carencapsulation.getModel());
		System.out.println(carencapsulation.getYear());
		
		// method 2    setter
		// carencapsulation.year = 2021;  // since year is private 
		carencapsulation.setYear(2022);
		System.out.println(carencapsulation);
		*/
		
		
		/*
		// **********************************************************************
		// copy object
		CarEncapsulation carencapsulation1= new CarEncapsulation("Chevrolet", "Camaro", 2023);
		CarEncapsulation carencapsulation2= new CarEncapsulation("BMW", "i520", 2022);
		System.out.println(carencapsulation1);
		System.out.println(carencapsulation2);
		System.out.println();
		System.out.println(carencapsulation1.getMake());
		System.out.println(carencapsulation1.getModel());
		System.out.println(carencapsulation1.getYear());
		System.out.println();
		System.out.println(carencapsulation2.getMake());
		System.out.println(carencapsulation2.getModel());
		System.out.println(carencapsulation2.getYear());
		System.out.println();
		*/
		/*
		// we want to copy these methods from car1 to car 2
		carencapsulation2 = carencapsulation1;   // share same memory, give car1 to the car 2, one memory to names
		System.out.println(carencapsulation1);
		System.out.println(carencapsulation2);
		System.out.println();
		System.out.println(carencapsulation1.getMake());
		System.out.println(carencapsulation1.getModel());
		System.out.println(carencapsulation1.getYear());
		System.out.println();
		System.out.println(carencapsulation2.getMake());
		System.out.println(carencapsulation2.getModel());
		System.out.println(carencapsulation2.getYear());
		*/
		/*
		// create  a assign methods to copy contents of car1 to car 2
		carencapsulation2.copy(carencapsulation1);
		System.out.println(carencapsulation1);
		System.out.println(carencapsulation2);
		System.out.println();
		System.out.println(carencapsulation1.getMake());
		System.out.println(carencapsulation1.getModel());
		System.out.println(carencapsulation1.getYear());
		System.out.println();
		System.out.println(carencapsulation2.getMake());
		System.out.println(carencapsulation2.getModel());
		System.out.println(carencapsulation2.getYear());
		System.out.println();
		
		CarEncapsulation carencapsulation3 = new CarEncapsulation(carencapsulation1);
		System.out.println(carencapsulation1);
		System.out.println(carencapsulation3);
		System.out.println();
		System.out.println(carencapsulation1.getMake());
		System.out.println(carencapsulation1.getModel());
		System.out.println(carencapsulation1.getYear());
		System.out.println();
		System.out.println(carencapsulation3.getMake());
		System.out.println(carencapsulation3.getModel());
		System.out.println(carencapsulation3.getYear());
		System.out.println();
		*/
		
		
		
		
		
		/*
		// **********************************************************************
		// interface =  a template that can be applied to a class.
		//              similar to inheritance, but specifies what a class has/must do;
		//              classes can apply more than one interface, inheritance is limited to 1 super class
		Rabbit rabbit = new Rabbit();
		rabbit.flee();
		
		 Hawk hawk = new Hawk();
		hawk.hunt();
		
		Fish fish = new Fish();
		fish.hunt();
		fish.flee();
		*/
		
		
		
		
		/*
		// **********************************************************************
		// polymorphism = greek word for poly-"many", morph-"form"
		//                the ability of an object to identify as more than one type
		
		PolymorphismCar polymorphismcar = new PolymorphismCar();
		PolymorphismBicycle polymorphismbycicle = new PolymorphismBicycle();
		PolymorphismBoat polymorphismboat = new PolymorphismBoat();
		
		// racers = {polymorphismcar, polymorphismbycicle, polymorphismboat}  // problem with the type of this array
		//PolymorphismVehicle[] racers = {polymorphismcar, polymorphismbycicle, polymorphismboat};  // these are subclasses of PolymorphismVehicle, so has that type
		PolymorphismVehicle[] racers = {polymorphismcar, polymorphismbycicle, polymorphismboat};
		for(PolymorphismVehicle x: racers) {
			x.go();
		}
		*/
		
		
		
		
		/*
		// **********************************************************************
		// Dynamic Polymorphism
		// Polymorphism = many shapes/forms
		// dynamic      = after compilation (During runtime)
		
		// ex. A corvette is a : covetter, and a car, and a vehicle, and an object
		Scanner scanner = new Scanner(System.in);
		DynamicpolyPlant plant;
		
		System.out.println("What plant do you want?");
		System.out.println("(1=tree) or (2=cat)" );
		
		int choice = scanner.nextInt();
		if (choice ==1) {
			plant = new DynamicpolyTree();
			plant.speak();
		}
		else if (choice ==2) {
			plant = new DynamicpolyFlower();
			plant.speak();
		}
		else {
			plant = new DynamicpolyPlant();
			System.out.println("invalid");
		}
		*/
		
		
		
		
		
		
		/*
		// **********************************************************************
		// exception = an event that occurs during the execution of a program that,
		//             disrupts the normal flow of instructions
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.println("Enter a whole number to divide: "); 
			int x = scanner.nextInt();
			
			System.out.println("Enter a whole number to divide by: "); 
			int y = scanner.nextInt();
			
			int z  = x/y;
			System.out.println(z);
		}
		catch(ArithmeticException e) {
			System.out.println(" can not divide by zero");
		}
		catch(InputMismatchException e) {
			System.out.println("input should be a number");
		}
		catch(Exception e) {
			System.out.println("something goes wrong");
		}
		finally {  // good to add to close the scanner or file that was opened
			scanner.close();
			System.out.println("this is always print");
		}
		*/
		// **********************************************************************
		
		
		
		
		
		/*
		// **********************************************************************
		// file =  An abstract representation of file and directory pathnames
		// import java.io.file
		// \\ or / for the path
		//File file = new File("C:\\Users\\ZhaoY\\Downloads\\CISC 3115 Introduction To Modern Programming Techniques\\fileexample\\example.txt");   // include the extension if it has one
		File file = new File("example.txt"); 
		if (file.exists()) {
			System.out.println("file exists");
			System.out.println(file.getPath());
			System.out.println(file.getAbsolutePath());
			System.out.println(file.isFile());
			file.delete();
		}
		else {
			System.out.println("file does not exists");
		}
		*/
		/*
		// write to a file
		// import java.io.FileWriter;
		try {
			FileWriter writer = new FileWriter("poem.txt");
			writer.write("Trees are green \nFlowers are red\n");
			writer.append("\n I like plants");
			writer.close();   // be sure to close it
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		*/
		
		/*
		// FileReader = read the contents of a file as a stream of characters. One by one 
		//              read() returns an int value which contains the byte value
		//              when read() returns -1, there is no more data to be read 
		// import java.io.FileReafder;
		try {
			FileReader reader = new FileReader("poem.txt");
			int data = reader.read();
			while (data != -1) {
				System.out.print((char) data);
				data = reader.read();
			}
			reader.close();
		} 
		catch (FileNotFoundException e) {;
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		
		*/
		
		
		
		
		// **********************************************************************
		// JOptionPane = pop up a standard dialog box that prompts users for a value
		//               or informs them of something
				
				
				
				
		// **********************************************************************
		
		
		
		
		
		
		
		
		
		
		
		// **********************************************************************
		// audio
		
		
		
		
		// **********************************************************************
	}
	
	static int m1(int[] arr) {
		int sum = 0;
		
		for (int i=0; i<arr.length; i++) {
			if (arr[i]>i && arr[i]%9==0 ) {
				sum += arr[i];
			}
		}
		return sum;
	}
	
	static int m2(double[] num) {
		int ret = 0;
		double biggerst = num[0];
		for (int i=0; i<num.length; i++) {
			if (num[i]>biggerst) {
				ret = i;
			}
		}
		return ret;
	}
	static int m3(double[] num, double x) {
		int ret = 0;
		for (int i=0; i<num.length; i++) {
			if (num[i] == x) {
				ret += 1;
			}
		}
		return ret;
	}
	
	
	static double addition(double a, double b) {
		System.out.println("overloaded method1");
		double z = a+b;
		return z;
	}
	
	static int addition(int a, int b, int c) {
		System.out.println("overloaded method2");
		int z = a+b+c;
		return z;
	}
	
	static int addition(int a, int b, int c, int d) {
		System.out.println("overloaded method3");
		return a+b+c+d;
	}
	
	
	
	// create a new method outside of main method
	// first character of name is lower case
	static void greet(String name, int afe) {
		System.out.println("Hello " + name);
		System.out.println("You are " + afe);
	}
	
	
	static int addition(int a, int b) {
		int z = a+b;
		return z;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}


