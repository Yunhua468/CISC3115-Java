
public class Fish implements Pred, Predator{
	public void flee() {
		System.out.println("The fish is fleeing from larger fish");
	}
	
	public void hunt() {
		System.out.println("The fish is hunting smaller fish");
	}
}
