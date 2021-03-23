package week06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InterviewQuestion03 {

	public static void main(String[] args) {
		//for given string "aaabbcccccdd"
		//print a3b2c5d2
		String str = "fabaaaaccccbddffffddfafafad";
		
		//str = str +"x";
		charAndCount(str);

	}
	public static void charAndCount(String str) {

		String arr[]=str.split("");
		Arrays.sort(arr);
		
		System.out.println(Arrays.toString(arr));
		int count = 1, k=0;
		for(int i=0; i<(arr.length-1); i++) {
			if(arr[i].equals(arr[i+1])) {
				count++;
				continue;
			}
			System.out.print(arr[i]+count);
			count=1;
			k = i;
			
		}
		System.out.print(arr[k+1]+(arr.length-(k+1)));
		
	}

}
