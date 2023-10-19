
package com.sunbeam;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import javax.management.Descriptor;

public class Test {

	public static void main(String[] args) {
	
		
		
		BookComparator bc= new BookComparator(); 
		TreeSet<Book>set=new TreeSet<>(bc);
		
		set.add(new Book("02",150,4,"Vinod"));
		set.add(new Book("103",160,3,"Yash"));
		set.add(new Book("105",123,2,"Dhanraj"));
		set.add(new Book("104",130,1,"Bablu"));
		set.add(new Book("104",160,2,"Kalu"));//return false if Duplicate
		
		
		Iterator<Book> itr = set.descendingIterator();
		while(itr.hasNext()) {
		Book b1;
		b1=itr.next();
			System.out.println(b1);
		}
	}
	
	

}//in this Give Sorted Value and Remove Duplicate Value which Is enter 
//At Last.
