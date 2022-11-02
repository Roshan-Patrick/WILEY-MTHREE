package com.threading;
//By extending thread class
public class ThreadDemo1 extends Thread {
	
	//implicitly invoked when thread executes	 
	public void run() {
		System.out.println("ThreadDemo1 is running");
		System.out.println(Thread.currentThread().getName()+" "+ Thread.currentThread().getId());
	}
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName()+" "+ Thread.currentThread().getId());
		
		ThreadDemo1 demo1 = new ThreadDemo1();
		ThreadDemo1 demo2 = new ThreadDemo1();
		ThreadDemo1 demo3 = new ThreadDemo1();
		//demo1.setName("MyThread");
		//demo1.run();
		demo1.start();
		demo2.start();
		demo3.start();
	}
	
	
}
