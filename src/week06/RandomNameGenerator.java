package week06;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class RandomNameGenerator {
	/* Create a class : RandomNameGenerator 
	* Step1: Ask user to enter his/her name //john walker 
	* Step2: Delete the spaces in the username//johnwalker 
	* Step3: Check if the username is already taken//list("sam","johnmary","johnwalker","johnwalker523463146") 
	* Step4: If there the username is not taken, then print: This username is available 
	* Step5: If the username is already taken, then print This username is already taken 
	* Step6: Then generate a random number, add to the name, and Print the new username 
	*/ 

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your name");
		String name = scan.nextLine().trim();
		name = name.replaceAll(" ", "");
		Random number = new Random();
		int upperbound = 1000;
		List<String> nameList = new ArrayList<>();
		nameList.add("Java");
		nameList.add("techpro");
		if(!nameList.contains(name)) {
			System.out.println("This name is available for username");
			nameList.add(name);
		}else {
			System.out.println("This username is already taken");
			name = name +number.nextInt(upperbound);
			System.out.println("instead you can use "+name);
		}
		scan.close();

	}

}
