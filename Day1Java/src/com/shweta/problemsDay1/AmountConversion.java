package com.shweta.problemsDay1;
import java.util.Scanner;
public class AmountConversion {

	public static void main(String[] args) {
		float rs,d,p,e;
		Scanner x = new Scanner(System.in);
		System.out.println("Enter Amount in Rupees :");
		rs = x.nextFloat();
		
		System.out.println("Enter choice where : \n1.Rs To Dollar \n2.Rs to Pound \n3.Rs to Euro");
		int ch = x.nextInt();
		
		//1d = 87rs
		//1p = 110rs
		//1e = 91rs
		if(ch == 1) {
			d = rs/87;
			System.out.println("Dollar ="+d);
		}
		else if(ch == 2) {
			p = rs/110;
			System.out.println("Pound ="+p);
		}
		else if(ch == 3) {
			e = rs/91;
			System.out.println("Euro ="+e);
		}
		else {
			System.out.println("Invalid choice");
		}
	}

}
