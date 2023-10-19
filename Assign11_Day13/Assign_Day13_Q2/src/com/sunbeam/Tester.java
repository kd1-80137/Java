
package com.sunbeam;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Tester {

	public static void main(String[] args) {
		Set<Book>set=new LinkedHashSet<>();
		set.add(new Book("02",150,4,"Vinod"));
		set.add(new Book("103",160,3,"Yash"));
		set.add(new Book("105",123,2,"Dhanraj"));
		set.add(new Book("104",130,1,"Bablu"));
		set.add(new Book("104",160,2,"Kalu"));//return false if Duplicate
		
//		for(Book b:set)
//			System.out.println(b);
		
		
		
		Iterator<Book> itr = set.iterator();
	while(itr.hasNext()) {
		Book b1;
		b1=itr.next();
			System.out.println(b1);
		}
	}

}//in this Give Sorted Value and Remove Duplicate Value which Is enter 
//At Last.
