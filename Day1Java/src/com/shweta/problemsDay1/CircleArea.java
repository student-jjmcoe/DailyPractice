package com.shweta.problemsDay1;
import java.util.Scanner;

public class CircleArea {

	public static void main(String[] args) {
		float r,a;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter radius of circle :");
        r = s.nextFloat();
        a = 3.14f*r*r;
        System.out.println("Area of Circle :"+a);
	}

}
