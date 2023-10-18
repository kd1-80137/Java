package com.sunbeam;
class GenericBox<T extends Empoloyee>
{
	private T obj ;
	
	public void setObj(T obj)
	{
		this.obj=obj;
	}
	public T getObj()
	{
		return this.obj;
	}
	public void accept()
	{
		obj.accept();
	}
	public void display()
	{
		 System.out.println(obj.toString());
	}
	public void calculateSalary()
	{
	    System.out.println("Total Salary = "+obj.calculateTotalSalary());
	}
}

public class Program01 {
	public static void main(String[] args)
	{
	   HourEmp e = new HourEmp();
		GenericBox<Empoloyee> b1= new GenericBox();
		b1.setObj(e);
		b1.accept();
		b1.display();
		b1.calculateSalary();
		
	}

}
