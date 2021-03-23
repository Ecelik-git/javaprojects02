package week06;

import java.util.ArrayList;

import java.util.List;

public class DeleteElementWithA {

	public static void main(String[] args) {
		/*Write a program that deletes those with the letter 'a' or ‘A’ in it. 
		* INPUT : list1={"Ali","Veli","Ayse","Fatma","Omer"} 
		* OUTPUT : [Veli,Omer]
		*/
		
		List<String> list = new ArrayList<>();
		list.add("Ali");
		list.add("Veli");
		list.add("Ayse");
		list.add("Fatma");
		list.add("Omer");
		incrementArray(list);
		
		String arr[]= {"Ali","Veli","Ayse","Fatma","Omer"};
		incrementArray(arr);

	}
	public static void incrementArray(List<String> list1) {
		list1.removeIf(w -> w.contains("A"));
		list1.removeIf(w -> w.contains("a"));
		System.out.println(list1);
	}
	public static void incrementArray(String arr[]) {
		List<String> list2 = new ArrayList<>();
		for(int i =0; i<arr.length; i++) {
			if(arr[i].contains("A") || arr[i].contains("a")) {
				continue;
			}else {
				list2.add(arr[i]);
			}
		}
		System.out.println(list2);
	}

}
