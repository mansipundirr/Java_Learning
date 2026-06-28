     /* Copy one array to another array */

import java.util.*;


public class arrayQ11 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        int arr1[] = new int[5];
        System.out.println("Enter array elements =");
        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = sc.nextInt();
        }
           arr1= Arrays.copyOf(arr, 5); // copy array one array to unother  array 
           
           for(int b : arr)
           {
            System.out.println("Data in array1 = "+ b);
           }
           System.out.println("Data in array2 = ");
    
     for(int i = 0; i < arr.length; i++)
        {
        
    System.out.println(arr1[i]+" ");
    
}
    }
}
