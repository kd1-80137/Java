package com.sunbeam;

import java.util.Objects;
import java.util.Scanner;

public class Student {

	private int rollno;
	private String name;
	private int age;
	private float per;
	
	Scanner sc=new Scanner(System.in);
	
	public Student() 
	{
		
	}

	public Student(int rollno, String name, int age, float per) 
	{
		super();
		this.rollno = rollno;
		this.name = name;
		this.age = age;
		this.per = per;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public float getPer() {
		return per;
	}

	public void setPer(float per) {
		this.per = per;
	}
	
	public void accept() {
		System.out.println("Enter Student Name");
		name=sc.next();
		System.out.println("Enter Student RollNo");
		rollno=sc.nextInt();
		System.out.println("Enter Student Age");
		age=sc.nextInt();
		System.out.println("Enter Student Precentage");
		per=sc.nextFloat();
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", age=" + age + ", per=" + per + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(rollno);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return rollno == other.rollno;
	}

	
	
	
	
	
}
