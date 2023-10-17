/*Q1. (Credit Limit Calculator)
Develop a Java application that determines whether any of several department-store customers has
exceeded the credit limit on a charge account.
For each customer,the following facts are available:
a) account number
b) balance at the beginning of the month
c) total of all items charged by the customer this month
d) total of all credits applied to the customer’s account this month
e) allowed credit limit.
The program should input all these facts as integers, calculate the new balance (= beginning
balance+ charges – credits), display the new balance and determine whether the new balance
exceeds the customer’s credit limit. For those customers whose credit limit is exceeded, the
//program should display the message "Credit limit exceeded"*/

package credit_limit_calculator.com;

import java.util.Scanner;

public class limit_calc 
{
	
		private int accountno;
		private int beginning_balance;
		private int charges;
		private int total_cradit;
		private int newbalance;
		
		Scanner sc = new Scanner(System.in);
				
		public limit_calc(int accountno, int beginning_balance, int charge, int total_cradit) 
		{
			this.accountno = accountno;
			this.beginning_balance = beginning_balance;
			this.charges = charges;
			this.total_cradit = total_cradit;
		}

		public limit_calc()
		{
			
		}
		
		void acceptData()
		{
			System.out.println("Enter your Account Number ");
			accountno=sc.nextInt();
			System.out.println("Begining Balance ");
			beginning_balance=sc.nextInt();
			System.out.println("Charges ");
			charges=sc.nextInt();
			System.out.println("Total Cradit ");
			total_cradit=sc.nextInt();
		}
		void displayDate() {
			System.out.println("Enter your Account Number "+accountno);
			System.out.println("Begining Balance "+beginning_balance);
			System.out.println("Charge "+charges);
			System.out.println("Total Cradit "+total_cradit);
			
		}
		void newBalance()
		{
			newbalance=beginning_balance+charges-total_cradit;
			if(newbalance<=20000)
			{
				System.out.print("Your New Balance = "+newbalance);
			}
			else
			{
				System.out.println("**** Your Limit Exceeded ***");
			}
		}
		
		
}
		
		
		