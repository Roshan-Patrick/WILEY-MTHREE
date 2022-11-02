import java.util.*;
import java.io.*;
public class largest_in_rowcolumn {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int row,column,max=0;
		int[][] matrix = new int[10][10];
		System.out.println("Enter the row ");
		row = s.nextInt();
		System.out.println("Enter the Column");
		column = s.nextInt();
		System.out.println("Enter matrix values");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++) 
			{
				matrix[i][j] = s.nextInt();
			}
		}
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++) 
			{
				System.out.print(matrix[i][j]+ " ") ;
			}
			System.out.println();
		}
		
		System.out.println("Enter the row to find the largest element");
		int row_lar = s.nextInt();
		row_lar--;
		
		for(int j=0;j<column;j++)
		{
			if(max< matrix[j][row_lar])
			{
				max = matrix[row_lar][j];
			}
		}
		System.out.println(max);
		
		

	}

}

/* import java.io.*;
import java.util.Scanner; 
public class Main{
public static void main(String argv[])
{
int row, i,j,m,n,max=0,num;
int[][] a = new int[10][10];
Scanner sc=new Scanner(System.in);
System.out.println("Enter number of rows");
n=sc.nextInt(); 
System.out.println("Enter number of columns");
m=sc.nextInt(); 
System.out.println("Enter matrix values");
for(i=0;i<n;i++)
{
for(j=0;j<m;j++)
{
a[i][j]=sc.nextInt();
}
}
System.out.println("Enter a row number");
row=sc.nextInt();
row--;
for(j=0;j<m;j++)
{
if(max< a[j][row])
{
max=a[row][j];
}
}
System.out.println("Maximum value in row "+(row+1)+" is "+ max);
System.out.println("Enter a column number");
num=sc.nextInt();
num--;
max=0;
for(i=0;i<n;i++)
{
if(max<a[i][num])
{
max= a[row][i];
}
}
System.out.println("Maximum value in column "+(num+1)+" is "+max);
}
} */


