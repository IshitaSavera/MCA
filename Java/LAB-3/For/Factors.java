import java.util.*;

public class Factors
{

    public static void main(String[] args) 
    {
        int i;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int a = sc.nextInt();

        for (i=1;i<=a;i++)
        {
            if(a%i==0)
                System.out.println(i);
        }
    }
}