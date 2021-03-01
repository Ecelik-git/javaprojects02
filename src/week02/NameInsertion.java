package week02;

import java.util.Scanner;

public class NameInsertion {

	public static void main(String[] args) {
		/*
		create 2 words : name1 and name2
		 if the name1 has even numbers of characters,
		 then insert the second word in the middle of the first name
		 if the first word has odd numbers
		 Then print the “Name2 cannot be inserted in the name1”
		 e.g:
		 name1= mehmet
		 name2= ahmet
		 Print ==> mehahmetmet
		*/
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter two names: ");
		String name1 = scan.next();
		String name2 = scan.next();
		if(name1.length()%2==0) {
			name1 = name1.substring(0, name1.length()/2)+name2+name1.substring(name1.length()/2);
			System.out.println(name1);
		}else {
			System.out.println(name2+ " cannot be inserted in the "+name1);
		}
		scan.close();

	}

}
