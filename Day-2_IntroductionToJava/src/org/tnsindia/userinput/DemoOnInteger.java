package org.tnsindia.userinput;

import java.util.Scanner;

//program on user-input for Integer data-type
public class DemoOnInteger {

	public static void main(String[] args) {
		//for user-input
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of x: ");
		int x=s.nextInt();
		System.out.println("The result is: ");
		System.out.print(x);
		s.close();

	}

}
