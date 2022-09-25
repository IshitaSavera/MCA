import java.util.*;
public class Triangle
{
    public static void main(String[] args) 
    {
        int sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Value of a= ");
        int a=sc.nextInt();
        System.out.print("Enter Value of b= ");
        int b=sc.nextInt();
        System.out.print("Enter Value of c= ");
        int c=sc.nextInt();
         
        sum=a+b+c; 
        if(sum==180 && a!=0 && b!==0 && c!=0)
        {
            System.out.println("Triangle is valid");
        }
        else
        {
            System.out.println("Triangle is not valid");   
        }
        
         
    }
}