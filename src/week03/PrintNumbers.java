package week03;

public class PrintNumbers {

	public static void main(String[] args) {
		/*
		Print even numbers between 1-20 inclusive.  e.g.2 4 6 .. 20


		Print odd numbers between 1-20 inclusive. e.g 1,3,5,7,...,19  Including comma!


		Print all number that is divisible by 5 backward from 20-1 inclusive e.g.20,15,10,5
		 
		Find the sum of all even numbers from 1 - 20 inclusive

		Print all numbers from 1-20 except 11 or 15; use break or continue.
		*/
		printEvenNumbers();
		System.out.println();
		printOddNumbers();
		System.out.println();
		divisibleFive();
		System.out.println();
		sumEvenNumbers();
		System.out.println();
		allNumbers();


	}
	public static void printEvenNumbers() {
		for(int i=1; i<=20; i++) {
			if(i%2==0) {
				System.out.print(i+" ");
			}
		}
	}
	public static void printOddNumbers() {
		for(int i=1; i<=20; i++) {
			if(i%2!=0) {
				System.out.print(i+" ");
			}
		}
	}
	public static void divisibleFive() {
		for(int i=20; i>=1; i--) {
			if(i%5==0) {
				System.out.print(i+" ");
			}
		}
	}
	public static void sumEvenNumbers() {
		int sum = 0;
		for(int i=1; i<=20; i++) {
			if(i%2==0) {
				sum += i;
			}
		}
		System.out.println(sum);
	}
	public static void allNumbers() {
		for(int i=1; i<=20; i++) {
			if(i==11 || i ==15) {
				continue;
			}
			System.out.print(i+" ");
		}
	}
	

}
