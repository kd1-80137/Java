package com.app.fruits;

import java.util.Scanner;

public class Tester {
	public static void main(String[]args) {
		
		int index;
		int counter = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter No Of Fruits You Want to Add In Basket");
		index=sc.nextInt();
		
		Fruits[] fruits=new Fruits[index];
		

		
		
		
		int choice=1;
		while(choice!=0)
		{
			System.out.println("0. Exit");
			System.out.println("1. Add Mango");
			System.out.println("2. Add Orange");
			System.out.println("3. Add Apple");
			System.out.println("4. Fruits in Basket");
			System.out.println("5. Fruits Details");
			System.out.println("6. Test of Stale Fruit");
			System.out.println("7. Fruits Details");
			System.out.println("8. Stale Fruits");
			
			choice=sc.nextInt();
			
			switch (choice){
				
			case 1:
				if(counter<index)
				{
				Fruits mango = new Mango();
				mango.acceptFruits();
				fruits[counter]=mango;
				counter++;
				}
				else
				{
					System.out.println("**** Your Basket If Full ****");
				}
				break;
			case 2:
				if(counter<index)
				{
				Fruits orange = new Orange();
				orange.acceptFruits();
				fruits[counter]=orange;
				counter++;
				}
				else
				{
					System.out.println("**** Your Basket If Full ****");
				}
					//System.out.println("Enter No OF Apple");
				break;
			case 3:
				if(counter<index)
				{
				Fruits orange = new Orange();
				orange.acceptFruits();
				fruits[counter]=orange;
				counter++;
				}
				else
				{
					System.out.println("**** Your Basket If Full ****");
				}
				break;
			case 4:
				System.out.println("All Fruits In Basket");
				for(Fruits fruit:fruits)
				{ 
					System.out.println("Fruit ="+fruit.getName());
					System.out.println(fruit.toString()); 
					
				}
					break;
					
			case 5:
				for(Fruits fruit:fruits)
				{
					if(fruit.getIsFresh())
					{
						System.out.println(fruit.toString()+" "+ fruit.teste());
					}
				}
				break;
			case 6:
				for(Fruits fruit:fruits)
				{
					if(!fruit.getIsFresh())
					{
						System.out.println(fruit.toString()+" "+ fruit.teste());
					}
				}
				break;
			case 7:
				int x;
				for(Fruits fruit:fruits)
				{
					System.out.println("Do you want to mark as a Stale");
					System.out.println("1. Yes, 2.NO");
					x=sc.nextInt();
							if(x==1)
							{
								fruit.setIsFresh(false);
								System.out.println("Successfully Mark As a Stale");
							}
							
				}
				break;
			case 8:
				for(Fruits fruit:fruits)
				{
					if(fruit.teste()=="Sour")
					{
						fruit.setIsFresh(false);
						System.out.println("Successfully Mark As a Stale");
					}
				}
				
				
				}
				
			}
		}
		
		
	}

