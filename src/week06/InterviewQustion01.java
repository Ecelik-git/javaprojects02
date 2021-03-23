package week06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class InterviewQustion01 {
//create a method which returns 2 int whose multip is the max
	public static void main(String[] args) {
		
		List<Integer> list2 = new ArrayList<>();
		list2.add(12);
		list2.add(7);
		list2.add(3);
		list2.add(11);
		list2.add(8);
		
		System.out.println(maxTwo(list2));

	}
	public static List<Integer> maxTwo(List<Integer> list1){
		List<Integer> result = new ArrayList<>();
		Collections.sort(list1);
		try {
			if(list1.get(0)*list1.get(1)>list1.get(list1.size()-2)*list1.get(list1.size()-1)) {
				result.add(list1.get(0));
				result.add(list1.get(1));
			}else {
				result.add(list1.get(list1.size()-2));
				result.add(list1.get(list1.size()-1));
			}
		}catch(IndexOutOfBoundsException e) {
			System.out.println("there has to be at least 2 elements in the list");
		}
		return result;
	}

}
