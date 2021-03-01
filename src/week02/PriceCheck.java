package week02;

import java.util.Scanner;

public class PriceCheck {

	public static void main(String[] args) {
		/*Write a code using ternary:
		Create int variable : price
		Create string variable : decision
		If the price = $10 Print “cheap”
		If price is 10-$20 print “ok”
		Otherwise “expensive”.
		*/
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the price: ");
		int price = scan.nextInt();
		String decision = price<=10? price+" is cheap": (price<=20? price+" is OK": price+ " is expensive");
		System.out.println(decision);
		scan.close();

	}

}
