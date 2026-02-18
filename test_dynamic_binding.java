
public class test_dynamic_binding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer[] list1 = {12, 24, 55, 1};
		Double[] list2 = {12.4, 24.0, 55.2, 1.0};
		int[] list3 = {1, 2, 3};
		printArray(list1);
		printArray(list2);
		printArray(list3);
		
		//B b = new A(0);
		//A a = b;
		
		//B b = new B();
		//A a = (A)b;
		
		
		
		//A a = new A(3);
	}
	public static void printArray(Object[] list) {
		for (Object o: list)
			System.out.print(o + " ");
			System.out.println();	
		}
}

class A extends B {
	public A(int t) {
		System.out.println("A's constructor is invoked");
	}
}

class B {
	public B() {
		System.out.println("B's constructor is invoked");
	}
}



