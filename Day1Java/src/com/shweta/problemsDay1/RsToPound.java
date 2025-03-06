package com.shweta.problemsDay1;

import java.util.Scanner;

public class RsToPound {

	public static void main(String[] args) {
		//1p = 110rs
		float rs,p;
		Scanner x = new Scanner(System.in);
		System.out.println("Enter Amount in Rs :");
		rs = x.nextFloat();
		p = rs/110;
		System.out.println("Pound ="+p);
	}

}
