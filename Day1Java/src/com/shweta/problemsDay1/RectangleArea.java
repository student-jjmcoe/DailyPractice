package com.shweta.problemsDay1;

import java.util.Scanner;

public class RectangleArea {

	public static void main(String[] args) {
		int l,b,a;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter length of rectangle :");
		l = s.nextInt();
		System.out.println("Enter breadth of rectangle :");
		b = s.nextInt();
		
		a = l*b;
		System.out.println("Area of Rectangle :"+a);
	}

}
