import java.util.*;
public class Array_1D_Sum_Even_Odd
{
	public static void main(String args[])
	{
		int sumE=0,sumO=0;
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
			if(a[i]%2==0)
			{
				System.out.println(a[i]);
				sumE=sumE+a[i];
				
			}
			else
			{
				System.out.println(a[i]);
				sumO=sumO+a[i];
				
			}		
					
			
		}
		System.out.println("Sum of Even = "+sumE);
		System.out.println("Sum of Odd = "+sumO);
		System.out.println();
	}
}