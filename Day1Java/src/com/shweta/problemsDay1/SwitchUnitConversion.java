package com.shweta.problemsDay1;

import java.util.Scanner;

public class SwitchUnitConversion {

	public static void main(String[] args) {
		float f,i,cm,m;
		Scanner x = new Scanner(System.in);
		System.out.println("Enter Feet value to be converted :");
        f = x.nextFloat();
        
        System.out.println("Enter choice :\n1.Feet to Inch\n2.Feet to Cm\n3.Feet to Meter");
        int ch = x.nextInt();
        
        switch(ch) {
        case 1 : i = 12*f;
                 System.out.println("Inch ="+i);
                 break;
        case 2 : cm = 30.5f*f;
                 System.out.println("Centimeter ="+cm);
                 break;
        case 3 : m = 0.305f * f;
                 System.out.println("Meter ="+m);
                 break;
        default : System.out.println("Invalid Choice");         
        }
		
	}

}
