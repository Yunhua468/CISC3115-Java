import java.util.Scanner;   // Scanner to accept input
public class P1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		double smallest = 0;
		
		System.out.println("Enter how many values totally: ");
		int header = scanner.nextInt();
		
		System.out.println("Enter the first value: ");
		smallest = scanner.nextDouble();
		
		for (int i=1; i<header; i++) {
			System.out.println("Enter a value: ");
			double w = scanner.nextDouble();
			if (w<smallest)
			smallest = w;
		}
		System.out.println("smallest value is: " + smallest);
	}

}
