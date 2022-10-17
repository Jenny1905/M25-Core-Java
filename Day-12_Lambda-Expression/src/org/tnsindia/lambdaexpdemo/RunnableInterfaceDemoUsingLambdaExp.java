package org.tnsindia.lambdaexpdemo;

public class RunnableInterfaceDemoUsingLambdaExp {

	public static void main(String[] args) {
		/*Runnable is an interface which contain one method -run()*/
		/*Runnable obj=new Runnable()
		{

			@Override
			public void run() {
				System.out.println("Implementing runnbale interface");
				
			}
			
		};
		//Thread is a class that implementing runnable interface
		Thread t=new Thread(obj);
		//when u call start method it jumps to run method
		t.start();*/
		
		//implementing runnable interface using lambda expression
		Runnable obj=()->
		{
			System.out.println("Implementing runnbale interface");
		};
		Thread t=new Thread(obj);
		t.start();
	}

}
