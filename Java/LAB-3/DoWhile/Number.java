import java.util.*;
public class Number
{
	public static void main(String args[])
	{
		int i=1;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int a=sc.nextInt();
		do
		{
            System.out.println(i);
            i++;
		}while(i<=a);
	}
}