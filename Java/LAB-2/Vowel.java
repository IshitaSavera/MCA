
import java.util.*;
public class Vowel
{
	public static void main(String args[])
	{
		
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter the value of n : ");
    	char n=sc.next().charAt(0);
    	
    	if(n=='a'||n=='e'||n=='i'||n=='o'||n=='u'||n=='A'||n=='E'||n=='I'||n=='O'||n=='U')
    	{
    		System.out.println("Vowel");
    	}
    	else {
    		System.out.println("Consonat");
    	}
    }
}	