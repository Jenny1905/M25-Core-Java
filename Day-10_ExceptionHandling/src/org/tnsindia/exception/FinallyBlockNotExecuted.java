package org.tnsindia.exception;

public class FinallyBlockNotExecuted {
	
	//it is static because its is outside the main function
	public static void print()
	{
		try 
		{
			int x=12;
			int y=5;
			System.out.println("Inside try block- "+x/y);
			//1.no any further statement will exceute
			System.exit(0);
		}
	
		catch(Exception e)
		{
			System.out.println("Catch block");
		}
		
		finally
		{
			System.out.println("finally block");

		}
		/*2.when finally block contains exceptional code ,it won't be executed.
		finally
		{
			//System.out.println("Finally block");
			int res=34/0;
			System.out.println(res);

		}*/
	}

	public static void main(String[] args) {
		print();

	}

}
