package com.app.fruits;

import java.util.Scanner;

public class Mango extends Fruits
{
	private String name;
	
	Scanner sc=new Scanner(System.in);
	public Mango() 
	{
		setName("Mango");
	}

	public Mango(String name,String color,double weight,boolean isFresh) {
		super(color,weight,isFresh);
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Scanner getSc() {
		return sc;
	}

	public void setSc(Scanner sc) {
		this.sc = sc;
	}

	public void acceptMango()
	{
		super.acceptFruits();
	
	}
	public void displayMango() {
		super.displayFruits();
		System.out.println("Fruit = "+this.name);
	}
	
	public String teste() 
	{
	   return " Sweet ";	
	}
}
