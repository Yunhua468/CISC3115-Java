import java.util.ArrayList;
import java.math.*;

public class LargestNumbers {
	public static void main(String[] args) {
		// creates an ArrayList of Number objects 
		ArrayList<Number> list = new ArrayList<>();
		list.add(45); // Add an integer, 45 is automatically converted into an Integer object
		list.add(3445.53); // Add a double
		// Add a BigInteger
		list.add(new BigInteger("3432323234344343101"));
		// Add a BigDecimal
		list.add(new BigDecimal("2.0909090989091343433344343"));
		
		 // Invoking the getLargestNumber method returns the largest number in the list
		System.out.println("The largest number is " + getLargestNumber(list));
		}
		
	// The getLargestNumber method returns null if the list is null or the list size is 0
		public static Number getLargestNumber(ArrayList<Number> list) {
			if (list == null || list.size() == 0)
				return null;
		
			Number number = list.get(0);
			for (int i = 1; i < list.size(); i++)
				// The doubleValue() method is defined in the Number class 
				// and implemented in the concrete subclass of Number. 
				if (number.doubleValue() < list.get(i).doubleValue())
					number = list.get(i);
				
			return number;
	}
}
