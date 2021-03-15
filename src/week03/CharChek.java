package week03;

import java.util.Scanner;

public class CharChek {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//ask user to enter char and string
		System.out.println("Please enter a char and string: ");
		char ch = scan.next().toLowerCase().charAt(0);
		String str = scan.next().trim().toLowerCase();
		//we can't check if char equals to string, so create string from char
		String ch1 =""+ch;
		//use split method to strore each letter of string in array
		String arr[]=str.split("");
		int count = 0;
		//check the array to see how many char in it
		for(String w : arr) {
			if(w.equals(ch1)) {
				count++;
			}
		}
		//print the result on the console
		if(count>0) {
			System.out.println("There is "+count+" more "+ch+" in "+str);
		}else {
			System.out.println("There is no "+ch+" in "+str);
		}
		scan.close();
	}

}
