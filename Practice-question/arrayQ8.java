    /*assending order  */
import java.util.*;

public class arrayQ8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
    
        System.out.println("Enter the array elements :");
        for(int i = 0; i < 5; i++)
        {
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i < 5; i++)
        {
            for(int j = i + 1; j < arr.length; j++)
            {
                if(arr[i] > arr[j])
                {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
               
                 
            
        }
             System.out.println("Assending order " + arr[i] + " ");
        
            }
            

        //    for( int i = 0; i < 5; i++)
        //       {
            // System.out.println("Assending order " + arr[i]+ " ");
             
    }
}
    
        
    

