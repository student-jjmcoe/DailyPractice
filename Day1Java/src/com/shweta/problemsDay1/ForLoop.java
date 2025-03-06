package com.shweta.problemsDay1;

import java.util.Scanner;

public class ForLoop {

	public static void main(String[] args) {
		for(int i=1;i<=10;i++) {
			System.out.println(i);
		}
		for(int i=10;i>=1;i--) {
			System.out.println(i);
		}
		
		int sum = 0;
		for(int i=1;i<=10;i++) {
			sum = sum + i;
		}
		System.out.println("Sum ="+sum);
		
		int mul = 1;
		for(int i=10;i>=1;i--) {
			mul = mul * i;
		}
		System.out.println("Mul ="+mul);
		
		int n;
		Scanner x = new Scanner(System.in);
		System.out.println("Enter Number to calculate factorial :");
		n = x.nextInt();
		int fact = 1;
		for(int i=1;i<=n;i++) {
			fact = fact * i;
		}
		System.out.println("Fact ="+fact);
		
		
	}

}
