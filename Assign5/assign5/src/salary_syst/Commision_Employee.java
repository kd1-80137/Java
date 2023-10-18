package salary_syst;

import java.util.Scanner;

public class Commision_Employee extends Employee {
	private int grossSales;
	private float comm;
	
	public Commision_Employee()
	{
		super();
	}

	public Commision_Employee(int grossSales, float comm) 
	{
		super();
		this.grossSales = grossSales;
		this.comm = comm;
	}
	
	public int getGrossSales() {
		return grossSales;
	}

	public void setGrossSales(int grossSales) {
		this.grossSales = grossSales;
	}

	public float getComm() {
		return comm;
	}

	public void setComm(float comm) {
		this.comm = comm;
	}

	@Override
	public void acceptData() {
		// TODO Auto-generated method stub
		super.acceptData();
		System.out.println("Enter Gross Sales ");
		grossSales= new Scanner(System.in).nextInt();
		
		System.out.println("Enter Commision ");
		comm= new Scanner(System.in).nextFloat();
		
	}
	@Override
	public void displayData() {
		// TODO Auto-generated method stub
		super.displayData();
		System.out.println("Gross Sale "+this.grossSales);
		System.out.println("Gross Sale "+this.comm);
		
	}
	
	@Override
	public void calculateSalary() {
		// TODO Auto-generated method stub
		System.out.println("Commision Employe Salary = "+(this.comm*this.grossSales));
	}

	@Override
	public String toString() {
		return "Commision_Employee [grossSales=" + grossSales + ", comm=" + comm + ","+super.toString()+"]";
	}
	
}
