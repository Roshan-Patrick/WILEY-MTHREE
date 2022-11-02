import java.util.Scanner;
public class avg_char {

		public static void main(String args[]) {
			int i;
			Scanner sc = new Scanner(System.in);
			String oldString;
			int asciivalueSum = 0, asciivalueAvg;
			oldString = sc.nextLine();
			for (i = 0; i < oldString.length(); i++) {
				asciivalueSum = asciivalueSum + oldString.charAt(i);
			}
			asciivalueAvg = asciivalueSum / oldString.length();
			System.out.print((char)asciivalueAvg);
		}
	}

