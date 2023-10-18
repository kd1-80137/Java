package com.sunbeam;
import java.util.*;


public class SalariedEmp  extends Empoloyee{
	private double weeklysal;

	public SalariedEmp(String fname, String lname, double salary, double weeklysal) {
		super(fname, lname, salary);
		this.weeklysal = weeklysal;
	}
	public SalariedEmp ()
	{
		
	}
	public double getWeeklysal() {
		return weeklysal;
	}
	public void setWeeklysal(double weeklysal) {
		this.weeklysal = weeklysal;
	}
	public void accept()
	{
		super.accept();
		System.out.println("Enter weekley salary");
		this.weeklysal=new Scanner(System.in).nextDouble();
	}
	
	@Override
	public String toString() {
		return (super.toString()+"  Weekly salary =  "+this.weeklysal ) ;
	}
	public double calculateTotalSalary()
	{
		super.setSalary(0);
		return this.weeklysal;
	}
	
	

}

