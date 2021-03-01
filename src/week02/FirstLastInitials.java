package week02;

import java.util.Scanner;

public class FirstLastInitials {

	public static void main(String[] args) {
		/* 
		Ask user to enter firstName and lastName then make first initials uppercase and rest should be all lovercase
		ferhat => Ferhat
		kirac => Kirac
		          */
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter first and last name: ");
		String firstName = scan.next().toLowerCase().trim();
		String lastName = scan.next().toLowerCase().trim();
		char first = firstName.toUpperCase().charAt(0);
		char last = lastName.toUpperCase().charAt(0);
		firstName = first + firstName.substring(1);
		lastName = last+lastName.substring(1);
		System.out.println("First Name: "+firstName+ " Last Name: "+lastName);
		scan.close();
	}

}
