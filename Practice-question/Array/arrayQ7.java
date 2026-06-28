    /* Calculate sum and average of array elements */

import java.util.*;
public class arrayQ7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        int sum = 0;
        System.out.println("Enter the array elements :");
        for(int i = 0; i < 5; i++)
        {
          

            arr[i] = sc.nextInt();
           
        }
        for(int b : arr)
        {
            System.out.println("array elements :" + b);


            sum = sum + b;
        }
         System.out.println("sum =  " + sum);

             double average = sum / 5.0;
            System.out.println("average = " + average);
        
    }
    }

    

