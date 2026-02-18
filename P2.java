import java.util.Scanner;
public class P2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int count = 0;
		
		System.out.println("Enter a number: ");
		
		// returns true if the next token in this scanner's input can be interpreted as an int value in the default radix using the nextInt() method.
		while (scanner.hasNextInt()) {
			System.out.println("Enter a number or terminal with strings: ");
			int k = scanner.nextInt();
			if (k==0) {
				System.out.println(count);
				count = 0;
			} else if (k<0) {
				count++;
			}
		}
	}

}
