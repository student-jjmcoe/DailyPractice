package com.shweta.problemsDay1;

import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {
		int i = 1;
		while(i<=10) {
			System.out.println(i);
			i++;
		}
		
		i = 10;
		while(i>=1) {
			System.out.println(i);
			i--;
		}
		
		int sum = 0;
		i = 1;
		while(i<=10) {
			sum = sum + i;
			i++;
		}
		System.out.println("Sum ="+sum);
		
		int mul = 1;
		i=10;
		while(i>=1) {
			mul = mul*i;
			i--;
		}
		System.out.println("Mul ="+mul);
		
		Scanner x = new Scanner(System.in);
		System.out.println("Enter number for factorial :");
		int n = x.nextInt();
		i = 1;
		int fact = 1;
		while(i<=n) {
			fact = fact * i;
			i++;
		}
		System.out.println("Factorial ="+fact);
	}

}
