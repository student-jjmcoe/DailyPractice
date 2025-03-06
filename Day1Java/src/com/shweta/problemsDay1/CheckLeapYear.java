package com.shweta.problemsDay1;
import java.util.Scanner;
public class CheckLeapYear {

	public static void main(String[] args) {
		int year ;
		Scanner x = new Scanner(System.in);
		System.out.println("Enter Year to check :");
        year = x.nextInt();
        
        if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
        	System.out.println("Year "+year+" is Leap Year");
        }
        else {
        	System.out.println("year "+year+" is not Leap Year");
        }
	}

}
