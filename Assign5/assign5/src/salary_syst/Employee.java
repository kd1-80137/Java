package salary_syst;

import java.util.Scanner;

abstract public class Employee {
	private String first_name;
	private String last_name;
	private int ssn;  //Social Security Number
	
	abstract public void calculateSalary();
	
	public Employee() {
		super();
	}

	public Employee(String first_name, String last_name, int ssn) {
		super();
		this.first_name = first_name;
		this.last_name = last_name;
		this.ssn = ssn;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public int getSsn() {
		return ssn;
	}

	public void setSsn(int ssn) {
		this.ssn = ssn;
	}
	
	
	public void acceptData()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Frist Name ");
		first_name=sc.next();
		System.out.println("Enter Last Name ");
		last_name=sc.next();
		System.out.println("Enter Your Social Security Number ");
		ssn=sc.nextInt();
		
	}
	
	public void displayData() {
		System.out.println("First Name "+this.first_name);
		System.out.println("Last Name "+this.last_name);
		System.out.println("Social Security Number "+this.ssn);
	}

	@Override
	public String toString() {
		return "Employee [first_name=" + first_name + ", last_name=" + last_name + ", ssn=" + ssn + "]";
	}
	
	
	

}
