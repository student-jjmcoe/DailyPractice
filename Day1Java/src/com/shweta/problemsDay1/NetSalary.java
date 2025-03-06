package com.shweta.problemsDay1;

import java.util.Scanner;

public class NetSalary {

	public static void main(String[] args) {
		float ns,bs,hra,ta,pf;
		Scanner x = new Scanner(System.in);
		System.out.println("Enter Base Salary :");
		bs = x.nextFloat();
		
		hra = (bs*20)/100;
		ta = (bs*10)/100;
		pf = (bs*15)/100;
		
		ns = bs + hra + ta - pf;
		System.out.println("Net Salary="+ns);
	}

}
