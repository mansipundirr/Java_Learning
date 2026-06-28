
     /* Initialize and Print Array Elements */

import java.util.*; //
public class arrayQ1 {
    public static void main(String[] args)  // main method
    {
        Scanner sc = new Scanner(System.in); // scanner class object
       System.out.println("Enter the array size = "); 
        int size = sc.nextInt();    // array size input
        int arr[] =  new int[size]; // array declaration
        
        for(int i = 0; i < size ; i++ ) // array initialization
        {
         arr[i] = sc.nextInt();  // array value input
        }
          // for(int i = 0; i < size; i++ ) // array printing
          for( int b : arr) // for- each loop 
         {
            System.out.println(b + " " );



            

         }



    }
    
}
