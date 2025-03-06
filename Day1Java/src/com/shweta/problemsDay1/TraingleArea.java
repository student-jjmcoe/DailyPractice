package com.shweta.problemsDay1;

import java.util.Scanner;

public class TraingleArea {

	public static void main(String[] args) {
		int h,b;
		float a;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter height of traingle :");
		h = s.nextInt();
		System.out.println("Enter breadth of traingle :");
		b = s.nextInt();
        
		a = 0.5f*b*h;
		System.out.println("Area of Traingle = "+a);
	}

}
