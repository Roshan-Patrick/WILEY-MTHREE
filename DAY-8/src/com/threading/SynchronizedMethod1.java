package com.threading;

class Test1 {
	synchronized static public void countIncrement() {
		for (int i = 0; i < 3; i++) {
			System.out.print("Incremental Value  :");
			System.out.print(Thread.currentThread().getName() + " " + Thread.currentThread().getId() + " :");
			System.out.println(i);
			try {
				Thread.sleep(400);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	synchronized static public void countDecrement() {
		for (int i = 3; i > 0; i--) {
			System.out.print("Decremental Value  :");
			System.out.print(Thread.currentThread().getName() + " " + Thread.currentThread().getId() + " :");
			System.out.println(i);
			try {
				Thread.sleep(400);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class MyThreadnew extends Thread {

	Test1 test;

	MyThreadnew(Test1 test) {
		this.test = test;
	}

	public void run() {
		test.countIncrement();
		test.countDecrement();
	}
}

public class SynchronizedMethod1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test1 obj = new Test1();

		MyThreadnew myThread1 = new MyThreadnew(obj);
		MyThreadnew myThread2 = new MyThreadnew(obj);

		myThread1.start();
		myThread2.start();

	}

}
