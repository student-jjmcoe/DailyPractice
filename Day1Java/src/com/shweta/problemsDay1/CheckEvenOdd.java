package com.shweta.problemsDay1;

import java.util.Scanner;

public class CheckEvenOdd {

	public static void main(String[] args) {
		int num;
		Scanner x = new Scanner(System.in);
		System.out.println("Enter number to check :");
		num = x.nextInt();
		
		if(num%2 == 0) {
			System.out.println("Number is Even");
		}
		else {
			System.out.println("Number is Odd");
		}
	}

}
