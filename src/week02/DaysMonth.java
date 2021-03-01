package week02;

import java.util.Scanner;

public class DaysMonth {

	public static void main(String[] args) {
		/* 
		Write the Switch Case java code, which says how many days the user has entered for the month he entered.		 
		*/
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the name of the month: ");
		String month = scan.next().toLowerCase().trim();
		switch(month) {
		case "january":
		case "march":
		case "may":
		case "july":
		case "august":
		case "october":
		case "december":
			System.out.println(month+" has 31 days");
			break;
		case "april":
		case "june":
		case "september":
		case "november":
			System.out.println(month+" has 30 days");
			break;
		case "february":
			System.out.println(month+" has either 28 days or 29 days");
			break;
		default:
			System.out.println("Please enter a valid month");
		}
		scan.close();
	}

}
