package com.shweta.problemsDay1;

import java.util.Scanner;

public class CmToFeet {

	public static void main(String[] args) {
		// 1feet = 30.5cm
		float f,cm;
		Scanner x = new Scanner(System.in);
		System.out.println("Enter value in Cm :");
		cm = x.nextFloat();
		
        f = cm/30.5f;
        System.out.println("Feet ="+f);
	}

}
