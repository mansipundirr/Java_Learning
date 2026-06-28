   /*Addition of two array */

import java.util.*;
public class arrayQ19 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
       
        int arr[][] = new int[2][2];
        int arr1[][] = new int[2][2];
        int arr3[][] = new int[2][2];
        int sum =0;
         System.out.print("Enter the Elements array 1st:");
        for(int i = 0; i < 2; i++)
        {
            for(int j = 0; j < 2; j++)
            {
                arr[i][j] = sc.nextInt();
            
            }  
        }
         System.out.print("Enter the Elements array 2nd:");
         for(int i = 0; i < 2; i++)
        {
            for(int j = 0; j < 2; j++)
            {
                arr1[i][j] = sc.nextInt();
            }
        }
         System.out.print( "First array data \n");
          for(int i = 0; i < 2; i++)
        {
            for(int j = 0; j < 2; j++)
        {
          System.out.println(arr[i][j]+" ");
        }
    }
     System.out.print( "Second array data \n");
      for(int i = 0; i < 2; i++)
        {
            for(int j = 0; j < 2; j++)
            {
                 System.out.println(arr1[i][j]+" ");
                
               }
        
       
            }
            System.out.print("Sum of two matrix \n");
            for(int i = 0; i < 2; i++)
             {
               for(int j = 0; j < 2; j++)
                 {
                      arr3[i][j] = arr[i][j] + arr1[i][j];
                 
                System.out.print(arr3[i][j]+" ");
                 }
             System.out.print("\n");
         }

      }
    }