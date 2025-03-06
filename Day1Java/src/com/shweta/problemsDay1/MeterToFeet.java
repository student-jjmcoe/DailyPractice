package com.shweta.problemsDay1;

import java.util.Scanner;

public class MeterToFeet {

	public static void main(String[] args) {
		// 1feet = 0.305m
				float f,m;
				Scanner x = new Scanner(System.in);
				System.out.println("Enter value in m :");
				m = x.nextFloat();
				
		        f = m/0.305f;
		        System.out.println("Feet ="+f);
	}

}
