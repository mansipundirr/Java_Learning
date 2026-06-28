    /* Sort Array in Descending Order */

import java.util.*;

public class arrayQ9 {
    public static void main(String[] args)
    {     
        int temp = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array size = ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i = 0; i < size; i++)
        {
            arr[i] = sc.nextInt();

        }
        for(int i = 0; i < size; i++)
        {
            for(int j = i+1; j < size; j++)
            {
              if(arr[i] < arr[j])
              {
                  temp = arr[i];
                  arr[i] = arr[j];
                  arr[j] = temp;
              }
            }
        

        System.out.println("Desending order " + arr[i]);
    }
    
}
}