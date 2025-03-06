package com.shweta.problemsDay1;

import java.util.Scanner;

public class SwitchArithmeticOperations {

	public static void main(String[] args) {
		int a,b,c;
		Scanner x = new Scanner(System.in);
		System.out.println("Enter Two Numbers :");
		a = x.nextInt();
		b = x.nextInt();
		
		System.out.println("Enter Your Choice :\n1.Addition\n2.Substraction\n3.Multiplication\n4.Division");
		int ch = x.nextInt();
		
		switch(ch) {
		case 1 : c = a+b;
		         System.out.println("Addition ="+c);
		         break;
		case 2 : c = a-b;
		         System.out.println("Substraction ="+c);
		         break;
		case 3 : c = a*b;
		         System.out.println("Multiplication ="+c);
		         break;
		case 4 : c = a/b;
		         System.out.println("Division ="+c);
		         break;
		default :System.out.println("Invalid Choice");
		}
	}

}
