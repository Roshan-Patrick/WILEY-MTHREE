
public class Calculator {

	public static void main(String[] args) {
		int[] data = {20,10};
		int add = 0,sub = 0,mul = 0,div = 0;
		try {
		int val1=data[0],val2=data[1];	
		add = val1 + val2;
		System.out.println("Addition = "+ add);
		sub = val1 - val2;
		System.out.println("Subtraction = "+ sub);
		try {
		div = val1 / val2;
		System.out.println("Division = "+ div);
		}
		catch(ArithmeticException ae) {
			System.out.println("Cannot divided by 0");
	//		ae.printStackTrace(); //recommended for bigger problems
	//		System.out.println(ae.getMessage());
	//		System.err.append("Error occurred");
		}
		mul = val1 * val2;
		System.out.println("Multiplication = "+ mul);

	}
		catch(ArrayIndexOutOfBoundsException ab) {
			System.out.println("Initialize atleast 2 members in the array ");
		}
	

	}
}
