package org.tnsindia.exception;
import java.util.Scanner;

//program to handle ArithmeticException
public class ArithmeticExceptionHandling {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of a:");
		int a=s.nextInt();
		System.out.println("Enter the value of b:");
		int b=s.nextInt();
		//try block contain the exception code
		try {
			int result=a/b;
			System.out.println("The result is : "+result);
		}
		//catch block is used to handle the exception
		catch(ArithmeticException e)
		{
			System.out.println(e);
			System.out.println("Arithmetic Exception handled using catch block");
		}
		//whether any exception occurs or not finally block is always executed
		finally {
			System.out.println("Finally block is always executed");
			
		}
		//outside the try and catch block statement also always exceuted.
		System.out.println("Exception handling");
		s.close();


	}

}
