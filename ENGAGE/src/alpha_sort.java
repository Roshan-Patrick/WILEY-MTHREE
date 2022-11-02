import java.util.Scanner;
public class alpha_sort {
	
	   public static void main(String args[])
	   { 
	    int i,j;
	    Scanner sc= new Scanner(System.in);
	    String oldString;
	    char temp;
	    System.out.println("Enter the input string");
	    oldString=sc.nextLine();
	    StringBuilder newString = new StringBuilder(oldString);
	    for(i=0;i<newString.length();i++)
	    {
	        for(j=0;j<newString.length()-1;j++)
	        {
	           
	           if(newString.charAt(i)<newString.charAt(j))
	           {
	                temp=newString.charAt(i);
	                newString.setCharAt(i,newString.charAt(j));
	                newString.setCharAt(j,temp);
	           }
	           
	                  
	        }
	    
	        
	    }

	    
	        System.out.print("The output string is "+newString);
	  
	   }
	}

