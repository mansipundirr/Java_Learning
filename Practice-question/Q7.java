import java.util.*;

public class Q7 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        {
        System.out.println("Enter the value :");
        int num = sc.nextInt();
        int sum = 0;
        int i ;
        { 
            
            if(num % 2 == 0)
                {
                    for( i = 0; i <= num; i+=2) // i initialize because even number start from 0 and increment by 2 to skip the odd number and add only even number
                    {
                        sum = sum + i;
                    }
                System.out.println("Sum of even number = " + sum);
                }
        else {
            for( i = 1; i <= num; i+=2) // i initialize because odd number start from 1 and increment by 2 to skip the even number and add only odd number
            {
                sum = sum + i;
       
            }
            System.out.println("Sum of odd number = " + sum);
        } 
        //System.out.println("sum of even and odd number = " + sum);
        }
        

        }

        }
    }
    

