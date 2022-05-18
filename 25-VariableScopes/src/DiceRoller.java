import java.util.Random;

public class DiceRoller {
	
	
//	1)  Declare random and number as Global variables
	

//	Random random;
//	int number;
//
//	DiceRoller() {
//		random = new Random();
//		roll();
//	}
//
//	void roll() {
//		number = random.nextInt(6) + 1;
//		System.out.println(number);
//	}
	
	
	
	
//	2)	Passing random and number as arguments to the method
	
	
	DiceRoller() {
		Random random = new Random();
		int number = 0;
		roll(random, number);
	}

	void roll(Random random, int number) {
		number = random.nextInt(6) + 1;
		System.out.println(number);
	}
}