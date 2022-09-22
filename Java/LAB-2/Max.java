import java.util.*;
public class Max {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Value of a= ");
        int a=sc.nextInt();
        System.out.print("Enter Value of b= ");
        int b=sc.nextInt();
        System.out.print("Enter Value of c= ");
        int c=sc.nextInt();
         
         if(a>b)
         {
             if(a>c)
             {
                 System.out.print("  Max value is "+a); 
             }
             else
             {
                 System.out.print("Max value is"+c);  
             }
         }
         else
         {
             if(b>c)
             {
                 System.out.print("Max value is"+b); 
             }
             else
             {
                 System.out.print("Max value is"+c);  
             }
         }
    }
}