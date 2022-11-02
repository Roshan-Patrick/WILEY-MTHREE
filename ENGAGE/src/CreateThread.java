class task implements Runnable{
	public void run() {
		for(int i=0;i<5;i++) {
		System.out.println("Child task");
		}
	}
}	
	class task1 implements Runnable{
		public void run() {
			for(int i=0;i<5;i++) {
			System.out.println("Child task1");
			}
		}	
	}	
public class CreateThread {
	
	public CreateThread() {
		super();
	}
	
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("Child");
		}
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread thread1 = new Thread(new task());
		Thread thread2 = new Thread(new task1());
		thread1.start();
		thread2.start();
		
		
		for(int i=0;i<5;i++) {
			System.out.println("Main");
		}
		
		
		
		
	}

}
