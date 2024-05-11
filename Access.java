package com.si.indu;


public class Access {

	public static void main(String[] args) {
		Normal n1=new Normal();
		System.out.println(n1.batsman);
		System.out.println(Normal.bowler);
		n1.display();
		Normal.display1();
	}

}
