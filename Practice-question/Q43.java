    /* Fibonacci series */
import java.util.*;
public class Q43 {
    
    public static void main(String[] args) {
        int a =0 ,  b = 1,c;
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i <= 5; i++)
        {
           System.out.print(a + " ");
           c = a+b;
           a = b;
           b = c;

        }


        
    }
}
