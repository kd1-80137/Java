package com.app.geometry;

import java.util.Scanner;

public class Point2D {
	int x;
	int y;
	String s;
	public Point2D() {

	}

	public Point2D(int x, int y) {
		super();
		this.x = x;
		this.y = y;
		
	}
	public void acceptCord() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter X Codrd");
		x=sc.nextInt();
		System.out.println("Enter Y Codrd");
		y=sc.nextInt();
		}
	
	public String getDetails() 
	{
		String s;
		s="co-ordinate x= " +x + " Co-ordinate y "+y;
		return s;
	}

	public boolean isEqual(Point2D s) {
		boolean flag=false;
		if(this.x==s.x && this.y==s.y)
		{
			flag=true;
		}
		return flag;
		
	}
	public double calculateDist(Point2D s) {
		double x=this.x-s.x;
		double y=this.y-s.y;
		return Math.sqrt(Math.pow(x,2)+(Math.pow(y, 2)));
	}
	
	

}
