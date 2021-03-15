package week03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		/*
		Get numbers from the user and output that number consecutive fibonacci 
		number sequence
		     	e.g : User enters 10
		output : 0 1 1  2  3  5 8 13 21 34
		*/
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = scan.nextInt();
		
		fibSeries(num);
		scan.close();

	}
	
	//method to create fibonacci numbers
	public static void fibSeries(int a) {
		List<Integer> fibonacci = new ArrayList<>();
		
		fibonacci.add(0);
		fibonacci.add(1);
		
		for (int i = 2; i<a; i++) {
			fibonacci.add(fibonacci.get(i-2)+fibonacci.get(i-1));
			
		}
		for(int k=0; k<fibonacci.size(); k++) {
			System.out.print(fibonacci.get(k)+" ");
		}
	}

}
