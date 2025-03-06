package com.shweta.problemsDay1;

import java.util.Scanner;

public class PoundToRs {

	public static void main(String[] args) {
		// 1p = 110rs
		Scanner x = new Scanner(System.in);
		System.out.println("Enter amount in pound :");
		float p = x.nextFloat();
        float rs = p*110;
        System.out.println("Rupees ="+rs);
	}

}
