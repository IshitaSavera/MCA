
import java.util.*;
public class Opration
{
	public static void main(String args[])
	{
		
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter the value of a : ");
    	int a=sc.nextInt();
    	System.out.println("Enter the value of b : ");
    	int b=sc.nextInt();
    	
    	System.out.print("Choice any one in sum,sub,mult,div");
    	System.out.println("Enter Your Chosse  : ");
    	String c=sc.next();
    	 
    	if(c.equals("sum"))
    	{
    		System.out.print("Addition = "+(a+b));
    	}
    	else if(c.equals("sub"))
    	{
    		System.out.print("Subtrection = "+(a-b));
    	}
    	else if(c.equals("mult"))
    	{
    		System.out.print("Multiplication = "+(a*b));
    	}
    	else if(c.equals("div"))
    	{
    		System.out.print("Division = "+(a/b));
    	}
    	else
    	{
    		System.out.print("Invalid..");
    	}
	}
}	