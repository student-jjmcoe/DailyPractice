package com.shweta.problemsDay1;

import java.util.Scanner;

public class PassOrFail {

	public static void main(String[] args) {
		float marks;
		Scanner x = new Scanner(System.in);
		System.out.println("Enter your Marks :");
		marks = x.nextFloat();
		
		if(marks < 35) {
			System.out.println("Student is Fail");
		}
		else {
			System.out.println("Student is Pass with "+marks+" marks.");
		}
	}

}
