
public class stringbuilderr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder str = new StringBuilder("Lionel");
		str.append(" Messi");
		System.out.println(str);
		str.replace(12,16,"GOAT");
		System.out.println(str);
		str.reverse();
		System.out.println(str);
	}

}
