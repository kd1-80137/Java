package com.sunbeam;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Test {

	public static void main(String[] args) {
		Set<Book>set=new HashSet<>();
		set.add(new Book("102",150,4,"Vinod"));
		set.add(new Book("63",160,3,"Yash"));
		set.add(new Book("82",123,2,"Dhanraj"));
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

}//Using Hash Code And Equals to Method in it remove duplicate 
//which is inserted At last.
//Gives random Out pUt
