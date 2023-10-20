package com.sunbeam;

 interface Num<T> {
	boolean compara(T x,T y);

}
public class Number1{
	public static  <Double> int countIf(Double[] arr, Double key, Num<Double> c)
	{
		int cnt=0;
		for(Double ele :arr) {
			if(c.compara(ele, key))
				cnt++;
		}
		return cnt;
	}
	
	public static void main(String[]args) 
	{
		Double [] arr = {1.1, 7.7, 9.9, 2.2, 5.5, 1.1, 6.6};
		Double key = 1.1;
		int cnt = countIf(arr, key, (e,k)-> e.equals(k));
		System.out.println("Count = " + cnt); // 4 (because 4 elements in array are greater than given key i.e. 50)
	}

	
	
}