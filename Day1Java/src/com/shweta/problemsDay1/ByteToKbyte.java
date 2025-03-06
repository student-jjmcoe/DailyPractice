package com.shweta.problemsDay1;

import java.util.Scanner;

public class ByteToKbyte {

	public static void main(String[] args) {
		// 1kbyte = 1024bytes
		float kb,by;
		Scanner x = new Scanner(System.in);
		System.out.println("Enter bytes :");
		by = x.nextFloat();
		
		kb = by/1024;
		System.out.println("Kbytes ="+kb);
	}

}
