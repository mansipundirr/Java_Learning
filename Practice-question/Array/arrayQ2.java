     /* Display Array Elements */

import java.util.*;

public class arrayQ2 {
    public static void main(String[] args)
    {
        
        String  arr[] = {"mansi" , "payal", "riya" ,"shikha"};
        System.out.println("toString()" + Arrays.toString(arr));
         System.out.println("asList()" + Arrays.asList(arr));
         int ar[][] = {{10,20},{30,40}}; 
          System.out.println("deepToString()" + Arrays.deepToString(ar)); 
    }
    
    
}
