package salary_syst;

import java.util.Scanner;

public class Hourly_Employee extends Employee {

	private int hour;
	private double wages;

	public Hourly_Employee()
	{
		super();
	}

	public Hourly_Employee(int hour, double wages) {
		super();
		this.hour = hour;
		this.wages = wages;
	}
	
	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public double getWages() {
		return wages;
	}

	public void setWages(double wages) {
		this.wages = wages;
	}

	public void acceptData() {
		super.acceptData();
		System.out.println("Enter Working Hours ");
		this.hour = new Scanner(System.in).nextInt();

		System.out.println("Enter Wages ");
		this.wages = new Scanner(System.in).nextDouble();
	}

	public void displayData() {
		super.displayData();
		System.out.println("Working Hour "+this.hour);
		System.out.println("Wages "+this.wages);
	}
	
	public void calculateSalary()
	{
		if (this.hour<40) 
		{
			System.out.println("Your Salary = "+(this.wages*this.hour));
		}
		else if(this.hour>40)
		{
			System.out.println("Your Salary = "+((40*this.wages)+(this.hour-40)*(this.wages*1.5)));	}	
	}

	@Override
	public String toString() {
		return "Hourly_Employee [hour=" + hour + ", wages=" + wages + ","+super.toString()+"]";
	}

}
