package week04;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		/*
		Write the method that will print the reverse of the number 
		you received from the user on the console.
		*/
		
		//call the function in main method
		reverseNumbers();

	}
	public static void reverseNumbers() {
		Scanner scan = new Scanner(System.in);
		//ask users to enter a group of numbers
		System.out.println("Please enter a group of numbers: ");
		//store the numbers in a variable
		int num = scan.nextInt();
		//convert int to string with valueof
		String str = String.valueOf(num);
		//create a stringbuilder variable
		StringBuilder sb = new StringBuilder();
		//append the string value to string builder
		sb.append(str);
		//use reverse method to print reversed numbers
		System.out.println(sb.reverse());
		scan.close();
		
	}

}
