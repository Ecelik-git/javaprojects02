package week02;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		/* 
		Write the Switch Case java code that prints the A, B, C, D, F notes that the user has entered.            
		           A Excellent				
		           B	Good				
		           C	Average				
		           D	Deficient				
		           F	Failing							
				 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the letter for grade: ");
		char grade = scan.next().toUpperCase().charAt(0);
		switch(grade) {
		case 'A':
			System.out.println("Excellent");
			break;
		case 'B':
			System.out.println("Good");
			break;
		case 'C':
			System.out.println("Average");
			break;
		case 'D':
			System.out.println("Deficient");
			break;
		case 'F':
			System.out.println("Failing");
			break;
		default:
			System.out.println("Please enter a valid letter, ABCDF: ");
		}
		scan.close();
	}

}
