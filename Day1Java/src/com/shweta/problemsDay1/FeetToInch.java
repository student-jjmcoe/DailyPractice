package com.shweta.problemsDay1;

import java.util.Scanner;

public class FeetToInch {

	public static void main(String[] args) {
		// 1feet = 12 inch
		float f,i;
		Scanner x = new Scanner(System.in);
		System.out.println("Enter feet value :");
		f = x.nextFloat();
		
		i = f * 12;
		System.out.println("Inch ="+i);

	}

}
