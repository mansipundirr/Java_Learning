// Write your code here to check number is armstrong number or not 
import java.util.*;

public static void main(String[] args)
{   int i, r;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Number :");
    int num = sc.nextInt();
    int sum = 0;
   while(num > 0)
   {
        for( i = 100; i <= num; i++)
        {
        r = i % 10; 
        sum= sum + (r * r * r);
        i = i / 10;
        if(i == sum)
        {
            System.out.println("Number is armstrong");
        }
        else{
            System.out.println("Number is not armstrong");
        }  
    }

    }
 }
     
    
