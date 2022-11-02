import java.util.Scanner;
public class palindrome {
	public static void main(String args[])
	{ 
	int i;
	Scanner sc= new Scanner(System.in);
	String oldString,newString="",palindromeString="";
	int asciivalue;
	oldString=sc.nextLine();
	for(i=0;i<oldString.length();i++)
	{
	if(oldString.charAt(i)>='A' && oldString.charAt(i)>='Z')
	{
	asciivalue=oldString.charAt(i); 
	newString=newString+(char)asciivalue;
	System.out.println(newString.charAt(i));
	}
	else if(oldString.charAt(i)>='a' && oldString.charAt(i)>='z')
	{
	newString=newString+oldString.charAt(i);
	System.out.println(newString.charAt(i));
	}
	}
	for(i=newString.length()-1;i>=0;i--)
	{
	palindromeString=palindromeString+newString.charAt(i);
	}
	if(newString.equals(palindromeString))
	System.out.print("yes");
	else
	System.out.print("no");
	}
	}

