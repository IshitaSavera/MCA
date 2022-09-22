import java.util.*;
public class PrimeLimet
{
	public static void main(String args[])
	{
        int n,i;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the First Number n1: ");
		int n1=sc.nextInt();
		System.out.print("Enter the Second Number n2: ");
		int n2=sc.nextInt();
		for (n=n1;n<=n2;n++)
	    {
	        int flag=0;
	    	for (i=2;i<=n-1;i++) 
	    	{
	    		if(n%i==0)
		     	{
 			     	flag=flag+1;
		     	}
	    	}
	    	if(flag==0)
	    	{
 				System.out.println(n);
	    	}
			
		}
		
	    
	}
}