package com.shweta.problemsDay1;

import java.util.Scanner;

public class MaxOfThreeNums {

	public static void main(String[] args) {
		int n1,n2,n3;
		Scanner x = new Scanner(System.in);
		System.out.println("Enter three numbers:");
		n1 = x.nextInt();
		n2 = x.nextInt();
		n3 = x.nextInt();
		
		if(n1>n2) {
			if(n1>n3) {
				System.out.println("Max="+n1);
			}
			else {
				System.out.println("Max="+n3);
			}
		}
		else{
			if(n2>n3) {
				System.out.println("Max="+n2);
			}
			else {
				System.out.println("Max="+n3);
			}
		}
	}

}
