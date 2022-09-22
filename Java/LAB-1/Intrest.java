import java.util.*;

class Intrest
{
    
	public static void main(String[] args)

        {
        
              Scanner sc=new Scanner(System.in);

              System.out.print("Enter value of p=");
      
              int p=sc.nextInt();
 
              System.out.print("Enter value of r=");
 
              int r=sc.nextInt();
        
              System.out.print("Enter value of n=");
        
              int n=sc.nextInt();
        
              System.out.println("Simple intrest is  = "+((p*r*n)/100));
    
        }

}