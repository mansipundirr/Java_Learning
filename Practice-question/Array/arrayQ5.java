
      /* Sum of Array Elements */  

import java.util.*; //
public class arrayQ5 {
    public static void main(String[] args)  // main method
    {
        int sum = 0;
        Scanner sc = new Scanner(System.in); // scanner class object
       System.out.println("Enter the array size = "); 
        int size = sc.nextInt();    // array size input
        int arr[] =  new int[size]; // array declaration
        
        for(int i = 0; i < size ; i++ ) // array initialization
        {
            
         arr[i] = sc.nextInt();  // array value input
        
        }
       

            System.out.println("Array elements are : "); // print array elements 
          for( int b : arr) // for- each loop 
         {
             System.out.println(b + " " );
           
            sum = sum + b; // sum of array elements
            

         }
         System.out.println("Sum of array elements = " + sum); // print sum
          

    }
    
}

