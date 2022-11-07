package org.tnsindia.concurrency;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

public class ConcurrentThreadDemo {

	public static void main(String[] args) {
		MultiplyingTask task1=new MultiplyingTask(10,20,1000);
		MultiplyingTask task2=new MultiplyingTask(15,10,2000);
		
		FutureTask<Integer>f1=new FutureTask(task1);
		FutureTask<Integer>f2=new FutureTask(task2);
		
		ExecutorService executor=Executors.newFixedThreadPool(2);
		executor.execute(f1);
		executor.execute(f2);
		
		while(true)
		{
			try
			{
			if(!f1.isDone())
			{
				System.out.println("FutureTask1 output="+f1.get());
				
			}
			if(!f2.isDone())
			{
				System.out.println("FutureTask2 output="+f2.get());
				
			}
			if(f1.isDone() && f2.isDone())
			{
				System.out.println("Completed both the FutureTask,Shutting down the executor");
				executor.shutdown();
				return;
			}
			}
			catch(InterruptedException e)
			{
				System.out.println("Exception handled"+e);
				
			}
			catch(ExecutionException e)
			{
				System.out.println("Exception handled"+e);
			}
		}

	}

}
