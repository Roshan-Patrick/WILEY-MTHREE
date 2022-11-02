package com.threading;
//Anonymous Thread
public class ThreadDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread thread = new Thread() {
			public void run() {
				System.out.println("Run is invoked from the thread class");
			}
		};
		thread.start();
		
		
		Runnable thread1 = new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("Run for runnable is invoked");
				
			}
			
		};
		Thread t1 = new Thread(thread1);
		t1.start();

	}

}
