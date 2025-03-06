package com.shweta.problemsDay1;

import java.util.Scanner;

public class FeetToCentimeter {

	public static void main(String[] args) {
		// 1feet = 30.5cm
		float f,cm;
		Scanner x = new Scanner(System.in);
		
		System.out.println("Enter value in feet :");
		f = x.nextFloat();
		
		cm = 30.5f*f;
		System.out.println("Centimeter ="+cm);

	}

}
