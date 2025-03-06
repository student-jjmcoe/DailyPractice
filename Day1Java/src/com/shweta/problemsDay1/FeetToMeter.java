package com.shweta.problemsDay1;

import java.util.Scanner;

public class FeetToMeter {

	public static void main(String[] args) {
		// 1feet = 0.305m
		float f,m;
		Scanner x = new Scanner(System.in);
		System.out.println("Enter value in Feet :");
		f = x.nextFloat();
		
		m = 0.305f*f;
		System.out.println("Meter ="+m);
	}

}
