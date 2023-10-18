package salary_syst;

import java.util.Scanner;

public class BasePlus_Commision_Employee extends Commision_Employee {
	private double baseSalary;

	public BasePlus_Commision_Employee() {
		super();
	}

	public BasePlus_Commision_Employee(double baseSalary) {
		super();
		this.baseSalary = baseSalary;
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}
	
	
	@Override
	public void acceptData() {
		// TODO Auto-generated method stub
		super.acceptData();
		System.out.println("Enter Basic Salary");
		baseSalary=new Scanner(System.in).nextDouble();
	}

	
	@Override
	public void displayData() {
		// TODO Auto-generated method stub
		super.displayData();
		
	}
	@Override
	public void calculateSalary() {
		// TODO Auto-generated method stub
		super.calculateSalary();
		System.out.println("Total Salary = "+((getComm()*getGrossSales())+this.baseSalary));
	}
}
