    /* Copy one array to another array */

import java.util.*;

public class arrayQ4 {
    public static void main(String[] args)
    {
        int arr1[] = new int[5];
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[6];
        
        System.out.print(" Enter array  elements =");


        for(int i = 0; i < 6; i++)
        {
            arr[i] =sc.nextInt();
        }
        System.out.println("array  First  elements =");

        for(int b : arr)
        {
            System.out.println("array elements = " + b);
        }
         System.out.println("array  Second elements =");
        for(int i = 0; i < 6; i++)
        {
          arr1[i] = arr[i];
           System.out.println("array elements = " + arr1[i]);

        }
         
        
    }
    
}
