import java.util.*;
public class Number
{
	public static void main(String args[])
	{
		int i=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int a=sc.nextInt();
		while(i<=a)
		{
            System.out.println(i);
            i++;
		}
	}
}