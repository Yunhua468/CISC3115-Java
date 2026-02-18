
public class Friend {
	
	String name;
	static int num;
	int num2;
	
	Friend(String name){
		this.name=name;
		num++;
		num2++;
	}
	/*
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	*/
	
	static void displayFriends() {
		System.out.println(num);
		//System.out.println(num2);
	}

}
