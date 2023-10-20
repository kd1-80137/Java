package com.sunbeam;

import java.io.ObjectInputStream.GetField;

interface Emp {
	double getSal();

	default double calcIncentives() {
		return 0.0;
	}

	static double calcTotalIncome(Emp[] arr) {
		double total = 0.0;
		for (Emp e : arr)
			total += e.getSal() + e.calcIncentives();
		return total;
	}
}

class Manager implements Emp {
	double bs, da;

	public Manager() {
		super();
	}

	public Manager(double bs, double da) {
		super();
		this.bs = bs;
		this.da = da;
	}

	@Override
	public double getSal() {
		// TODO Auto-generated method stub
		return bs + da;
	}

	@Override
	public double calcIncentives() {
		// TODO Auto-generated method stub
		return 0.2 * bs;
	}
}

class Cleark implements Emp {
	double sal;

	public Cleark() {
		super();
	}

	public Cleark(double sal) {
		super();
		this.sal = sal;
	}

	@Override
	public double getSal() {
		// TODO Auto-generated method stub
		return sal;
	}
}

class Labor implements Emp {
	double hrs, rate;

	public Labor() {
		super();
	}

	public Labor(double hrs, double rate) {
		super();
		this.hrs = hrs;
		this.rate = rate;
	}

	@Override
	public double getSal() {
		// TODO Auto-generated method stub
		return hrs * rate;
	}

	@Override
	public double calcIncentives() {
		if (hrs > 300)
			return 0.05 * hrs * rate;
		return 0.0;
	}
}

class Main {
	public static void main(String[]args) {
		Emp[] arr=new Emp[3];
		arr[0]=new Manager(1220,5000);
		arr[1]=new Cleark(15000);
		arr[2]=new Labor(305,200);
		double totalIncome=Emp.calcTotalIncome(arr);
		System.out.println(totalIncome);
	}
}
