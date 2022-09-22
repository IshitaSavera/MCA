
import java.util.*;
public class OprationSwitch
{
	public static void main(String args[])
	{
		String sum,sub,mult,div;
    	Scanner sc=new Scanner(System.in);
    	System.out.print("Enter the value of a : ");
    	int a=sc.nextInt();
    	System.out.print("Enter the value of b : ");
    	int b=sc.nextInt();
    	
    	System.out.print("Choice any one in + , - , * , / ");
    	System.out.print("Enter Your Chosse  : ");
    	char ch=sc.next().charAt(0);
    	 
    	switch(ch)
    	{

    	case '+':
    		System.out.println("Addition = "+(a+b));
    	    break;
    	case '-':
    		System.out.println("Subtrection = "+(a-b));
    		break;
    	case '*':
    		System.out.println("Multiplication = "+(a*b));
    		break;
    	case '/':
    		System.out.println("Division = "+(a/b));
    		break;
    	}
    	
	}
}	