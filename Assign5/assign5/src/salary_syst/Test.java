package salary_syst;

public class Test {
public static void main(String[]args)
{
	int choice;
	Employee employee;
	{
	System.out.println("1. Salarid Employee");
	System.out.println("2. Hourly Employee");
	System.out.println("3. Commision Employee");
	System.out.println("4. Commision Employee");
	System.out.println("5. BasePlus Employee");	
	
	}
	employee=new Hourly_Employee();
	employee.acceptData();
	employee.calculateSalary();
	employee.displayData();
	
	
}
}
