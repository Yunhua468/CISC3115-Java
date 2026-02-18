import java.util.Random;
public class DiceRoller {
	Random random = new Random();        
	int number;
	DiceRoller() {
		//local to the constructor, not allowed to access by roll(), solution roll(random, number)
		//local to the constructor, random and number are declared outside of the constructor
		//Random random = new Random();        
		//int number  =  0;
		roll();     
	}
	
	void roll() {
		number  = random.nextInt(6)+1;  // number from 1 to 6
		System.out.println(number);
	}
}
