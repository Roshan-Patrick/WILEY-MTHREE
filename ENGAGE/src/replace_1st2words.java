import java.util.*;
public class replace_1st2words {
		public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
			String str1, sentence = "";
			str1 = s.nextLine();
			String[] str2 = str1.split(" ");
			for (int i = 2; i < str2.length; i++) {
				sentence += str2[i] + " ";
			}
			sentence += str2[0] + " " + str2[1];
			System.out.println(sentence);
		}
	}

