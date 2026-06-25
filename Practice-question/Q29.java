            /* Swap two number using third variable  */

import java.util.*;

public class Q29 {
    
    public static void main(String[] args)
    {  
        int temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n1 = "); // 10
        int n1 = sc.nextInt();
        System.out.println("Enter the n2 = "); // 20
        int n2 = sc.nextInt();
        System.out.println("Before Swapping = "+ n1 +" -- " + n2);
    
         
         temp = n1;  // temp = 10
         n1 = n2; // n1 = 20 
         n2 = temp;   // n2 = 10
         System.out.println("Aftet Swapping = "  + n1 + " -- " + n2);
    }
}