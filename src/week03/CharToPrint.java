package week03;

import java.util.Scanner;

public class CharToPrint {

	public static void main(String[] args) {
		/*
		String day= "8MARCH";
		         use charAt method and loop then print all letters on the console
		          */
		Scanner scan = new Scanner(System.in);
		//ask user to enter char and string
		System.out.println("Please enter the day: ");
		String str=scan.nextLine().toLowerCase().trim();
		//remove all non-letter chars
		str = str.replaceAll("[^A-Za-z]","");
		//System.out.println(str);
		//print all letters with a loop
		for(int i=0; i<str.length(); i++) {
			System.out.print(str.charAt(i)+" ");
		}
		scan.close();
	}

}
