package com.app.fruits;

import java.util.Scanner;

public class Orange extends Fruits
{
	private String name;

	Scanner sc = new Scanner(System.in);
	
	public Orange() {
		setName("Orange");
		
	}

	public Orange(String name,String color,double weight,boolean isFresh) 
	{
		super(color,weight,isFresh);
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void acceptOranges() {
		super.acceptFruits();
		
	}
	public void displayOrange() {
		super.displayFruits();
		System.out.println("Fruit = "+this.name);
	}
	
	public String teste() 
	{
	   return " Sour ";	
	}

}
	

