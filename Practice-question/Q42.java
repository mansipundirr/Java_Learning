         /* Find the factor of number but not print the value divisible by the number itself */

import java.util.*;

public class Q42 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
         System.out.println("Enter the valur= ");
        int num = sc.nextInt();
        for(int i = 1; i <= num; i++)
        {
            if(num % i == 0 )
            {
                if(num == i)
                    {    
                        continue;

                }
                System.out.println("Perfect factor = " + i);
                
            }
                
            

            }
        }
    }
    

