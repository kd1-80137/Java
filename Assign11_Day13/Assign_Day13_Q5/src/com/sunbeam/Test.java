
package com.sunbeam;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class Test {

	public static void main(String[] args) {

		HashMap<String, Book> map = new HashMap<>();

		Book b1 = (new Book("02", 150, 4, "Vinod"));
		Book b2 = (new Book("103", 160, 3, "Yash"));
		Book b3 = (new Book("105", 123, 2, "Dhanraj"));
		Book b4 = (new Book("104", 130, 1, "Bablu"));
		Book b5 = (new Book("104", 160, 2, "Kalu"));// return false if Duplicate

		map.put(b1.getIsbn(), b1);
		map.put(b2.getIsbn(), b2);
		map.put(b3.getIsbn(), b3);
		map.put(b4.getIsbn(), b4);
		map.put(b5.getIsbn(), b5);

		Set<String>keys=map.keySet();
		System.out.println("Keys :"+keys);
		
		Collection<Book>values=map.values();
		System.out.println("Valus:"+values);
		
		Set<Entry<String,Book>>entries=map.entrySet();
		for(Entry<String,Book> entry:entries) {
			System.out.println(entry.getKey()+"  "+entry.getValue());
		}
		
		
		
		
		
//		Iterator<Book> itr = set.descendingIterator();
//		while (itr.hasNext()) {
//			Book b1;
//			b1 = itr.next();
//			System.out.println(b1);
		//}
	}

}// in this Give Sorted Value and Remove Duplicate Value which Is enter
//At Last.
