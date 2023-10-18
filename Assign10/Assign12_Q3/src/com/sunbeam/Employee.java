package com.sunbeam;

import java.util.Objects;
import java.util.Scanner;

public class Employee {

	int id;
	int age;
	String name;
	
	public Employee() {
		super();
	}

	public Employee(int id, int age, String name) {
		super();
		this.id = id;
		this.age = age;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", age=" + age + ", name=" + name + "]";
	}
	
	void accept() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Id");
		id=sc.nextInt();
		System.out.println("Enter Your Age");
		age=sc.nextInt();
		System.out.println("Enter Your Name");
		name=sc.next();
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return id == other.id;
	}


	
	
	
	
	
	
	
	
	
}
