package com.shweta.problemsDay1;

import java.util.Scanner;

public class BitsToBytes {

	public static void main(String[] args) {
		// 1byte = 8bits
		int by,bi;
		Scanner x = new Scanner(System.in);
		
		System.out.println("Enter bits :");
		bi = x.nextInt();
		
		by = bi/8;
		System.out.println("Byte ="+by);

	}

}
