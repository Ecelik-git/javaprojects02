package week02;

import java.util.Scanner;

public class FirstHalfOfString {

	public static void main(String[] args) {
		/*
		StringMethods:
			Write a Java program to extract the first half of a string of even length.
Example:
			     INPUT      :  Python
			    OUTPUT :   Pyt
	    */
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a string: ");
		String a = scan.next().trim();
		if(a.length()%2==0) {
			System.out.println(a.substring(0, a.length()/2));
		}else {
			System.out.println(a+" has odd characters");
		}
		scan.close();
	}

}
