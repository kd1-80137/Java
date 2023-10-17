package tester;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int index;
		double dist;
		
		System.out.println("Enter No OF Index ");
		index=sc.nextInt();
		
		
		Point2D [] points=new Point2D[index];
		for(int i=0;i<points.length;i++)
		{
		points[i]=new Point2D();
		System.out.println("Enter The value for Point "+(i+1));
			points[i].acceptCord();
		}

		int choice=1;
		while(choice!=4)
		{
			System.out.println("1. Display details of a specific point");
			System.out.println("2. Display x, y co-ordinates of all points");
			System.out.println("3. 2 indices for the points , validate the indices");
			System.out.println("4. Exit");
			choice=sc.nextInt();	
			
			switch (choice) {
			case 1:
				System.out.println("Enter The Index No");
				int n=sc.nextInt();
				points[n].displayData();
				break;
			case 2:
				System.out.println("Display x, y co-ordinates of all points");
				for(int i=0;i<points.length;i++)
				{
					points[i].displayData();
				}
				break;
			case 3:
				System.out.println("Enter The Index No for Point 1");
				int p1=sc.nextInt();
				System.out.println("Enter The Index No for Point 2");
				int p2=sc.nextInt();
				
				dist = points[p1].calculateDist(points[p2]);
				System.out.println("Calculate Distance = "+dist);
				
				break;
			default:
				break;
			}
		}
	}

}

