     /* Compare Two Arrays */

import java.util.*;
import java.util.Arrays;

public class arrayQ12 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int arr1[] = new int[5];
         int arr2[] = new int[5];
        
        System.out.println("Enter the array1 = ");
         
        for(int i = 0; i < arr1.length; i++)
        {
           arr1[i] = sc.nextInt(); 
        }
         System.out.println("Enter the array2 = ");
        for(int i = 0; i < arr1.length; i++)
        {
           arr2[i] = sc.nextInt(); 
        }
    
       // if(arr1 == arr2) // compare the address or reference  
        if(Arrays.equals(arr1,arr2)) // comapre the array elements 
        {
         System.out.println("both array are equle");
        
        }
        else{
             System.out.println("both array are  not equle");
        }
        
        
    }
}

     

//  import java.util.*;
// import java.util.Arrays;

// public class arrayQ12 {
//     public static void main(String[] args)
//      {
//         int arr1[] = {10, 20, 30, 40, 50};
//         int arr2[] = {10, 20, 30, 40, 50};

//           if(arr1 == arr2)   // this logic compare the  address / reference compare 
//         if(Arrays.equals(arr1 , arr2)) // this logic compare the array elements  
//         {
//             System.out.println("both array are equle");
//         }
//         else{
//             System.out.println("both array are not  equle");
//         }

//      }
//     }