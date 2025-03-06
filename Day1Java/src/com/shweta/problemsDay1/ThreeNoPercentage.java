package com.shweta.problemsDay1;

import java.util.Scanner;

public class ThreeNoPercentage {

	public static void main(String[] args) {
		float a,b,c,t,p;
		Scanner x = new Scanner(System.in);
		System.out.println("Enter three numbers:");
		a = x.nextFloat();
		b = x.nextFloat();
		c = x.nextFloat();
		
		t = a+b+c;
		System.out.println("Total ="+t);
		
		p = t/3 ;
		System.out.println("Percentage ="+p);
	}

}
