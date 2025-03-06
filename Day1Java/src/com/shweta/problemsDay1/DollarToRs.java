package com.shweta.problemsDay1;
import java.util.Scanner;

public class DollarToRs {

	public static void main(String[] args) {
		//1D = 87rs;
		int d,rs;
		Scanner x = new Scanner(System.in);
		
		System.out.println("Enter Dollar Amount :");
		d = x.nextInt();
		rs = d * 87;
		System.out.println("Rupees ="+rs);
	}

}
