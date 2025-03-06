package com.shweta.problemsDay1;

import java.util.Scanner;

public class InchToFloat {

	public static void main(String[] args) {
		// 1feet = 12 inch
		float f,i;
		Scanner x = new Scanner(System.in);
		System.out.println("Enter value in Inch :");
		i = x.nextFloat();
		f = i/12;
		System.out.println("Feet :"+f);
	}

}
