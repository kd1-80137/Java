package salary_syst;

import java.util.Scanner;

public class Salaried_Employee extends Employee {
	private double weeklysalary;

	public Salaried_Employee() {
		super();
	}

	public Salaried_Employee(double weeklysalary) {
		super();
		this.weeklysalary = weeklysalary;
	}

	public double getWeeklysalary() {
		return weeklysalary;
	}

	public void setWeeklysalary(double weeklysalary) {
		this.weeklysalary = weeklysalary;
	}

	@Override
	public void acceptData() {
		super.acceptData();
		System.out.println("Enter Weeliy Salary = ");
		this.weeklysalary = new Scanner(System.in).nextDouble();
	}

	@Override
	public void displayData() {
		super.displayData();
		System.out.println("Weekly Salary = " + this.weeklysalary);
	}

	public void calculateSalary() {
		System.out.println("Total Salary Of Weekly Emplloye " + this.weeklysalary);

	}

	@Override
	public String toString() {
		return "Salaried_Employee [weeklysalary=" + weeklysalary + "," + super.toString() + "]";
	}

}
