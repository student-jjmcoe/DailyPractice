package com.shweta.problemsDay1;
import java.util.*;
public class AdditionByTakingInput {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter two numbers :");
        int a = s.nextInt();
        int b = s.nextInt();
        int sum = a + b;
        System.out.println("Addition = "+sum);
	}

}
