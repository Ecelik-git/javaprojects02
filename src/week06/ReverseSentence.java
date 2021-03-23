package week06;

import java.util.Scanner;

public class ReverseSentence {

	public static void main(String[] args) {
		/* Write a Java program that reverse a sentence by using Array 
		* (with all spaces and special characters) 
		* Input : Coding is greate. 
		* Output : .etaerg si gnidoC 
		*/ 
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a sentence");
		String str = scan.nextLine();
		reverseSentence(str);
		scan.close();

	}
	public static void reverseSentence(String str) {
		String arr[]= str.split("");
		for(int i = arr.length-1; i>=0; i--) {
			System.out.print(arr[i]);
		}
	}

}
