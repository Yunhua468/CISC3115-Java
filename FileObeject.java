import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.IOException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.FileReader;
public class FileObeject {
	public static void main(String[] args) {
		System.out.println("Sep 18");
		// conditional operator
		// condition ? expression1 : expression2
		//System.out.println("Input an age: ");
		//Scanner scanner = new Scanner(System.in);
		//int age = scanner.nextInt();
		//System.out.println(age>18 ? "Yes" : "not");
		//System.out.println(age>18? (age>20? "You can drink":"wait a couple years") : "Absolutely No" );
		
		// The condition is always a boolean expression whose value is true or false. 
		// The two expressions are arbitrary (they can be anything) but the must have the same type.
		
		
		
		// switch, break will stop switch, otherwise run all the codes after matching
		 //* switch (expression) {   expression could be string or primitive type
		// * case here:  ;  here must be the same type as the expression, and could be computed at the compile time
		// * case n:  ;
		// * default:  ;
		// * }
		/*
		String day = "Friday";
		switch(day){
			case "Friday": System.out.println("Friday");
			break;
			case "Monday": System.out.println("Monday");
			break;
			case "Saturday": System.out.println("Saturday");
			break;
			case "Thursday": System.out.println("Thursday");
			break;
			case "Sunday": System.out.println("Sunday");
			break;
			default: System.out.println("no such day");
		}
		*/
		
		
		// directory, path, filename
		// current directory
		// get the current directory
		// https://docs.oracle.com/javase/tutorial/essential/environment/sysprop.html
		//String currentdirectory = System.getProperty("user.dir");
		//System.out.println(currentdirectory);
		//System.out.println(System.getProperty("user.home"));
		
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
		//System.out.println("try and catch work");
		 * 
		 */
		
		
		// **********************************************************************
		// file =  An abstract representation of file and directory pathnames
		// import java.io.file
		// \\ or / for the path
		//File file = new File("C:\\Users\\ZhaoY\\Downloads\\CISC 3115 Introduction To Modern Programming Techniques\\fileexample\\example.txt");   // include the extension if it has one
		//System.out.println(System.getProperty("user.dir"));
		/*
		File file = new File("src\\example.txt"); 
	
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
		
		
		// FileReader = read the contents of a file as a stream of characters. One by one 
		//              read() returns an int value which contains the byte value
		//              when read() returns -1, there is no more data to be read 
		// import java.io.FileReafder;
		/*
		try {
			FileReader reader = new FileReader("poem.txt");
			int data = reader.read();
			//System.out.println(data);
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
		
		
		
		// Another interface
		// GUI and parse input to int or double
				
				//String name = JOptionPane.showInputDialog("What is your name?");
				//JOptionPane.showMessageDialog(null, "My name is "+name);
				
				//int age = Integer.parseInt(JOptionPane.showInputDialog("How old are you?"));
				//JOptionPane.showMessageDialog(null, age);
				
				//double height = Double.parseDouble(JOptionPane.showInputDialog("How tall are you?"));
				//JOptionPane.showMessageDialog(null, height);
		
				
		// https://download.java.net/java/early_access/loom/docs/api/java.desktop/javax/swing/JOptionPane.html
	
		// JOptionPane = pop up a standard dialog box that prompts users for a value
		//               or informs them of something
		
		//JOptionPane.showMessageDialog(null, "plain", "title", JOptionPane.PLAIN_MESSAGE);
		//JOptionPane.showMessageDialog(null, "info", "title", JOptionPane.INFORMATION_MESSAGE);
		//JOptionPane.showMessageDialog(null, "question", "title", JOptionPane.QUESTION_MESSAGE);
		//while (true) {
			///JOptionPane.showMessageDialog(null, "warning", "title", JOptionPane.WARNING_MESSAGE);
		//}
		//JOptionPane.showMessageDialog(null, "error", "title", JOptionPane.ERROR_MESSAGE);
		
		//JOptionPane.showConfirmDialog(null, "what day is today?", "title", JOptionPane.YES_NO_CANCEL_OPTION);
		//int answer = JOptionPane.showConfirmDialog(null, "info", "title", JOptionPane.YES_NO_CANCEL_OPTION);
		//JOptionPane.showInputDialog("You are great!");
		/*
		String[] responces = {"No",
				"Yes",
				"random"
		};
		ImageIcon icon = new ImageIcon("icon.png");
		
		JOptionPane.showOptionDialog(null, 
				"contents", 
				"title", 
				JOptionPane.YES_NO_CANCEL_OPTION, 
				JOptionPane.INFORMATION_MESSAGE, 
				icon, 
				responces, 
				0);
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
		
		// money format   "$" + dollar + "." + cents   $19.86  $1986
		//System.out.println("$" + 1995/100 + "." + 1995%100);
		
		// composition  sqr(sqr(sqr(2))))   write the method sqr()
	}
}
