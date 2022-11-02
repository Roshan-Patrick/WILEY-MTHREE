import java.util.*;
public class spell_bee_contest {
	    public static void main(String[] args)
	    {
	        
	        Scanner sc = new Scanner(System.in);
	        String s1 = sc.next();
	        String s2 = sc.next();
	        int c=0;
	        char a1,a2;
	        int k1 = s1.length();
	        int k2 = s2.length();
	        if(k1<=10 && k2<=10)
	        {
	            if(k1!=k2)
	            {
	                System.out.println(s2+" IS WRONG");
	            }
	            else
	            {
	                for(int i=0;i<s1.length();i++)
	                {
	                    a2=s2.charAt(i);
	                    a1=s1.charAt(i);
	                    if(a2==a1)
	                    {
	                        int c1=0;
	                    }
	                    else
	                    {
	                        c++;
	                    }
	                }
	                if(c>0 && c<=2)
	                {
	                    System.out.println(s2+" IS ALMOST CORRECT");
	                }
	                else if(c>2)
	                {
	                    System.out.println(s2+" IS WRONG");
	                }
	                else
	                {
	                    System.out.println(s2+" IS CORRECT");
	                }
	            }
	        }
	    }
	}

