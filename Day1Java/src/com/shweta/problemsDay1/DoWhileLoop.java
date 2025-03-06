package com.shweta.problemsDay1;

import java.util.Scanner;

public class DoWhileLoop {

	public static void main(String[] args) {
		int i = 1;
		do {
			System.out.println(i);
			i++;
		}while(i<=10);

		i = 10;
		do {
			System.out.println(i);
			i--;
		}while(i>=1);
		
		int sum = 0;
		i = 1;
		do {
			sum = sum + i;
			i++;
		}while(i<=10);
		System.out.println("Sum ="+sum);
		
		int mul = 1;
		i = 10;
		do {
			mul = mul * i;
			i--;
		}while(i>=1);
		System.out.println("Mul ="+mul);
		
		Scanner x = new Scanner(System.in);
		System.out.println("Enter number to calculate factorial :");
		int n = x.nextInt();
		int fact = 1;
		i=1;
		do {
			fact = fact * i;
			i++;
		}while(i<=n);
		System.out.println("Fact ="+fact);
	}

}
