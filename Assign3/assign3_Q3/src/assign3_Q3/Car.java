/*Q3. Create an application that calculates your daily driving cost, so that you can estimate how much
money could be saved by car pooling, which also has other advantages such as reducing carbon
emissions and reducing traffic congestion. The application should input the following information
and display the user’s cost per day of driving to work:
a) Total miles driven per day.
b) Cost per gallon of gasoline.
c) Average miles per gallon.
d) Parking fees per day.
e) Tolls per day.*/

package assign3_Q3;

import java.util.Scanner;

public class Car {

		double km;
		double gallon_gasolin;
		double car_avg;
		double parking;
		double toll;
		double total_bill;
		
		Scanner sc=new Scanner(System.in);
		
		public Car() {
			
		}

		public Car(double km, double gallon_gasolin, double car_avg, double parking, double toll) 
		{
			super();
			this.km = km;
			this.gallon_gasolin = gallon_gasolin;
			this.car_avg = car_avg;
			this.parking = parking;
			this.toll = toll;
		}

		public double getKm() {
			return km;
		}

		public double getGallon_Gasolin() {
			return gallon_gasolin;
		}

		public double getCar_avg() {
			return car_avg;
		}

		public double getParking() {
			return parking;
		}

		public double getToll() {
			return toll;
		}

		public void setKm(double km) {
			this.km = km;
		}

		public void setGasolin(double gasolin) {
			this.gallon_gasolin = gasolin;
		}

		public void setCar_avg(double car_avg) {
			this.car_avg = car_avg;
		}

		public void setParking(double parking) {
			this.parking = parking;
		}

		public void setToll(double toll) {
			this.toll = toll;
		}
		
	    public void acceptData()
		{
			System.out.println("Enter Total miles driven per day ");
			km=sc.nextDouble();
			System.out.println("Enter Cost per gallon of gasoline. ");
			gallon_gasolin=sc.nextDouble();
			System.out.println("Enter Average miles per gallon. ");
			car_avg=sc.nextDouble();
			System.out.println("Enter Parking fees per day. ");
			parking=sc.nextDouble();
			System.out.println("Enter Tolls per day. ");
			toll=sc.nextDouble();
			
			
		}
	   public void displayData()
	   {
		   System.out.println("****** Your Bill ******");
		   System.out.println("Total Miles = "+this.km);
		   System.out.println("Cost per gallon of gasoline = "+this.gallon_gasolin);
		   System.out.println("Average miles per gallon = "+this.car_avg);
		   System.out.println("Parking fees per day = "+this.parking);
		   System.out.println("Total Toll = "+this.toll);
	   }
	   public void calculateTotal() {
		   total_bill=((km/car_avg)*gallon_gasolin)+parking+toll;
		   System.out.println("Your Total bill = "+total_bill);
	   }
}
