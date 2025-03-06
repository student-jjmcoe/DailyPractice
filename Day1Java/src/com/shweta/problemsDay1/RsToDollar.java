package com.shweta.problemsDay1;

import java.util.Scanner;

public class RsToDollar {

	public static void main(String[] args) {
		//1D = 87rs
		float rs,d;
		Scanner x = new Scanner(System.in);
		System.out.println("Enter amount in Ruppes :");
		rs = x.nextInt();
		d = rs/87;
		System.out.println("Dollar ="+d);
	}

}
