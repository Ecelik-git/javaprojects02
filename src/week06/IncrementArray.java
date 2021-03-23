package week06;

import java.util.Arrays;

public class IncrementArray {

	public static void main(String[] args) {
		/* 
		* Create an int array with 5 elements. 
		int [] arr = {1, 2, 3, 4, 5}; 
		* Print the elements of the Array on console. 
		* Increment all elements of array and print array on console.(use for loop) 
		int [] arr = {2, 3, 4, 5, 6}; 
		* Increment all elements of array again and print array on console.(use foreach loop) 
		int [] arr = {3, 4, 5, 6, 7}; 
		*/
		int [] arr = {1, 2, 3, 4, 5}; 
		incrementArray(arr);

	}
	public static void incrementArray(int arr[]) {
		System.out.println(Arrays.toString(arr));
		for(int i = 0; i<arr.length; i++) {
			arr[i]= arr[i]+1;
		}
		System.out.println(Arrays.toString(arr));
		for(int w : arr) {
			w +=1;
			System.out.print(w+" ");
		}
	}

}
