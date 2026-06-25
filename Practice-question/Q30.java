            /* Swap two number without third variable */

import java.util.*;

public class Q30 {
    
    public static void main(String[] args)
    {  
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n1 = "); // 10
        int n1 = sc.nextInt();
        System.out.println("Enter the n2 = "); // 20
        int n2 = sc.nextInt();
        System.out.println("Before Swapping = "+ n1 +" -- " + n2);
    
    
        n1 = n1 + n2; // n1 = 10 + 20 = 30 // so now n1 = 30
        n2 = n1 - n2; // n2 = 30 - 20   // so now n2 = 10
        n1 = n1 - n2; // n1 = 30 - 10   // so now n1 = 20

         System.out.println("After Swapping = "  + n1 + " -- " + n2);
    }
}