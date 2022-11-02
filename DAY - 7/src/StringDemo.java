
public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//		String str1 = "java";
		String str1 = new String("java");
		String str2 = new String("java");
//		String str2 = "java";
//		System.out.println(str1.hashCode());
//		System.out.println(str2.hashCode());
	
//		str2=str2.toUpperCase();
		System.out.println(str2.charAt(1));
		System.out.println(str2.indexOf("V"));
		
		if(str1==str2)	
			System.out.println("Equal");
		else
			System.out.println("Not equal");
	}

}
