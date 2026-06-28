import java.util.*;
public class arrayQ17 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size:");
        int size = sc.nextInt();
        System.out.println("Enter the array elements:");
        int arr[][] = new int[size][size];
       for(int i = 0; i < size; i++)
       {
            for(int j = 0; j < size; j++)
            {
             arr[i][j] = sc.nextInt();
       }
    }
        System.out.print("Matrix: \n ");
          for(int i = 0; i < size; i++)
             {
       
               for(int j = 0; j < size; j++)
                 {
      
                  System.out.print(arr[i][j]+" ");
           }
        
             System.out.print("\n ");
       
       
       
          }
       


        }

    
     }