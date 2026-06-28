       /* Insert the new element in the array  */

import java.util.*;

public class arrayQ15 {
    public static void main(String[] args)
    {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the array size =");
    int size = sc.nextInt();
    int arr[] = new int[size];
     System.out.println("Enter the array elements =");
    for(int i = 0; i < arr.length; i++)
    {
       arr[i] = sc.nextInt();
    }
     System.out.println("Enter the array location =");
     int loc = sc.nextInt();

      System.out.println("Enter the new item=");
      int item = sc.nextInt();

    for(int i = size; i > loc; i-- )  // this loop is used to make array position empty
    {
        arr[i] = arr[i-1];

    }

    arr[loc] = item;
       size++;

    for(int b : arr)
    {
         System.out.println("New array =" + b);
    }
    
}
}