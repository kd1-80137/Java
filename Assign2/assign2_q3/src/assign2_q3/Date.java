/*Create a class called Date that includes three fields—a month (type int), a day (type int) and a
year (type int). Provide a constructor that initializes the three instance variables and assumes that
the values provided are correct. Provide a set and a get method for each instance
variable. Provide a method displayDate that displays the month, day and year separated by forward
slashes (/). Write a test application named DateTest that demonstrates class Date’s capabilities.*/

package assign2_q3;
import java.util.Scanner;
public class Date {
	int month;
	int day;
	int year;
	Scanner sc = new Scanner(System.in);
	public Date() {
		
	}
	public Date(int month, int day, int year) {
		super();
		this.month = month;
		this.day = day;
		this.year = year;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	void acceptDate()
	{
		System.out.println(" Enter Month ");
		month = sc.nextInt();
		
		System.out.println(" Enter Day ");
		day = sc.nextInt();
		
		System.out.println(" Enter Year ");
		year = sc.nextInt();
	}
	void displayDate()
	{
		System.out.println("Todays Date Is "+month+"/"+day+"/"+year);
	}
	
}
