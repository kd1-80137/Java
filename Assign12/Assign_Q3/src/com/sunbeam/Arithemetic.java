package com.sunbeam;

import java.util.Scanner;

public interface Arithemetic {
	double calc(double a ,double b);

}

class Calculate{
	
	static void calculate(double num1, double num2, Arithemetic op) 
	{
		double result = op.calc(num1, num2);
		System.out.println("Result: "+result);
		}
	
	public static void main(String[]args) {
		
		Scanner sc=new Scanner(System.in);
		int choice=0;
		double x;
		double y;
		
		do {
			System.out.println("Enter First No");
			x=sc.nextDouble();
			System.out.println("Enter Second No");
			y=sc.nextDouble();
			
			System.out.println("1.Addition");
			System.out.println("2.Subs");
			System.out.println("3.Multi");
			System.out.println("4.Div");
			choice=sc.nextInt();
			
			switch(choice) {
			case 1:
				
				calculate(x,y,(t,u)->t+u);
				break;
				
				case 2:
					
					calculate(x,y,(t,u)->t-u);
					break;
				
				case 3:
					
					calculate(x,y,(t,u)->t*u);
					break;
				case 4:
					
					calculate(x,y,(t,u)->t/u);
					break;
			
					default:
						System.out.println("Enter Valid Input!!!!!");
			}
		}while(choice!=0);
	}
}