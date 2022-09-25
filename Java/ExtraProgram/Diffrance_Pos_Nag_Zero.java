import java.util.*;
public class  Diffrance_Pos_Nag_Zero
{
	public static void main (String args[])
	{
		int sub=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of a : ");
		int a = sc.nextInt();
		System.out.println("Enter the value of  b : ");
		int b = sc.nextInt();

		sub=a-b;
		if(sub>0)
		{
			System.out.println("Diffrance is Positive ");
		}
		else if(sub<0)
		{
			System.out.println("Diffrance is Nagative ");
		}
	    else
		{
			System.out.println("Diffrance is Zero ");
		}		
	}
}
