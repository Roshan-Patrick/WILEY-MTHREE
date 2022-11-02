package com.threading;

class Test{
	public synchronized void count() {
		for(int i=0;i<3;i++) {
			System.out.print(Thread.currentThread().getName()+" "+ Thread.currentThread().getId()+ " :");
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class MyThread1 extends Thread{
	
	Test test;
	MyThread1(Test test){
		this.test=test;
	}
	public void run() {
		test.count();
	}
}

public class SynchronizedMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test obj = new Test();
		
		MyThread1 myThread1 = new MyThread1(obj);
		MyThread1 myThread2 = new MyThread1(obj);
		
		myThread1.start();
		myThread2.start();
		
	}

}
