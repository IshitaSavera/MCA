
import java.util.*;
public class Divisable
{
	public static void main(String args[])
	{
		
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter the value of a : ");
    	int a=sc.nextInt();
    	if(a%7==0 && a%3!=0)
    	{
    		System.out.println("Divisable...");
    	}
    	else
    	{
    		System.out.println("Not Divisable...");
    	}

    }
}	