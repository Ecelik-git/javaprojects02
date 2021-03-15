package week03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Duplicable {

	public static void main(String[] args) {
		/*
		Write a code that returns the duplicate chars in a String array e.g. 
		String str=“ilovejavatoo” 
		Output: o v a
		*/
		Scanner scan = new Scanner(System.in);
		//ask user to enter char and string
		System.out.println("Please enter a string: ");
		String str=scan.nextLine().toLowerCase().trim();
		//remove space char
		str = str.replaceAll(" ", "");
		//create an array with split method
		String[] arr = str.split("");
		duplicableString(arr);
		scan.close();

	}
	public static void duplicableString(String[] arr) {
		//list to hold unique chars
		List<String> list1 = new ArrayList<>();
		for(int i=0; i<arr.length; i++) {
			for(int j =i+1; j<arr.length; j++) {
				if(arr[i].equals(arr[j])) {
					//check if list contains the char
					//if not add the char to list
					if(!list1.contains(arr[i])) {
						list1.add(arr[i]);
						//printing arr i otherwise we need loop to print list
						System.out.print(arr[i]+" ");
					}
				}
			}
		}
		
	}

}
