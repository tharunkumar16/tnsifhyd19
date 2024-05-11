package com.si.csec;

public class Ipl {
	String batsman="KL RAHUL";
	static String bowler="Siraj";
	void display()
	{
		System.out.println("KL Rahul is a good batsman");
	}
	public static String display1()
	{
		return "cricket";
	}
	public static void main(String[] args) {
		Ipl i1=new Ipl();
		System.out.println(i1.batsman);
		System.out.println(Ipl.bowler);
		System.out.println(bowler);
		i1.display();
		Ipl.display1();
	}
	

}
