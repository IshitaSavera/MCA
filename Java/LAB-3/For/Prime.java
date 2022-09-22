import java.util.*;
public class Prime
{
	public static void main (String args[])
	{
		int flag=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number :");
        int a=sc.nextInt();

        for (int i=2;i<=a-1;i++)
        {
        	
        	if(a%2==0)
        	{
        		flag=flag+1;

        	}
        }
        if(flag==0)
        {
            System.out.println("Number is Prime");
        }
        else
        {
        	System.out.println("Number is not prime");
        }
	}
}