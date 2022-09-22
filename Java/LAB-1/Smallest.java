import java.util.*;

public class Smallest
{
	public static void main (String args[])
	{
		Scanner sc=new Scanner(System.in);

		System.out.print("Enter the value of a= ");
		int a=sc.nextInt();

		System.out.print("Enter the value of b= ");
		int b=sc.nextInt();

		System.out.print("Enter the value of c= ");
		int c=sc.nextInt();

		if(a!=b)
		{
			if (a<b)
			{
				if(a!=c)
				{
					if (a<c) 
					{
						System.out.print("Value a is Small ");
					}
					else
					{
						System.out.print("Value c is Small");
					}
				}
				else
				{
					System.out.print("Value a and c is same");
				}
			}
			else
			{
				if(b!=c)
				{
					if(b<c)
					{
						System.out.print("Value b is Small ");
					}
					else
					{
						System.out.print("Value c is Small ");
					}
				}	
				else
				{
					System.out.print("Value b and c is same");
				}
				
			}
		}
		else
		{
			System.out.print("Value a and b is same");
		}		


	}
}