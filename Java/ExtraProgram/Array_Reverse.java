import java.util.*;
public class Array_Reverse
{
	public static void main(String args[])
	{
	 	int i,j;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter size : ");
		int size = sc.nextInt();
		
		int a[][]=new int[size][size];
		

		

			for(i=0;i<a.length;i++)
			{
				for (j=0;j<a.length;j++) 
				{
					System.out.print("Enter a["+i+"]["+j+"]::");
					a[i][j]=sc.nextInt();
				}
			}
			for(i=a.length-1;i>=0;i--)
			{
				for(j=a.length-1;j>=0;j--)
				{
		 			System.out.println(a[i][j]+"\t");
				}
				System.out.println();
			}
	}
}
