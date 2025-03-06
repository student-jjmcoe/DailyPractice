package com.shweta.problemsDay1;

import java.util.Scanner;

public class KbyteToByte {

	public static void main(String[] args) {
		// 1kbyte = 1024bytes
		float kb,by;
		Scanner x = new Scanner(System.in);
		System.out.println("Enter kbytes :");
		kb = x.nextFloat();
		
		by = 1024*kb;
		System.out.println("Bytes ="+by);

	}

}
