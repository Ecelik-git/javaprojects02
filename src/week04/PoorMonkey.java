package week04;

public class PoorMonkey {

	public static void main(String[] args) {
		/* There is a lonely monkey in the island
	     * He needs to eat 4 bananas every day
	     * There are just 165 bananas in that island
	     * Create following variables and find how many day monkey can survive.
	     * Use do while loop, increment and decrement and if statements
	int numbersOfBananas = 165, 
	survivalDays = 1;
	boolean monkeyAlive = true;
	     */

		int numberOfBananas = 165, survivalDay = 1;
		boolean monkeyAlive = true;
		do {
			numberOfBananas -=4;
			monkeyAlive = true;
			survivalDay++;
		}while(numberOfBananas>=4);
		if(numberOfBananas-4>0) {
			monkeyAlive = true;
			survivalDay++;
		}else {
			monkeyAlive = false;
		}
		System.out.println("The poor monkey can survive "+survivalDay+" days");
	}

}
