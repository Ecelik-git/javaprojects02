package week06;

import java.util.ArrayList;
import java.util.List;

public class InterviewQuestion02 {
	public static void main(String[] args) {
		//[3, 2, 3, 5, 5, 1, 7, 1, 7]
		//return non repeated element
		List<Integer> list1 = new ArrayList<>();
		list1.add(3);
		list1.add(3);
		list1.add(4);
		list1.add(5);
		list1.add(4);
		list1.add(1);
		list1.add(2);
		list1.add(3);
		
		
		nonRepeatedElements(list1);

	}
	public static void nonRepeatedElements(List<Integer> list1){
		List<String> result = new ArrayList<>();
		String str = "";
		for(int w: list1) {
			str +=w;
		}
		
		for (int i = 0; i<str.length(); i++) {
			if(str.indexOf(str.charAt(i))==str.lastIndexOf(str.charAt(i))) {
				result.add(str.substring(i, i+1));
			}
		}
		System.out.println(result);
		
		
	}
}
