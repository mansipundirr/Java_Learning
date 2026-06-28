   /* Search an Element in Array */

import java.util.*;

public class arrayQ6 {
    public static void main(String[] args)
    {
        int count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size= ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = sc.nextInt();
        }
       for(int b : arr)
        {
            
            System.out.println("Array Element : " + b);

        }
  
        System.out.println("Enter the searching number : ");
            int n  = sc.nextInt();
             for(int i = 0; i < arr.length; i++)
             {
                if(arr[i] == n)
                {
                    count++;
        
        }
    }
        if(count > 0)
        {
            System.out.println("Element found");
        }
        else
        {
            System.out.println("Element not found");
        }

    
    }
}

