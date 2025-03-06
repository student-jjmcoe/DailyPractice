package com.shweta.problemsDay1;

import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args) {
		float p,n,r,s;
		Scanner x = new Scanner(System.in);
		System.out.println("Enter principle :");
		p = x.nextFloat();
		System.out.println("Enter time period in years :");
		n = x.nextFloat();
		System.out.println("Rate of Simple Interest :");
		r = x.nextFloat();
		s = (p*r*n)/100;
		System.out.println("Simple Interest ="+s);
	}

}
