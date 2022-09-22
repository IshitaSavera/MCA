import java.util.*;

public class Factorial
{

    public static void main(String[] args) 
    {
        int i=1,fact=1;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int a = sc.nextInt();

        do
        {
            fact=fact*i;

            i++;

        }while(i<=a);
         System.out.println(fact);
    }
}
