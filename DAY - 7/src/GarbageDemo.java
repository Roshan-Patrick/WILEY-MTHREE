
public class GarbageDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GarbageDemo s1 = new GarbageDemo();
		GarbageDemo s2 = new GarbageDemo();
		s1 = null;
		s2 = null;
//		System.gc(); // Forcefully invoking the garbage collection
		Runtime.getRuntime().gc();
		
		display();

	}
	
	public static void display() {
		String s3 = "Blahhh";
		s3 = null;
		System.gc();
		
	}

	public void finalize() {
		System.out.println("Object is garbage collected");

	}
}
