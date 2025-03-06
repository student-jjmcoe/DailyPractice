package com.shweta.problemsDay1;

import java.util.Scanner;

public class SwitchAmountConversion {

	public static void main(String[] args) {
		float rs,d,p,e;
		Scanner x = new Scanner(System.in);
		System.out.println("Enter Amount in Rs :");
		rs = x.nextFloat();
		
		System.out.println("Enter Choice :\n1.Rs to Dollar\n2.Rs to Pound\n3.Rs to Euro");
		int ch = x.nextInt();
		
		switch(ch) {
		case 1 : d = rs/87;
		         System.out.println("Dollar ="+d);
		         break;
		case 2 : p = rs/110;
                 System.out.println( "Pound="+p);
                 break;
		case 3 : e = rs/91;
                 System.out.println("Euro ="+e);
                 break;
        default : System.out.println("Invalid Choice");         
		}
	}

}
