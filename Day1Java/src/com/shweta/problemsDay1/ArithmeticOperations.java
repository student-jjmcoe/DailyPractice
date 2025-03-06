package com.shweta.problemsDay1;

import java.util.Scanner;

public class ArithmeticOperations {

	public static void main(String[] args) {
		int a,b,c;
		Scanner x = new Scanner(System.in);
		System.out.println("Enter Two Numbers :");
		a = x.nextInt();
		b = x.nextInt();
		
		System.out.println("Enter choice where \n 1.Addition \n 2.Substraction \n 3.Multiplication \n 4.Division");
		int ch = x.nextInt();
		
		if(ch == 1) {
			c = a+b;
			System.out.println("Addition ="+c);
		}
		else if(ch == 2) {
			c = a-b;
			System.out.println("Substraction ="+c);
		}
		else if(ch == 3) {
			c = a*b;
			System.out.println("Multiplication ="+c);
		}
		else if(ch == 4) {
			c = a/b;
			System.out.println("Division ="+c);
		}
		else {
			System.out.println("Invalid choice");
		}
	}

}
