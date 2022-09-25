import java.util.*;
public class Array_2D_Static
{
	public static void main(String args[])
	{
	 	int i,j;
		
		int a[][]={{1,2,3},{4,5,6},{7,8,9}};
		
		System.out.println("a.length = "+a.length);
		
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
