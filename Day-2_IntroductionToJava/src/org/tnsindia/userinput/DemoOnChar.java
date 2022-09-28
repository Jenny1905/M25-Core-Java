package org.tnsindia.userinput;
//program on user-input for char data-type

import java.util.Scanner;

public class DemoOnChar {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of x: ");
		char x=s.next().charAt(3);
		System.out.println("The result is: ");
		System.out.print(x);
	}

}
