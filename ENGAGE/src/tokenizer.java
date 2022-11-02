import java.util.StringTokenizer;

public class tokenizer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "This is Ronaldo, debuted in ManU, destroyed by Messi";
		StringTokenizer obj = new StringTokenizer(str);
		
		System.out.println("-------Split by space--------");
		while(obj.hasMoreElements()) {
			System.out.println(obj.nextElement());
		}
		StringTokenizer obj1 = new StringTokenizer(str, ",");
		
		System.out.println("-------Split by comma--------");
		while(obj1.hasMoreElements()) {
			System.out.println(obj1.nextElement());
		}
		
		String msg = "http://10.123.21.45.87";
		StringTokenizer ms = new StringTokenizer(msg,"://.");
		while(ms.hasMoreElements()) {
			System.out.println(ms.nextElement());
		}
		
		

	}

}
