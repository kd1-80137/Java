package com.app.fruits;

import java.util.Scanner;

public class Fruits {
	private String color;
	private double weight;
	private boolean isFresh=true;
	private String name;
	
	

	Scanner sc=new Scanner(System.in);
	
	public Fruits() {
		
	}
	public Fruits(String color, double weight,boolean isFresh) {
	
		this.color = color;
		this.weight = weight;
		this.isFresh=isFresh;
	}
	
	public String getColor() {
		return color;
	}
	public void setColour(String color) {
		this.color = color;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public boolean getIsFresh() {
		return isFresh;
	}
	public void setIsFresh(boolean isFresh) {
		this.isFresh= isFresh;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void acceptFruits()
	{
		System.out.println("Enter Weight ");
		weight=sc.nextDouble();
		
		System.out.println("Enter Color");
		color=sc.next();
	}
	
	@Override
	public String toString() {
		return "Fruits [color=" + color + ", weight=" + weight + ", isFresh=" + isFresh + "]";
	}
	public void displayFruits()
	{
		System.out.println("Weight Of Fruit = "+this.weight);
		System.out.println("Color Of Fruit = "+this.color);
	}
	
	public String teste() 
	{
	   return "No Specific Teste";	
	}
}









