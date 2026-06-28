        /* Mirror of a 2D Array */

import java.util.Scanner;
public class arrayQ21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        int arr[][] = new int[2][2];

        // Taking input from user
        System.out.println("Enter the elements of array : ");
        for(int i=0; i<2; i++)
        {
            for(int j=0; j<2; j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
        // Displaying the original array
        System.out.println("Array Matrix : ");
        for(int i=0; i<2; i++)
        {
            for(int j=0; j<2; j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        // Displaying the mirror of the array
    
    System.out.println("Mirror Matrix : ");
        for(int i=0; i<2; i++)
        {
            for(int j=1; j>=0; j--) //
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    
}
}
