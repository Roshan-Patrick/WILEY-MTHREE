import java.util.StringTokenizer;

public class StringDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data = "Messi is the goat";
		String[] words = data.split(" ");
		for(String word:words) {
			System.out.println(word);
		}
		
		
		StringTokenizer tokens = new StringTokenizer("Messi is the Goat"," ");
		while(tokens.hasMoreTokens()) {
			System.out.println(tokens.nextToken());
		}
		
		String complicated = "Hello(darkness @#$% my old &*( friend";
		String[] meaningful = complicated.trim().split("[(@#$%&*]+");
		for(String word:meaningful) {
			System.out.println(word);
		}

	}

}
