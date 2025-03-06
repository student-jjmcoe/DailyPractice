package com.shweta.problemsDay1;

import java.util.Scanner;

public class EuroToRs {

	public static void main(String[] args) {
		// 1e = 91rs
				float e,rs;
				Scanner x = new Scanner(System.in);
				System.out.println("Enter Amount in Euro :");
				e = x.nextFloat();
				
				rs = e*91;
				System.out.println("Rupees ="+rs);
	}

}
