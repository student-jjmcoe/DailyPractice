package com.shweta.problemsDay1;

import java.util.Scanner;

public class SquareArea {

	public static void main(String[] args) {
		int s,a;
        Scanner x = new Scanner(System.in);
        System.out.println("Enter side of Square :");
        s = x.nextInt();
        a = s*s;
        System.out.println("Area of Square :"+a);
	}

}
