import java.util.*;
class SumAvg
{
	public static void main(String[] args)
	{
		int i=1,sum=0;
		float avg=0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number: ");
		int a=sc.nextInt();
		
		do
		{
			
				sum=sum+i;
				i++;
		}while(i<=a);
		avg=sum/a;
		System.out.println("Addition of number is : "+sum);
		System.out.println("Average of number is : "+avg);
	}
}