     /* Compare Two Arrays */

import java.util.*;


public class arrayQ10 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        System.out.print("Enter the Array Elements = ");
        for(int i = 0; i < arr.length; i++)
        {
           arr[i] = sc.nextInt(); 
        }
        int arr2[] = new int[5];
        System.out.print("Enter the Array Elements = ");
        for(int i = 0; i < arr2.length; i++)
        {
           arr2[i] = sc.nextInt(); 
        }
         //Arrays.sort(arr); // sorting the array in ascending order
         boolean b =Arrays.equals(arr, arr2); // comparing the two arrays
    
       
            System.out.println("what is the both array equal = " + b);
           
         }
    }
    

