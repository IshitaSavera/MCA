import java.util.*;
public class Calculator
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first value : ");
		int a = sc.nextInt();
		System.out.print("Enter the second value : ");
		int b = sc.nextInt();

		System.out.println("Enter your choice in + , - , / , * ");
		System.out.print("Enter your choice : ");
		char ch = sc.next().charAt(0);

		switch(ch)
		{
		    case '+':
		    	System.out.println("Addition : "+(a+b));
		    	break;
		    case '-':
		    	System.out.println("Subtrection : "+(a-b));
		    	break;
			case '*':
		    	System.out.println("Multiplication : "+(a*b));
		    	break;
		    case '/':
		    	System.out.println("Division : "+(a/b));	
		    	break;		
		}

	}
}