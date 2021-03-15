package week04;

public class RepeatedChar {

	public static void main(String[] args) {
		/*
		Create a method called numberOfChars and pass 2 parameters; 
		1. car 
		2. String
			char ch = 'p';
			String str = "population is number of people";
			int count = 0;
		then find how many times the given char is repeated in the String and 
		print it on the console
		*Use for loop, increment and if statements
				*/
		char ch = 'p';
		String str = "population is number of people";
		
		System.out.println("There is "+numberOfChars(ch, str)+" more "+ch+" in "+str.toUpperCase());

	}
	public static int numberOfChars(char ch, String str) {
		//count should be 0 
		int count = 0;
		//string to char array
		char arr[]= str.toCharArray();
		// for each char in arr
		for(char w: arr) {
			//if each element is given char increase the count
			if(w==ch) {
				count++;
			}
		}
		return count;
		
	}

}
