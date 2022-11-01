package org.tnsindia.enumdemo;

import java.util.Scanner;

import org.tnsindia.enumdemo.PizzaEnumDemo.Size;

public class PizzaEnumExecutor {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of the pizza: ");
		String size=s.nextLine();
		//converting String to enum-size of the pizza
		Size s1=Size.valueOf(size.toUpperCase());
		switch(s1)
		{
			case SMALL:
				System.out.println("Preparing small pizza for the customer");
				break;
			case MEDIUM:
				System.out.println("Preparing Medium pizza for the customer");
				break;
			case LARGE:
				System.out.println("Preparing Large pizza for the customer");
				break;
			case EXTRALARGE:
				System.out.println("Preparing Extra-Large pizza for the customer");
				break;
				
		}

	}

}
