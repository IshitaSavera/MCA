import java.util.*;
public class Prime
{
	public static void main (String args[])
	{
		int flag=0,i=2;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number :");
        int a=sc.nextInt();

        
        while(i<=a-1)    
        {
        	
        	if(a%2==0)
        	{
        		flag=flag+1;
                
        	}
            i++;
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