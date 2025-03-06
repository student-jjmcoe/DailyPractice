package com.shweta.problemsDay1;
import java.util.Scanner;

public class AdditionOfFloat {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter two float numbers :");
        float a = s.nextFloat();
        float b = s.nextFloat();
        float sum = a + b;
        System.out.println("Addition = "+sum);
	}

}
