import java.util.*;
public class  Positive_Nagative_zero
{
	public static void main (String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value : ");
		int a = sc.nextInt();

		if(a>0)
		{
			System.out.println("Number is Positive ");
		}
		else if(a<0)
		{
			System.out.println("Number is Nagative ");
		}
	    else
		{
			System.out.println("Number is Zero ");
		}		
	}
}
