import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class calc {
	public static void main(String[] args) {
	
	int ans = div(10,2);
	System.out.println(ans);
	}

	public static int div(int i, int j) {
		// TODO Auto-generated method stub
		try {
		return i/j;
		}
		catch(ArithmeticException ae) {
			System.out.println("cannot divide");
		}
		finally {
			System.out.println("finally invoked");
		}
		return 0;
	}
//
//	public static void processfile() {
//		
////		File f = new File("a.txt");
////		FileInputStream fs = new FileInputStream(f);
////		while(fs.read()!= -1) {
////			System.out.println("Processing file");
////		}
//		
//		File f = new File("a.txt");
//		FileInputStream fs=null;
//		try {
//			fs = new FileInputStream(f);
//			while(fs.read()!= -1) {
//				System.out.println("Processing file");
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		 catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		finally {
//			fs.close();
//		}

	
	
	
}
