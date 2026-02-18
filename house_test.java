
public class house_test {

	public static void main(String[] args) throws CloneNotSupportedException {
		// shallow copy example
		house_shallowcopy house1 = new house_shallowcopy(1, 1750.50);
		house_shallowcopy house2 = (house_shallowcopy)house1.clone();
		
		System.out.println(house1==house2);
		System.out.println(house1.whenBuilt==house2.whenBuilt);
		
		// deep copy example
		house_deepcopy house3 = new house_deepcopy(1, 1750.50);
		house_deepcopy house4 = (house_deepcopy)house3.clone();
		
		System.out.println(house3==house4);
		System.out.println(house3.whenBuilt==house4.whenBuilt);
	}

}
