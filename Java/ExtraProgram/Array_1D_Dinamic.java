import java.util.*;
public class Array_1D_Dinamic
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size :");
		int size = sc.nextInt();

		int a[]=new int[size];

		for(int i=0;i<a.length;i++)
		{
			System.out.print("a["+i+"]::");
			a[i]=sc.nextInt();
		}

		for(int i=0;i<a.length;i++)
		{
			System.out.println("a["+i+"]"+a[i]);
		
		}
		System.out.println();
	}
}