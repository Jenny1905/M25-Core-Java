package org.tnsindia.userinput;
//program on user-input for double data-type

import java.util.Scanner;

public class DemoOnDouble {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of x: ");
		double x=s.nextDouble();
		System.out.println("The result is: ");
		System.out.print(x);

	}

}
