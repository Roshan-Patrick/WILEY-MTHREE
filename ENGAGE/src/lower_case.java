import java.util.Scanner;
import java.util.*;
public class lower_case {
	    public static void main(String args[]) {
	        Scanner sc = new Scanner(System.in);
	        String oldString, newString = "";
	        oldString = sc.nextLine();
	        int asciivalue = 0;
	        int i;
	        for (i = 0; i < oldString.length(); i++) {
	            if (oldString.charAt(i) < 'a') {
	                asciivalue = oldString.charAt(i) + 32;
	                newString = newString + (char) asciivalue;
	            } else {
	                newString = newString + oldString.charAt(i);
	            }
	        }
	        System.out.print("The output string is " + newString);
	    }
	}


