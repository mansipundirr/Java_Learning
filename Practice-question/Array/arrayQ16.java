          /* Delete item in array  */
import java.util.*;
public class arrayQ16 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array size : ");
        int size = sc.nextInt();
        System.out.print("Enter the array elements : ");;
        int arr[] = new int[size];
        for(int i = 0; i < size; i++)
        {
            arr[i] = sc.nextInt();
        }
          System.out.print("Enter the location : ");
          int loc = sc.nextInt();
          for(int i = loc; i < size - 1 ; i++)
          {
            arr[i] = arr[i + 1];
          }
          size--;
         for(int i = 0; i < size; i++)
            
            {
                  System.out.println("New array : " + arr[i]);
            }
    }
    
}
