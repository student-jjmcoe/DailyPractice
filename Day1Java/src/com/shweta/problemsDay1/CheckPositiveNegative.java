package com.shweta.problemsDay1;

import java.util.Scanner;

public class CheckPositiveNegative {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		System.out.println("Enter number to be checked :");
		int num = x.nextInt();
		
		if(num>=0) {
			System.out.println("Number is Positive");
		}
		else {
			System.out.println("Number is Negative");
		}
	}

}
