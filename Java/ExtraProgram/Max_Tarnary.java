import java.util.*;
public class Max_Tarnary
{
    public static void main(String[] args) 
    {
        int ans=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Value of a= ");
        int a=sc.nextInt();
        System.out.print("Enter Value of b= ");
        int b=sc.nextInt();
        System.out.print("Enter Value of c= ");
        int c=sc.nextInt();
         
         ans=((a>b && a>c) ? a :(b>c ? b:c));

        System.out.println("Answer :"+ans); 
         
         
    }
}