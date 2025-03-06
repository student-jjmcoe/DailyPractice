package com.shweta.problemsDay1;

import java.util.Scanner;

public class StudentGrade {

	public static void main(String[] args) {
		float marks;
		Scanner x = new Scanner(System.in);
		System.out.println("Enter Your Marks :");
		marks = x.nextFloat();
		
		if(marks < 35) {
			System.out.println("Fail");
		}
		else {
			if(marks < 50) {
				System.out.println("Pass");
			}
			else {
				if(marks < 65) {
					System.out.println("Second Class");
				}
				else {
					if(marks < 75) {
						System.out.println("First Class");
					}
					else {
						System.out.println("Distinction");
					}
				}
			}
		}
	}

}
