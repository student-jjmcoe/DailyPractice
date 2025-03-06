package com.shweta.problemsDay1;
import java.util.Scanner;
public class UnitConversion {

	public static void main(String[] args) {
		float f,i,cm,m;
		Scanner x = new Scanner(System.in);
		System.out.println("Enter Feet value to convert:");
		f = x.nextFloat();
		
		System.out.println("Enter choice where \n1.Feet to Inch \n2.Feet to Centimeter \n3.Meter");
		int ch = x.nextInt();
		
		//1feet = 12inch
		//1feet = 30.5cm
		//1feet = 0.305
		if(ch == 1) {
			i = 12 * f;
			System.out.println("Inch ="+i);
		}
		else if(ch == 2) {
			cm = 30.5f * f;
			System.out.println("Centimeter ="+cm);
		}
		else if(ch == 3) {
			m = 0.305f * f;
			System.out.println("Meter ="+m);
		}
		else {
			System.out.println("Invalid choice");
		}
	}

}
