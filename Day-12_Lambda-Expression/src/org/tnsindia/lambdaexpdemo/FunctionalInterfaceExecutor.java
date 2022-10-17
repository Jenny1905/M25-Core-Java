package org.tnsindia.lambdaexpdemo;

public class FunctionalInterfaceExecutor {

	public static void main(String[] args) {
		//lambda expression
		FunctionalInterfaceDemo obj=(String str)->
		{
			return str;
			
			
		};
		System.out.println(obj.display("Welcome to the concept of Lambda Expression"));

	}

}
