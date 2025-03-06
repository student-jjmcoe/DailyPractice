package com.shweta.problemsDay1;

import java.util.Scanner;

public class RsToEuro {

	public static void main(String[] args) {
		// 1e = 91rs
		float e,rs;
		Scanner x = new Scanner(System.in);
		System.out.println("Enter Amount in Rs :");
		rs = x.nextFloat();
		
		e = rs/91;
		System.out.println("Euro = "+e);

	}

}
