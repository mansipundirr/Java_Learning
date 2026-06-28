    /* Print Array Elements */

import java.util.*;

public class arrayq3 {
    public static void main(String[] args)
    {     
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size = ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i = 0; i < size; i++)
        {
            arr[i] = sc.nextInt();
        }
        for(int b : arr)
            {
          System.out.println("array elements = "+b);
           

        }
        System.out.println("Array length = "+arr.length);
        for(int i = size - 1; i >= 0; i--)
        {
            System.out.println("Reverse = " +arr[i]);
           
        }



    }
}
