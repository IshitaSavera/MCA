import java.util.*;
public class SumAvg
{
	public static void main(String args[])
	{
		int i=1,sum=0,avg=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int n=sc.nextInt();
		while(i<=n)
		{
			sum=sum+i;
			
            i++;
		}
		avg=sum/n;
           
		 System.out.println("Sum :"+sum);
         System.out.println("Avg :"+avg);
	}
}