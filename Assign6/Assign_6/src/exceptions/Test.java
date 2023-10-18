package exceptions;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		
		String s= sc.next();
		try 
		{
			if(s.length()>80)
				{
				throw new ExceptionLineTooLong(12,"Too many char...");
				}
				
				System.out.println("The String is"+s);
			
			}
		catch (ExceptionLineTooLong e) {
			System.out.println(e.errorno+" "+e.errormessage);
			
		}
		

	}

}
