package que2;

import java.util.Scanner;

/*2. Accept 2 double values from User (using Scanner). Check data type. If arguments are not
doubles, supply suitable error message & terminate.
If numbers are double values, print its average.*/

public class ques2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the two no for avg=");
		double num1;
		double num2;
		num1=sc.nextDouble();
		num2=sc.nextDouble();
		if(sc.hasNextDouble()) {
			 double avg=(num1 + num2)/2;
			 System.out.println("avg of two number="+avg);
		}
		else
			System.out.println("invalid input");
		
		
		
		
		

	}

}