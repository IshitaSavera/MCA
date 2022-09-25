import java.util.*;
public class Array_2D_Sum
{
	public static void main(String args[])
	{
	 	int i,j;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter size of Array: ");
		int size= sc.nextInt();
		
		int a[][]=new int[size][size];
		int b[][]=new int[size][size];
		
			System.out.println("Array1...");
			for(i=0;i<a.length;i++)
			{
				for (j=0;j<a.length;j++) 
				{
					System.out.print("Enter a["+i+"]["+j+"]::");
					a[i][j]=sc.nextInt();
					
				}
			}
			for(i=0;i<a.length;i++)
			{
				for(j=0;j<a.length;j++)
				{
		 			System.out.print(a[i][j]+"\t");
				}
				System.out.println();
			}

			System.out.println("Array2...");
			for(i=0;i<b.length;i++)
			{
				for (j=0;j<b.length;j++) 
				{
					System.out.print("Enter b["+i+"]["+j+"]::");
					b[i][j]=sc.nextInt();
				}
			}
			for(i=0;i<b.length;i++)
			{
				for(j=0;j<b.length;j++)
				{
		 			System.out.print(b[i][j]+"\t");
				}
				System.out.println();
			}

			System.out.println("Sum of Array1 & Array2...");

			int sum[][]=new int[size][size];
			for(i=0;i<a.length;i++)
			{
				for(j=0;j<a.length;j++)
				{
					sum[i][j]=a[i][j]+b[i][j];
					System.out.print(sum[i][j]+"\t");
				}
				System.out.println();
			}
	}
}
