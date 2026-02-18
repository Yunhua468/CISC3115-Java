import java.util.Arrays;
public class ClassExampleMax {  

	public static void main(String[] args) {  // to find the maximum value in a sequence of numbers
		// TODO Auto-generated method stub
		System.out.println(Arrays.toString(args));
		/*
		if (args.length == 0) {
			System.err.println("Usage: java Max <numbers>");
			return;
			}
		*/
		
		
		int max = Integer.MIN_VALUE;
		for (int i=0; i<args.length; i++) {
			int value = Integer.parseInt(args[i]);
			if (value > max) {
				max = value;
			}
		}
		System.out.println("The max is " + max);
		
	}

}
