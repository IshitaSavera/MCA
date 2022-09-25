import java.util.*;
public class Leap_Year
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first value : ");
		int year = sc.nextInt();
		
		if(year %4 == 0 && year %100!= 0)
		{
			System.out.println("leap year"+year);
		}
		else
		{
			System.out.println("Not leap year"+year);
		}
	}
}