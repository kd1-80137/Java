package com.sunbeam;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Map<Integer,Student>map=new LinkedHashMap<>();
		Scanner sc=new Scanner(System.in);
		
		int choice;
		do {
			System.out.println("1.Add Student");
			System.out.println("2.Enter Roll No OF Student");
			choice=sc.nextInt();
			
			switch(choice) {
			case 1:
				Student s = new Student();
				s.accept();
				map.put(s.getRollno(), s);
				System.out.println("Student Added Succesfully");
				System.out.println(map);
				
				break;
			case 2:
                System.out.print("Enter the roll no of studentt you want to find=");
                int roll=new Scanner(System.in).nextInt();
                   Student s1=map.get(roll);
                   System.out.println(s1);
				break;

			}
			
				
		}while(choice!=0);

	}

}
