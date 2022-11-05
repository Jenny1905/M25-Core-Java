package org.tnsindia.multithreading;

public class ThreadLifeCycleExample implements Runnable{

	public static void main(String[] args) {
		Thread t1=new Thread();
		t1.start();
		/*if any thread is in the running state then you can't again use start() state*/
		//t1.start();
		
		try {
			t1.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println("Exception handled "+e);
		}
		t1.setPriority(1);
		int priority=t1.getPriority();
		System.out.println(priority);
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

}
