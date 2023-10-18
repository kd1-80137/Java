package com.sunbeam;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Tester {

	public static int menu() {

		int choice;
		Scanner sc = new Scanner(System.in);
		System.out.println("1.Add");
		System.out.println("2.Delete");
		System.out.println("3.Find Name");
		System.out.println("4.Sort Epmloyee Id");
		System.out.println("5.Edit Employee");
		choice = sc.nextInt();
		return choice;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		EmployeeComparator ec = new EmployeeComparator();

		List<Employee> list = new LinkedList<Employee>();

		int choice;

		do {
			switch (choice = menu()) {
			case 1:// add element
				Employee e = new Employee();
				e.accept();
				list.add(e);
				System.out.println("Added Succesfully");
				break;
			case 2:// Delete Id
				System.out.println("Enter Id");
				int i = sc.nextInt();
				Employee e1 = new Employee();
				e1.setId(i);
				if (list.contains(e1)) {
					int index = list.indexOf(e1);
					e1 = list.get(index);
					list.remove(index);
				} else {
					System.out.println("Id Not Found ");
				}
				break;
			case 3:// find Element
			  { 
				Employee e2 = new Employee();
				System.out.println("Enter Name Which You Want");
				String name = sc.next();
                e2.setName(name);
				Iterator<Employee> ptr = list.iterator();
				while (ptr.hasNext()) 
				{
					Employee emp = ptr.next();
					if(emp.getName().equals(e2.getName())) 
					{
					     System.out.println(emp);
					     break;
					}
				}
			  }
				
				break;
			case 4:// Sort by EmpID
			{
				Collections.sort(list, ec);
				System.out.println("Employee List After Sort");
				Iterator<Employee> itr = list.iterator();
				while (itr.hasNext()) {
					Employee e3 = itr.next();
					System.out.println(e3);
				}
			}
				break;
			case 5:// edit the employee
				System.out.println("Enter Id That You Want To Modify ");
				int id = sc.nextInt();
				Employee key = new Employee();
				key.setId(id);
				if (list.contains(key)) {
					int index = list.indexOf(key);
					Employee e4 = list.get(index);
					System.out.println("Enter Updated Name");
					String name = sc.next();
					e4.setName(name);

					System.out.println("Enter Updated Age");
					int age = sc.nextInt();
					e4.setAge(age);

					System.out.println("Enter Updated Id");
					int Id = sc.nextInt();
					e4.getId();
					break;

				}

			}
		} while (0 != choice);
		// TODO Auto-generated method stub

	}

}
