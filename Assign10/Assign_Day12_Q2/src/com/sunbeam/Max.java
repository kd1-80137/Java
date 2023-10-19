package com.sunbeam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Max {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();

		Collections.addAll(list, "Adhitya", "Bull", "Chandu", "Dipu", "Elephant", "Fruits");
		System.out.println("Original List: " + list);

		Collections.shuffle(list);
		System.out.println("Shuffled List: " + list);

		Collections.sort(list);
		System.out.println("Sorted List: " + list);

		Collections.reverse(list);
		System.out.println("Reveresed List: " + list);

		List<String> unmodList = Collections.unmodifiableList(list);
		// unmodList.add("X"); // throw UnsupportedOperationException

		List<String> syncList = Collections.synchronizedList(list);
		// syncList is synchronized/thread-safe collection
		// i.e. can be accessed by multiple threads simultaneously

		
		
		String maxVal = Collections.max(list);
		System.out.println("Max Val: " + maxVal);
		
		class MaxComparato implements Comparator<String>{
			
			@Override
			public int compare(String arg0, String arg1) {
				// TODO Auto-generated method stub
				int diff= arg0.length()-arg1.length();
				return diff;
			
			}
				
			}
		
		MaxComparato mc = new MaxComparato();
		
		String MaxLength = Collections.max(list,mc);
		System.out.println(MaxLength);
		
	
	}

}
