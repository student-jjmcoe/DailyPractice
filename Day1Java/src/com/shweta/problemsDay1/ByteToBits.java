package com.shweta.problemsDay1;

import java.util.Scanner;

public class ByteToBits {

	public static void main(String[] args) {
		// 1byte = 8bits
		int by, bi;
		Scanner x = new Scanner(System.in);
		
		System.out.println("Enter bytes:");
		by = x.nextInt();
		
		bi = 8*by;
		System.out.println("bits ="+bi);

	}

}
