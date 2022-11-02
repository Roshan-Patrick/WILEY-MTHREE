package com.threading;

public class ThreadDemo4 extends Thread {
	
	//By extending thread class
		
		//implicitly invoked when thread executes	 
		public void run() {
			
			String threadName = Thread.currentThread().getName();
			for(int i=1;i<=10;i++) {
				System.out.println(i+" : generated by, "+threadName);
				try {
					Thread.sleep(1000); //checked exception
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
	}
		public static void main(String[] args) {
			System.out.println(Thread.currentThread().getName()+" "+ Thread.currentThread().getId());
			
			ThreadDemo4 demo1 = new ThreadDemo4();
			ThreadDemo4 demo2 = new ThreadDemo4();
			ThreadDemo4 demo3 = new ThreadDemo4();
			//demo1.setName("MyThread");
			//demo1.run();
			demo1.start(); //thread-0
			demo2.start(); //thread-1
			demo3.start(); //thread-2
			
			demo1.setPriority(10);
		
		
		
	}


}
