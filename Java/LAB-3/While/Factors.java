import java.util.*;
public class Factors
{
	public static void main(String args[])
	{
		int i=1;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int a=sc.nextInt();
		while(i<=a)
		{
            if(a%i==0)
            {
            	System.out.println(i);

            }
            i++;
		}
	}
}