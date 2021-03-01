package week02;

import java.util.Scanner;

public class WordOddLength {

	public static void main(String[] args) {
		/*
		Ask user to enter a word. If the word has odd number of characters lenth() of characters and has 3 or more characters, print the character in the middle of the word.
		*/
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a word: ");
		String word = scan.next();
		int a = word.length();
		if(a%2!=0 && a>=3) {
			word = word.substring(0, a/2)+a+word.substring(a/2);
			System.out.println(word);
		}else {
			System.out.println(word + " has even characters");
		}
		scan.close();
		
	}

}
