import java.util.*;
public class Array_2D_Dinamic
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
			for(i=0;i<a.length;i++)
			{
				for(j=0;j<a.length;j++)
				{
		 			System.out.print(a[i][j]+"\t");
				}
				System.out.println();
			}
	}
}
