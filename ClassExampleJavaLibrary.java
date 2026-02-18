import java.util.Date;
import java.util.Random;

public class ClassExampleJavaLibrary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// the getTime() method to return the elapsed time since January 1, 1970, GMT
		Date date = new Date();
		System.out.println("The elapsed time since Jan 1, 1970 is " + date.getTime() + " milliseconds");
		System.out.println(date.toString());
		
		// When you create a Random object, you have to specify a seed or use the default seed.
		// seed = 3
		Random random1 = new Random(3);  
		System.out.print("From random1: ");
		for (int i = 0; i < 10; i++)
			System.out.print(random1.nextInt(1000) + " ");
		
		Random random2 = new Random();
		System.out.print("\nFrom random2: ");
		for (int i = 0; i < 10; i++)
			System.out.print(random2.nextInt(1000) + " ");
		
	}

}
