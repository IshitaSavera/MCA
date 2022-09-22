import java.util.*;
public class OddEven {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Value of a= ");
        int a=sc.nextInt();
         if(a%2==0)
         {
             System.out.println("a is Even");
         }
         else
         {
             System.out.println("a is Odd");
         }
    }
}