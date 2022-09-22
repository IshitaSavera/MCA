import java.util.*;

class FandC 
{
    
	public static void main(String[] args)
        {
        
		Scanner sc=new Scanner(System.in);
        
		System.out.println("Enter value of c=");
 
                double c=sc.nextDouble();

                double f;
        
                f=1.8*c+32;
        
		System.out.println("Enter value of f="+f);
        
		c=((f-32)/1.8);
        
		System.out.println("value of c="+c);
    
	}

}