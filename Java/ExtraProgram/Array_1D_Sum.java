import java.util.*;
public class Array_1D_Sum
{
	public static void main(String args[])
	{
		int sum=0;
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
			sum=sum+a[i];
			System.out.println("a["+i+"]"+a[i]);
			
		}
		System.out.println("Sum = "+sum);
		
		System.out.println();
	}
}