package com.shweta.problemsDay1;

import java.util.Scanner;

public class MaxOfTwoNum {

	public static void main(String[] args) {
		int num1, num2;
		Scanner x = new Scanner(System.in);
		System.out.println("Enter two numbers :");
		num1 = x.nextInt();
		num2 = x.nextInt();
		
		if(num1 > num2) {
			System.out.println(num1 + " is maximum");
		}
		else {
			System.out.println(num2 + " is maximum");
		}
	}

}
