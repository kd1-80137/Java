package com.app.fruits;

import java.util.Scanner;

public class Apple extends Fruits{
	private String name;

	Scanner sc= new Scanner(System.in);
	
	public Apple() {
		setName("Apple");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Apple(String name,String color,double weight,boolean isFresh) {
		super(color,weight,isFresh);
		this.name = name;
	}
	
	public void displayApple() {
		super.displayFruits();
		System.out.println("Fruit = "+this.name);
	}
	public void acceptApple() {
		super.acceptFruits();
		System.out.println("Enter Fruit Name");
		name=sc.next();
	}
	
	public String teste() 
	{
	   return " Sweet n Sour ";	
	}
	
	
	

}
