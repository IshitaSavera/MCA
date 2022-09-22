import java.util.*;
class Grade {
    public static void main(String[] args) {
        
        int total,avg;
       
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Marks of Maths= ");
        int s1=sc.nextInt();
        System.out.print("Enter Marks of English= ");
        int s2=sc.nextInt();
        System.out.print("Enter Marks of Science= ");
        int s3=sc.nextInt();
        
        total=s1+s2+s3;
        avg=total/3;
        
        System.out.println("Total Marks = "+total);
        System.out.println("Avg of Marks = "+avg);
        if(avg<100 && avg>80)  
        {
            System.out.println("Distinction"); 
        }
        else if(avg<79 && avg>60)
        {
            System.out.println(" First Class"); 
        }
        else if(avg<59 && avg>40)
        {
            System.out.println(" Second Class"); 
        }
        else if(avg<40)
        {
            System.out.println("Fail"); 
        }
    }
}