import java.util.*;
public class Factorial
{
	public static void main(String args[])
	{
		int fact=1,i=1;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int a=sc.nextInt();
		while(i<=a)
		{
			fact=fact*i;
            
            i++;
		}
		System.out.println(fact);
	}
}