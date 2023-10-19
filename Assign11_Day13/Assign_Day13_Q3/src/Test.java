import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Test {

	public static void main(String[] args) {
		Set<Booked>set=new TreeSet<>();
		set.add(new Booked("34",150,4,"Vinod"));
		set.add(new Booked("5",160,3,"Yash"));
		set.add(new Booked("7",123,2,"Dhanraj"));
		set.add(new Booked("80",130,1,"Bablu"));
		set.add(new Booked("30",160,2,"Kalu"));//return false if Duplicate
		
//		for(Book b:set)
//			System.out.println(b);
		
		
		
		Iterator<Booked> itr = set.iterator();
	while(itr.hasNext()) {
		Booked b1;
		b1=itr.next();
			System.out.println(b1);
		}
	}

}//in this Give Sorted Value and Remove Duplicate Value which Is enter 
//At Last.
