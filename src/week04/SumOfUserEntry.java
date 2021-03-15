package week04;

import java.util.Scanner;

public class SumOfUserEntry {

	public static void main(String[] args) {
		/*
		Ask User to enter numbers and add and print the numbers 
		he entered then request the new number. 
		If the sum of the numbers entered exceeds 100, 
		Print “You entered …….. numbers. That's enough ! “  
		and finish the game. 

		*/
		Scanner scan = new Scanner(System.in);
		int num, sum = 0, count = 0;
		do {
			//ask user to enter a number
			System.out.println("Please enter a number");
			//hold entry in a variable
			num = scan.nextInt();
			System.out.println("You entered "+num);
			//increase the sum by user entry
			sum +=num;
			//increase the number of entry by 1
			count ++;
		}while(sum<=100);//do this while sum is less than or equal to 100
		//print the message on the console
		System.out.println("you entered "+count+" numbers. That's enough");
		System.out.println("The sum of all numbers is "+sum);
		scan.close();
	}

}
