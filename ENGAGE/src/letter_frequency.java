import java.util.Scanner;
public class letter_frequency {
	   public static void main(String args[])
	   {
	        int ci, i, j, k, l=0;
	        String str, str1;
	        char c, ch;
	        Scanner scan = new Scanner(System.in);
	        
	        System.out.println("Enter the input string");
	        str=scan.nextLine();
	        System.out.println("The letter frequency is");
	        i=str.length();
	        for(c='A'; c<='z'; c++)
	        {
	            k=0;
	            for(j=0; j<i; j++)
	            {
	                ch = str.charAt(j);
	                if(ch == c)
	                {
	                    k++;
	                }
	            }
	            if(k>0)
	            {
	                System.out.println( c + " " + k );
	            }
	        }
	   }
	}

