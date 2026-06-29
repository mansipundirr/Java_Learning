
      /* Tribonacci series */
import java.util.*;

public class Q44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0, b = 1, c = 2, d;
         System.out.println("Enter the number :");
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++)
        {
          System.out.print(a + " ");
          d = a + b + c;
          a = b;
          b = c;
          c = d;
        }
    }    
            
        
    }
    

