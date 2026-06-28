        /* Find the Smallest array */

import java.util.*;

public class arrayQ14 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        
        
        System.out.println("Enter the array = ");
         
        for(int i = 0; i < arr.length; i++)
        {
           arr[i] = sc.nextInt(); 
        }
           int  Mini = arr[0];
         for(int i = 1; i < arr.length; i++)
         {
            if(arr[i] < Mini )
            {
                Mini = arr[i];
            }
        }
                System.out.println("Minimum Element " + Mini);
            


        }
    }
